package StacksQueues;

import java.util.*;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StackUsingTwoQueues s = new StackUsingTwoQueues();

        for (int i = 0; i < n; i++) {
            s.push(sc.nextInt());
        }

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
    }
}

class StackUsingTwoQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push operation
    void push(int x) {
        q2.offer(x); // Add the new element to q2
        while (!q1.isEmpty()) { // Transfer all elements from q1 to q2
            q2.offer(q1.poll());
        }
        // Swap references of q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Pop operation
    int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return q1.poll();
    }

    // Peek operation
    int peek() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return q1.peek();
    }

    // Size of the stack
    int size() {
        return q1.size();
    }
}