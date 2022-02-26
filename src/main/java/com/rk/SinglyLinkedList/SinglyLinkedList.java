package com.rk.SinglyLinkedList;

/**
 * For the LinkedList, have a innerclass Node with data and pointer to next Node.
 * To work in the main class make all classes and methods static
 * Main points in SinglyLinkedList is that the pointer is oneway, and Head node can change
 * So, we have to always maintain the Head Node or return/pass it to all methods.
 * Last node always points to null.
 */
public class SinglyLinkedList {
    private Node head=null;
    private static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static Node addNodeAtHead(int data, Node head){
        if(head == null) {
            head = new Node(data);
        }else{
            Node newHead = new Node(data);
            newHead.next = head;
            head = newHead;
        }
        return head;
    }


    public static void printSinglyLinkedList(Node head){
        while(head!=null){
            System.out.print(head.data+"->");
            head = head.next;
        }
        System.out.print("null\n");
    }
    public static void main(String[] args) {
        Node head = addNodeAtHead(1,null);
        head = addNodeAtHead(2,head);
        head = addNodeAtHead(3,head);
        head = addNodeAtHead(4,head);
        printSinglyLinkedList(head);
    }
}
