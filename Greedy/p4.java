package Greedy;

import java.util.*;
// Job Sequencing Problem
class Job {
    int id, deadline, profit;

    Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class p4 {
    public static void main(String[] args) {
        Job[] jobs = {
            new Job(1, 4, 20),
            new Job(2, 1, 10),
            new Job(3, 1, 40),
            new Job(4, 1, 30)
        };

        jobSequencing(jobs);
    }

    static void jobSequencing(Job[] jobs) {
        // Sort jobs by decreasing profit
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // Find max deadline to define slot size
        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        int[] result = new int[maxDeadline + 1]; // index 0 unused
        Arrays.fill(result, -1);

        int countJobs = 0, totalProfit = 0;

        for (Job job : jobs) {
            // Find a free slot from job.deadline to 1
            for (int j = job.deadline; j > 0; j--) {
                if (result[j] == -1) {
                    result[j] = job.id;
                    countJobs++;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        System.out.println("Total Jobs Done: " + countJobs);
        System.out.println("Total Profit: " + totalProfit);
        System.out.print("Jobs Scheduled: ");
        for (int i = 1; i <= maxDeadline; i++) {
            if (result[i] != -1)
                System.out.print(result[i] + " ");
        }
    }
}

/////