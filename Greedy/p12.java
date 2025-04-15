package Greedy;

import java.util.Arrays;

class p12 {
    public static int averageWaitingTime(int[] bt) {
        Arrays.sort(bt);  // Greedy: shortest job first

        int n = bt.length;
        int totalWaitingTime = 0;
        int waitingTime = 0;

        for (int i = 1; i < n; i++) {
            waitingTime += bt[i - 1];          // cumulative wait for current process
            totalWaitingTime += waitingTime;   // add to total
        }

        return totalWaitingTime / n;  // average waiting time
    }

    public static void main(String[] args) {
        

        int[] bt1 = {4, 1, 3, 7, 2};
        System.out.println("Output: " + averageWaitingTime(bt1));  // 4

        int[] bt2 = {1, 2, 3, 4};
        System.out.println("Output: " + averageWaitingTime(bt2));  // 2
    }
}
