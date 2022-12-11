package LinkedList;

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {


    //Complete this method
    /*
    find node head
    iterate through list until next is null
    when next is null, store new node data in next node

    Check for existing list
    if no list, create list first node
    if list, travel to end of list, add data
    */
    public static  Node insert(Node head,int data) {
        //Complete this method
        Node n = new Node(data);
        if(head == null){
            head = n;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = n;
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