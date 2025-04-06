package ArraysStrings;

import java.util.*;

public class p18 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int exp = sc.nextInt();
      int[] monst = new int[n];
      for(int i=0; i<n; i++){
        monst[i] = sc.nextInt();
      }
      int[] bonus = new int[n];
      for(int i=0; i<n; i++){
        bonus[i] = sc.nextInt();
      }
      
      int res = Solution(monst, bonus, exp);
      System.out.println(res);
    }
    
    public static int Solution(int[] monst, int[] bonus, int exp){
      
      int n = monst.length;
      
      class Monster{
        private final int power, bonus;
        public Monster(int power, int bonus){
          this.power = power;
          this.bonus = bonus;
        }
      }
      
      Monster[] monsters = new Monster[n];
      
      for(int i=0; i<n; i++){
        monsters[i] = new Monster(monst[i], bonus[i]);
        
      }
      
      
      Arrays.sort(monsters, Comparator.comparingInt(m->m.power));
      
      int count =0;
      
      for(Monster m: monsters){
        if(exp<m.power) break;
        
        exp += m.bonus;
        count++;
      }
      
      return count;
      
      
    }
  
  
}

/*input   output = 2
3  
100
101
100
304
100
1
574 
*/


//Using Priority Queue
/*import java.util.*;

public class p18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int exp = sc.nextInt();
        int[] monst = new int[n];
        for (int i = 0; i < n; i++) {
            monst[i] = sc.nextInt();
        }
        int[] bonus = new int[n];
        for (int i = 0; i < n; i++) {
            bonus[i] = sc.nextInt();
        }

        int res = solveWithPriorityQueue(monst, bonus, exp);
        System.out.println(res);
    }

    public static int solveWithPriorityQueue(int[] monst, int[] bonus, int exp) {
        int n = monst.length;

        // Priority queue to sort monsters by their power
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(m -> m[0]));

        // Add monsters to the priority queue
        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{monst[i], bonus[i]});
        }

        int count = 0;

        // Process monsters based on their power
        while (!pq.isEmpty()) {
            int[] monster = pq.poll(); // Get the weakest monster
            int power = monster[0];
            int bonus = monster[1];

            if (exp < power) break; // Stop if the experience isn't enough to defeat the monster

            exp += bonus; // Gain bonus experience after defeating the monster
            count++; // Increment the count of defeated monsters
        }

        return count;
    }
}*/