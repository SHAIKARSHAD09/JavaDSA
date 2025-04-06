package ArraysStrings;

import java.util.*;
//rotate matrix by 90deg
public class p15 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int m = sc.nextInt();
      int n = sc.nextInt();
      int[][] arr = new int[m][n];
      for(int i = 0; i<m; i++){
        for(int j=0; j<n; j++){
          arr[i][j] = sc.nextInt();
        }
      }
      
      int[][] res = Solution(arr, n, m);
      for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }

  }
  
  public static int[][] Solution(int[][] arr, int m, int n){
    int[][] t = new int[m][n];
    
      for(int i=0; i<m; i++){
        for(int j=n-1; j>=0; j--){
          t[i][j] = arr[j][i];
        }
      }
        
      reverse(t,m,n);
      return t;
    
      
  }
  
  public static void reverse(int[][] arr, int m, int n){
    for(int i=0; i<m; i++){
      int first = 0;
      int last = n-1;
      while(first<=last){
        int temp = arr[i][first];
        arr[i][first] = arr[i][last];
        arr[i][last] = temp;
        first++;
        last--;
      }
    }
  }
}  


// public static int[][] Solution2(int[][] arr, int m, int n) { // n x n matrix  //without extra matrix
//     for (int i = 0; i < m; i++) {
//         for (int j = i + 1; j < n; j++) {
//             // Swap arr[i][j] and arr[j][i]
//             int temp = arr[i][j];
//             arr[i][j] = arr[j][i];
//             arr[j][i] = temp;
//         }
//     }
//     return arr;
// }