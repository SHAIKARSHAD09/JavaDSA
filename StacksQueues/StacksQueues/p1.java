package StacksQueues;

import java.util.*;
//Implement Stack using 1 Queue;
public class p1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      stack s = new stack();
      for(int i=0; i<n; i++){
        s.push(sc.nextInt());
      }
      
      System.out.println(s.pop());
      System.out.println(s.peek());
      System.out.println(s.pop());
      System.out.println(s.size());
  }
  
}

class stack{
  Queue<Integer> q = new LinkedList<>();
  
  void push(int x){
    q.offer(x);
    for(int i=0; i<q.size()-1;i++){
      q.offer(q.poll());
    }
  }
  int pop(){
    return q.poll();
  }
  int peek(){
    return q.peek();
  }
  int size(){
    return q.size();
  }
}

