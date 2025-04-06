package ArraysStrings;
//Distinct Maximum possible number of Lowercase //input:abCdef output:3
import java.util.*;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = Solution(str);
        System.out.println(result);
    }
    
    public static int Solution(String str){
        HashSet<Character> set = new HashSet<>();
        int maxi = 0;
        int res = 0;
        int n = str.length();
        for(int i=0; i<n; i++){
          if(Character.isLowerCase(str.charAt(i))){
              if(set.add(str.charAt(i))){
                maxi++;
              }
              
              res = Math.max(maxi, res);
          }else{
              set.clear();
              maxi=0;
          }
        }
        return res;
       
        }
    }
