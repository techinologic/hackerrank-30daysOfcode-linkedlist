import java.io.*;
import java.util.*;

// class that implements nodes
class Node {
    int data;
    Node next;

    // class constructor that takes in data.
    Node(int d) {
        data = d;
        next = null;
    }

}

class Solution {
    public static Node insert(Node head,int data) {
        //Complete this method

        // if head is null, assigns new node as head
        if (head == null) {
            return new Node(data);
        }

        // if next is null, assigns new node as next
        if (head.next == null) {
            head.next = new Node(data);
        }
        else {
            // recursion
            insert(head.next, data);
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}