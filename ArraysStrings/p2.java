package ArraysStrings;
import java.util.*;
//count Distinct SubStrings  input:ababa output:9
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = Solution(str);
        System.out.println(result);
    }
    
    public static int Solution(String str){
        HashSet<String> set = new HashSet<>();
   
        for(int i=0; i<str.length(); i++){
          for(int j=i+1; j<=str.length(); j++){
            
            set.add(str.substring(i,j).toString());
          }
        }
        return set.size();
    }
}