package ArraysStrings;

import java.util.*;
//Maximum value of |arr[i]-arr[j]|+|i-j|
public class p19 {  //input= 4, 1 2 3 1 output = 4
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
      int maxi = 0;
      for(int i=0; i<n; i++){
        for(int j=i; j<n; j++){
          int sum = 0;
          sum = sum + Math.abs(arr[i]-arr[j])+Math.abs(i-j);
          maxi = Math.max(sum, maxi);
        }
      }
      return maxi;
      
    }
  
  
}