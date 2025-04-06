package ArraysStrings;

import java.util.*;
//Max-Min, 2ndMAX-2ndMIN, ...., lastMAX-lastMin
public class p11 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      
      int[] res = Solution(arr, n);
      System.out.println(Arrays.toString(res));
  }
  
  public static int[] Solution(int[] arr, int n){
    List<Integer> list = new ArrayList<>();
    int first = 0;
    int last = n-1;
    
    while(first<=last){
      if(first == last){
        list.add(arr[first]);
      }else{
      list.add(arr[last]);
      list.add(arr[first]);
      }
      last--;
      first++;
      
    }
    
    return list.stream().mapToInt(i->i).toArray();
  }
}
