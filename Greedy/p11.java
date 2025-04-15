package Greedy;
import java.util.*;
//Overlapping intervals Problem
 public class p11 {
    public static int eraseOverlapIntervals(int[][] intervals) {
        List<A> list = new ArrayList<>();
        int n = intervals.length;
        for(int i=0; i<n; i++){
            list.add( new A(intervals[i][0], intervals[i][1]));
        }

        list.sort((a,b) -> Integer.compare(a.end, b.end));
        int lastend = list.get(0).end;
        int count = 0;
        for(int i=1; i<n; i++){
            if(lastend> list.get(i).start){
                count++;
            }else{
                lastend = list.get(i).end;
            }
        }

        return count;
    }

    static class A{
        int start, end;
        A(int s, int e){
            this.start = s;
            this.end = e;
        }
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(intervals)); // Output: 1
    }
}

// import java.util.*;

// class Solution {
//     public int eraseOverlapIntervals(int[][] intervals) {
//         int n = intervals.length;
//         if (n == 0) return 0;

//         // Sort intervals by end time
//         Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

//         int count = 0;
//         int prevEnd = intervals[0][1];

//         for (int i = 1; i < n; i++) {
//             // If current interval overlaps with the previous, remove it
//             if (intervals[i][0] < prevEnd) {
//                 count++;
//             } else {
//                 prevEnd = intervals[i][1]; // Update end time of last included interval
//             }
//         }

//         return count;
//     }
// }
