package ArraysStrings;

import java.util.*;

public class p6 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      int k = 1;
      int[] res = Solution(arr, k);
      System.out.println(Arrays.toString(res));
      
    }
    
    public static int[] Solution(int[] arr, int k) {
      int a = -1;
      int b = -1;
        int n = arr.length;
        for(int i=0; i<n; i++){
          if(arr[i] == k){
            a = i;
            break;
          }
        }
        
        for(int i=n-1; i>=0; i--){
          if(arr[i] == k){
            b = i;
            break;
          }
        }
        
        return new int[] {a,b};
    }
}
