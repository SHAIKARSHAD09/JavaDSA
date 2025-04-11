package Greedy;

import java.util.*;
//Job Scheduling  Problem
public class p3{

    // Helper class to pair job details
    static class Job {
        String id;
        int deadline;
        int profit;

        Job(String id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void jobScheduling(String[] jobIds, int[] deadlines, int[] profits) {
        int n = jobIds.length;
        Job[] jobs = new Job[n];

        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(jobIds[i], deadlines[i], profits[i]);
        }

        // Sort jobs by profit descending
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // Find max deadline
        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        String[] schedule = new String[maxDeadline + 1]; // 1-based index
        Arrays.fill(schedule, null);

        int totalProfit = 0;
        int jobCount = 0;

        for (Job job : jobs) {
            for (int t = job.deadline; t > 0; t--) {
                if (schedule[t] == null) {
                    schedule[t] = job.id;
                    totalProfit += job.profit;
                    jobCount++;
                    break;
                }
            }
        }

        System.out.println("Scheduled Jobs:");
        for (int i = 1; i <= maxDeadline; i++) {
            if (schedule[i] != null) {
                System.out.print(schedule[i] + " ");
            }
        }

        System.out.println("\nTotal Profit: " + totalProfit);
        System.out.println("Total Jobs Scheduled: " + jobCount);
    }

    public static void main(String[] args) {
        String[] jobIds = {"A", "B", "C", "D", "E"};
        int[] deadlines = {2, 1, 2, 1, 3};
        int[] profits = {100, 19, 27, 25, 15};

        jobScheduling(jobIds, deadlines, profits);
    }
}
