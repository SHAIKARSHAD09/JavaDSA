package ArraysStrings;

import java.util.*;

public class p10 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
          arr[i] = sc.nextInt();
        }
        
        int res[] = Solution(arr, n);
        reverseArray(res);
        System.out.println(Arrays.toString(res));
      
      
    }
    
    public static int[] Solution(int[] arr, int n) {
      List<Integer> leaders = new ArrayList<>();
        int maxFromRight = arr[n - 1]; // Rightmost element is always a leader
        leaders.add(maxFromRight);
        
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }
        
        // Convert list to array
        return leaders.stream().mapToInt(i->i).toArray();


    }
    
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}
