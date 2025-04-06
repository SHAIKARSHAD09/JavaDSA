package StacksQueues;

import java.util.*;
public class p2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack s = new Stack();
        for(int i=0; i<n; i++){
            s.push(sc.nextInt());
        }

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
    }
}

class Stack{
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

        void push(int x){
            q1.offer(x);
        }


    int pop(){
        if (q1.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }

        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        int value = q1.poll();
        
        // Swap references of q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
		 q2 = temp;
        
        return value;
    }

    int size(){
        return q1.size();
    }

    int peek(){
        return q1.peek();
    }
}