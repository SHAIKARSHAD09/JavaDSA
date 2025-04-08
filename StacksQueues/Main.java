import java.util.*;

public class Main {
    public static void main(String[] args) {
      LL l = new LL();
      l.insertAtFirst(1);
      l.insertAtLast(2);
      l.insertAtLast(3);
      l.insertAtLast(4);
      l.insertAtLast(5);
      l.printList();
      l.removeAtFirst();
      l.printList();
      l.removeAtLast();
      l.insertAtSpecificPosition(2, 6);
      l.printList();
      l.deleteAtSpecificPosition(2);
      l.printList();
  }
}

class LL{
  class Node{
  Node next;
  int data;
  Node(int data){
    this.data = data;
    this.next = null;
  }
  }
  
  Node head;
  
  void insertAtFirst(int data){
    Node newnode = new Node(data);
    
    newnode.next = head;
    head = newnode;
    
  }
  
  void insertAtLast(int data){
    Node newnode = new Node(data);
    
    if(head == null){
      head = newnode;
      return;
    }
    
    Node curr = head;
    
    while(curr.next!=null){
      curr = curr.next;
    }
    curr.next =  newnode;
  }
  
  void insertAtSpecificPosition(int pos, int data){
    Node newnode = new Node(data);
    if (pos == 1) {
        newnode.next = head;
        head = newnode;
        return;
    }

    Node curr = head;
    int count = 1;
    while(curr != null && count < pos - 1){
          curr = curr.next;  
          count++;
    }
    // If position is greater than the length of the list
    if (curr == null) {
        System.out.println("Position out of bounds!");
        return;
    }

    newnode.next = curr.next;
    curr.next = newnode;
  }
  void removeAtFirst(){
    if(head == null){
      return;
    }
    head = head.next;
    
  }
  
  void removeAtLast(){
    Node curr = head;
    Node end = curr.next;
    while(end.next!=null){
      end = end.next;
      curr = curr.next;
    }
    curr.next = null;
  }

   void deleteAtSpecificPosition(int pos){
    if (pos == 1) {
        head = head.next;
        return;
    }

    Node curr = head;
    Node end = curr.next;
    int count = 1;
    while(end != null && count < pos - 1){
          end = end.next; 
          curr = curr.next;
          count++;
    }
    // If position is greater than the length of the list
    if (curr == null) {
        System.out.println("Position out of bounds!");
        return;
    }

    
    curr.next = end.next;
  }
  
  void printList(){
    Node curr = head;
    while(curr != null){
    System.out.print(curr.data + " ");
    curr = curr.next;
    }
    System.out.println();
  }
}