package com.zipcodewilmington.singlylinkedlist;

import javax.xml.soap.Node;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<E extends Comparable<E>>  {



    public Node head = null;
    public Node tail = null;


    public SinglyLinkedList(){
//        this.head = head;
//        this.tail = tail;
    }


// add
// remove
// contains
// find
// size
// get
// copy
// sort

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
    //** whole fucking thing
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

    public Integer size(){
        Integer count = 0;
        Node node = head;
        while(node != null){
            node=node.next;
            count++;
        }
        return count;
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

    public Integer find(E data){
        int currentIndex = 0;
        int index = -1;
        Node node = head;

        while (node != null) {
            if(node.data != null && node.data.equals(data)){
                index = currentIndex;
            }
            node = node.next;
            currentIndex++;
        }
        return index;
    }

    public SinglyLinkedList<E> copy(){
        SinglyLinkedList<E> copiedList = new SinglyLinkedList<E>();

        Node node = head;
        while(node!= null){
            copiedList.add((E) node.data);
            node = node.next;
        }
        return copiedList;
    }


        public void  sort(){
        Node node = head;
        Node current = node;

        while(current != null){
            int swapCount = 0;
            Node temp = current;
            if(current.compareTo(node.next) > 0){
                System.out.println("Swap " + current + " for " + node.next.data);

                node.data = node.next;
                node.next = temp.next;
                swapCount++;
                break;
            }
            current = node.next;
            node.next = node.next.next;
        }
    }

    private class Node<E extends Comparable<E>> implements Comparable<Node<E>> {
        E data;
        Node next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public int compareTo(Node<E> o) {
            int testtttt = this.data.compareTo(o.data);
            if(this.data.compareTo(o.data) < 0){
                System.out.println(this.data + " less than " + o.data + " returning -1");
                return -1;
            }else if (this.data.compareTo(o.data) > 0) {
                return 1;
            }else
            return 0;
        }
    }

    //Testing
    public void display() {
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
