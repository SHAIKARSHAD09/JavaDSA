package Greedy;


import java.util.Arrays;

public class p8{
    public static int findMinPlatforms(int[] arrival, int[] departure) {
        int n = arrival.length;
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int platforms = 1, maxPlatforms = 1;
        int i = 1, j = 0;

        while (i < n && j < n) {
            if (arrival[i] <= departure[j]) {
                platforms++; // more platforms needed
                i++;
            } else {
                platforms--; // train left, free a platform
                j++;
            }
            maxPlatforms = Math.max(maxPlatforms, platforms);
        }

        return maxPlatforms;
    }

    public static void main(String[] args) {
        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

        System.out.println("Minimum number of platforms required = " + findMinPlatforms(arrival, departure));
    }
}
