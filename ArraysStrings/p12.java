package ArraysStrings;

import java.util.*;

public class p12 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int[] arr = new int[n];
      
        for(int i=0; i<n; i++){
          arr[i] = sc.nextInt();
        }
      
      
      int[] res = Solution(arr, n);
      System.out.println(Arrays.toString(res));

  }
  
  public static int[] Solution(int[] arr,int n) {
    List<Integer> pos = new ArrayList<>();
    List<Integer> neg = new ArrayList<>();
    
    for(int i=0; i<n; i++){
      if(arr[i]>0){
        pos.add(arr[i]);
      }else{
        neg.add(arr[i]);
      }
    }
    
    pos.addAll(neg);
    
    return pos.stream().mapToInt(i->i).toArray();
    
    
    
  }
  
}  
