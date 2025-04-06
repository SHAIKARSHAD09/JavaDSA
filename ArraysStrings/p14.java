package ArraysStrings;

import java.util.*;
//Union of two arrays
public class p14 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] arr1 = new int[n];
      
        for(int i=0; i<n; i++){
          arr1[i] = sc.nextInt();
        }
        
      int[] arr2 = new int[m];
      
        for(int i=0; i<m; i++){
          arr2[i] = sc.nextInt();
        }
      
      
      int res = Solution(arr1, arr2);
      System.out.println((res));

  }
  
  public static int Solution(int[] arr1, int[]arr2) {
    Set<Integer> set = new HashSet<>();
    
    for(int i=0; i<arr1.length; i++){
      set.add(arr1[i]);
    }
    
    for(int i=0; i<arr2.length; i++){
      set.add(arr2[i]);
    }
    
    return set.size();
    
    
    
    
  }
  
}  
