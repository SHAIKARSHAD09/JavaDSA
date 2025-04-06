package ArraysStrings;

import java.util.*;
//kth smallest element
public class p13 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int[] arr = new int[n];
      
        for(int i=0; i<n; i++){
          arr[i] = sc.nextInt();
        }
      int k = 4;
      
      int res = Solution(arr, k);
      System.out.println((res));

  }
  
  public static int Solution(int[] arr,int k) {
    Arrays.sort(arr);
    int n= arr.length;
    for(int i=0; i<n; i++){
      return arr[k-1];
    }
    return 0;
    
    
    
    
  }
  
}  
