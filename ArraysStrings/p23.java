package ArraysStrings;

import java.util.*;
/*for k = 2 input = 11(n)
2(k)
1 2 2 3  output = 7  k =distinct elements */ 
public class p23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = Kadane(arr, k, n);
        System.out.println(res);
    }

    public static int Kadane(int[] arr, int k, int n) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int start = 0;
        int currSum = 0;
        int maxSum = 0;

        for (int end = 0; end < n; end++) {
            // Add the current element to the frequency map and to the current sum
            freqMap.put(arr[end], freqMap.getOrDefault(arr[end], 0) + 1);
            currSum += arr[end];

            // If the number of distinct elements exceeds 'k', shrink the window
            while (freqMap.size() > k) {
                freqMap.put(arr[start], freqMap.get(arr[start]) - 1);
                if (freqMap.get(arr[start]) == 0) {
                    freqMap.remove(arr[start]);
                }
                currSum -= arr[start];
                start++;
            }

            // Update the maximum sum
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}