package ArraysStrings;

import java.util.*;
//RainWater Trapped Problem  logic= Min(leftArrayMax, RightArrayMax), Array-Min then Sum
public class p20 {
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
  
  public static int Solution(int[] arr){
    int n = arr.length;
    
    int[] right = new int[n];
    int[] left = new int[n];
    right[0] = arr[0];
    for(int i=1; i<n; i++){
      right[i] = Math.max(arr[i], right[i-1]);
    }
    left[n-1] = arr[n-1];
    for(int i=n-2; i>=0; i--){
      left[i] = Math.max(arr[i], left[i+1]);
    }
    int[] mina = new int[n];
    for(int i=0; i<n; i++){
      mina[i]= Math.min(left[i], right[i]); 
    }
    int sum = 0;
    for(int i=0; i<n; i++){
        sum += mina[i]-arr[i]; 
    }
    
    return sum;
  }
}