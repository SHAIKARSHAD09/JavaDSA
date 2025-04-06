package ArraysStrings;
import java.util.HashSet;
import java.util.Set;
class p17 {
    public int minimumOperations(int[] nums) {
     Set<Integer> set = new HashSet<>();
     for (int a: nums)
         if (a > 0)
             set.add(a);
     return set.size();
 }
}

/*Pattern Observation| unique elements = min.no.of.operations
 * nums = [1,5,0,3,5]
 * output = 3
 * 
 * nums = [0]
 * output = 0
 * 
 */