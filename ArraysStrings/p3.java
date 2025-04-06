package ArraysStrings;

import java.util.*;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        System.out.println(Solution(str)); // Now this works correctly
    }
    
    public static String Solution(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr); // Convert the sorted array back to a string
    }
}