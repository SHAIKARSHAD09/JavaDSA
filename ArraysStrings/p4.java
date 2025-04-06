package ArraysStrings;

import java.util.*; //LinearSearch

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
          arr[i] = sc.nextInt();
        }
        int k = 4;
        System.out.println(Solution(arr, k)); // Now this works correctly
    }
    
    public static int Solution(int[]arr, int k) {
        for(int i=0; i<arr.length; i++){
          if(arr[i] == k){
            return i;
          }
        }
        
        return -1;
    }

    public static int Solution2(int[] arr, int k) {                             //Binary Search
        Arrays.sort(arr); // Binary search needs sorted input

        int first = 0, last = arr.length - 1;

        while (first <= last) { // Correct binary search loop
            int mid = first + (last - first) / 2; // Proper mid calculation

            if (arr[mid] == k) {
                return mid; // Found the element
            } else if (arr[mid] < k) {
                first = mid + 1; // Move right
            } else {
                last = mid - 1; // Move left
            }
        }

        return -1; // Element not found
    }

}