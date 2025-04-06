package ArraysStrings;

import java.util.*;
//maximum XOR SUM
public class p16 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      
      int res = Solution(arr, n , k);
      System.out.println(res);
    }
    
    public static int Solution(int[] arr, int n, int k){
      
      int maxi_sum = 0;
      
      
      for(int i=0; i<k; i++){
        int sum = 0;
        for(int j=0; j<n; j++){
          sum += (i^arr[j]);
        }
        
        maxi_sum = Math.max(maxi_sum, sum);
      }
      
      return maxi_sum;
      
    }
  
  
}