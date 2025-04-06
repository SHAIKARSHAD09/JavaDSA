That's the real game-changing mindset! Thinking efficiently isn't just about 
memorizing algorithms—it's about recognizing patterns and asking the right 
questions while solving problems.

How to think in an optimized way: 
1. Identify the Bottleneck: 
Where in your code is the slowdown happening? 
• Are you using nested loops unnecessarily? 
• Are there repeated calculations you could avoid? 

2. Recognize Common Patterns: 
• Sliding Window (continuous subarrays, fixed-range problems). 
• Two Pointers (sorted data, finding pairs). 
• Hashing (quick lookups, frequency counts). 
• Binary Search (searching efficiently in sorted data). 
Dynamic Programming (breaking down problems into smaller subproblems). 

3. Question Every Step: 
Instead of jumping into brute force, ask yourself: 
• "Can / solve it greedily?" 
• "Can / use sorting or a set to simplify things?" 
"Do / rea//y need two loops, or is there a way to track things incrementa//y?" 

4. reak the Problem into Subproblems: 
• If solving the full problem is too complex, solve a simpler version first. 
• For example, before jumping into longest palindromic substring, just check 
if a single substring is a palindrome efficiently. 

5. Think in Terms of State Transitions: 
• If you can express the problem as "What is my current state, and what are 
my choices?", 
you can likely solve it dynamically or with recursion. 

6. Look at Edge Cases Early: 
• If an algorithm fails for small inputs, it probably won't scale. 
• Always test minimum, maximum, empty cases first. 

Example Thought Process: 
Let's say you need to find the first non-repeating character in a string. 
Brute force would check every character against the rest, making it O(n2). 
Optimized thinking: 
Use a hash map to store frequencies in O(n). 
Then iterate once to find the first character with count = 1 
The more you practice recognizing patterns, the faster optimized thinking becomes second nature. Try breaking down problems with this mindset, and soon you'll see solutions forming naturally.
Want to try optimizing another problem together? I’d love to help!

--------------------
1. List
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Convert List to Array
        Integer[] array = list.toArray(new Integer[0]);

        // Print array
        System.out.println(Arrays.toString(array));
    }
}

If the list is empty, return [-1, -1]
    if (list.isEmpty()) {
        return new int[]{-1, -1};
    }

    // Converting List<Integer> to int[]
    int[] result = list.stream().mapToInt(i -> i).toArray();

    return result; // Returning the array of indices

//MergeSort, QuickSort, Leaders, 

list.add(element)
list.add(int index, element) (0, arr[1]);
list.remove(int index)
list.clear()
list.get(int index); //returns the element ar specified position
list.set(int index, element)
list.contains()
list.indexOf()
list.lastIndexOf()
list.size();
list.isEmpty();

 1. List to Set
List<Integer> list = Arrays.asList(1, 2, 3, 3, 4);
Set<Integer> set = new HashSet<>(list);

2. List to Queue
List<String> list = Arrays.asList("A", "B", "C");
Queue<String> queue = new LinkedList<>(list);

3. List to Stack
List<Integer> list = Arrays.asList(1, 2, 3);
Stack<Integer> stack = new Stack<>();
stack.addAll(list);

4. List to Map (Key-Value Pairs)
List<String> list = Arrays.asList("A", "B", "C");
Map<Integer, String> map = new HashMap<>();
for (int i = 0; i < list.size(); i++) {
    map.put(i, list.get(i)); // Key is the index, value is the list element
}

5. List to String (Comma-Separated)
List<String> list = Arrays.asList("apple", "banana", "cherry");
String result = String.join(", ", list); // Output: "apple, banana, cherry"

6. List to LinkedList
List<Integer> list = Arrays.asList(1, 2, 3);
LinkedList<Integer> linkedList = new LinkedList<>(list);

list.addAll(list2) //two list combine
Collections.sort(list1);
List<Integer> uniqueList = new ArrayList<>(new HashSet<>(list1));