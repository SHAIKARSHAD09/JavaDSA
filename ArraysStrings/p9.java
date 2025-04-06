package ArraysStrings;

import java.util.*;
//Missing Number 
public class p9 {
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
    
    public static int Solution(int[] arr, int n) {
        Arrays.sort(arr);
        
        
        for(int i=0; i<n; i++){
          if(arr[i] != i){
            return i;
          }
        }
        return n;
    }

    public static int Solution2(int[] nums) { //TotalSum - ArraySum
        Arrays.sort(nums);
        int n = nums.length;
        int s = n * (n+1)/2;
        int sum = 0;

        for(int i=0; i<n; i++){
            sum += nums[i];
        }
        return s-sum;
    }
}

