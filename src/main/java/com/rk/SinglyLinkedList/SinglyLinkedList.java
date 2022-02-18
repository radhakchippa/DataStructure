package com.rk.SinglyLinkedList;

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
