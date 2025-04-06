package ArraysStrings;

import java.util.*;
//Maximum SubArray Sum
public class p5{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      
      int res = Solution(arr, n);
      System.out.println(res);
      
    }
    
    public static int Solution(int[] arr, int n){
      
      if(n==1){
        return arr[0];
      }
      int maxi = Integer.MIN_VALUE;;
      int curr = 0;
      int res = 0;
      for(int i=0; i<n-1; i++){
        curr = arr[i];
        for(int j=i+1; j<n; j++){
          curr = curr + arr[j]; //9
          maxi = Math.max(curr, maxi);
        }
      }
      
      return maxi;
    }

    public static int Solution2(int[] arr, int n) {
        int currSum = arr[0];
        int maxi = arr[0];
    
        for (int i = 1; i < n; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]); // -2 1 6
            maxi = Math.max(maxi, currSum); // 2 2 6
        }
    
        return maxi;
}}