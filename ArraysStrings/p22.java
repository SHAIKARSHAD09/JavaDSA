package ArraysStrings;

import java.util.*;

public class p22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void divide(int[] arr, int first, int last) {
        if (first >= last) return; // Corrected base case
        int mid = first + (last - first) / 2;
        divide(arr, first, mid);
        divide(arr, mid + 1, last);
        conquer(arr, first, mid, last);
    }

    public static void conquer(int[] arr, int first, int mid, int last) {
        int[] merge = new int[last - first + 1];
        int id1 = first;
        int id2 = mid + 1;
        int x = 0;

        // Compare elements from both halves
        while (id1 <= mid && id2 <= last) {
            if (arr[id1] <= arr[id2]) {
                merge[x++] = arr[id1++];
            } else {
                merge[x++] = arr[id2++];
            }
        }

        // Copy remaining elements from the left half
        while (id1 <= mid) {
            merge[x++] = arr[id1++];
        }

        // Copy remaining elements from the right half
        while (id2 <= last) {
            merge[x++] = arr[id2++];
        }

        // Copy the merged elements back to the original array
        for (int i = 0; i < merge.length; i++) {
            arr[first + i] = merge[i]; // Copy to the correct portion of the array
        }
    }
}