package ArraysStrings;

import java.util.*;

public class p7 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      
      int res = Solution(arr);
      System.out.println(res);
      
    }
    
    
    public static int Solution(int[] arr) {
        int n = arr.length;
        int maxi = arr[0];
        for(int i=1; i<n; i++){
            maxi = Math.max(maxi, arr[i]);
        }

        for(int i=0; i<n; i++){
            if(arr[i] == maxi){
                return i;
            }
        }
        return 0;
    }


}


// import java.util.HashMap;

// class Solution {
//     public int peakIndexInMountainArray(int[] arr) {
//         int n = arr.length;
//         HashMap<Integer, Integer> map = new HashMap<>();

//         // Populate the HashMap with the element as the key and its index as the value
//         for (int i = 0; i < n; i++) {
//             map.put(arr[i], i);
//         }

//         // Find the maximum value in the array
//         int maxi = Integer.MIN_VALUE;
//         for (int num : arr) {
//             maxi = Math.max(maxi, num);
//         }

//         // Return the index of the maximum value using the HashMap
//         return map.get(maxi);
//     }
// }