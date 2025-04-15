package Greedy;
 

// Jump Game Problem


public class p10 {
    public static void main(String[] args) {
        
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums)); // Output: true
    }

    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int maxReach = 0;
        for(int i=0; i<n; i++){
            if(i>maxReach) return false;
            maxReach = Math.max(maxReach, i+nums[i]);
        }

        return true;
    }
}


class Solution {
    public int jump(int[] nums) {
        int jumps = 0, currentEnd = 0, farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }
}
//minimum number of jumps to reach the end of the array 