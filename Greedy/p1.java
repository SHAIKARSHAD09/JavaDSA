package Greedy;

import java.util.*; 
// Activity Selection Problem
// Given a set of activities, each with a start and finish time, the goal is to select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time.
public class p1
{
	public static void main(String[] args) {
		int[][] intervals = {
            {1, 3},
            {2, 5},
            {0, 6},
            {5, 7},
            {8, 9},
            {5, 9}
        };
        
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1],b[1]));
        
        int count = 1;
        int lastEnd = intervals[0][1];
        System.out.println(intervals[0][0] + intervals[0][1]);
        
        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0] >= lastEnd){
                System.out.println(intervals[i][0] + " " + intervals[i][1]);
                lastEnd = intervals[i][1];
                count++;
            }
        }
        
        System.out.println(count);
	}
	
}

class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    class Activity{
        int start, end;
    
        Activity(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
    public int maxMeetings(int start[], int end[]) {
        int n = start.length;
        List<Activity> activities = new ArrayList<>();
        
       for(int i=0; i<n; i++){
           activities.add(new Activity(start[i], end[i]));
       }
       activities.sort((a,b) -> a.end - b.end);
       int count = 1;
       int lastend = activities.get(0).end;
       for(int i=1; i<n; i++){
           if(activities.get(i).start > lastend){
               count++;
           
               lastend = activities.get(i).end;
           }
       }
       
       return count;
    }
}
