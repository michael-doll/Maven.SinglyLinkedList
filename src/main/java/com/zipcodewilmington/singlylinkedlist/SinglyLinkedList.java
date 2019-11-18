package com.zipcodewilmington.singlylinkedlist;

import javax.xml.soap.Node;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<E> implements Iterable {

    class Node {
        E data;
        Node next;

        public Node(E data) {
        this.data = data;
        this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;


    public SinglyLinkedList(){
        this.head = head;
        this.tail = tail;
    }

//add remove contains find size get copy sort

    public void add(E data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    //re evaluate this
    public void remove(Integer index){
        if(head == null){
            return;
        }

        Node temp = head;

        if(index == 0){
            head = temp.next;
            return;
        }

        for (int i = 0; temp != null && i <index -1 ; i++) {
            temp = temp.next;
        }

        if(temp == null || temp.next == null) {
            return;
        }

        // temp -> next should be deleted
        // point to temp -> next -> next
        Node next = temp.next.next;

        temp.next = next;
    }

    public Boolean contains(E data){
        Node current = head;

        if(head == null){
            return false;
        }
        while(current != null){
            if(current.data.equals(data)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public Integer find(){return 0; }
    public E copy(){return null; }
    public E sort(){return null ; }

    public Iterator iterator() { return null; }

//    //Testing
//    public void display() {
//        Node current = head;
//
//        if(head == null) {
//            System.out.println("List is empty");
//            return;
//        }
//        System.out.println("Nodes of singly linked list: ");
//        while(current != null) {
//            System.out.print(current.data + " ");
//            current = current.next;
//        }
//        System.out.println();
//    }
}
