package com.zipcodewilmington.singlylinkedlist;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @Test
    public void addIntegerTest(){
        SinglyLinkedList<Integer> singlyLinkedInt = new SinglyLinkedList<Integer>();
        singlyLinkedInt.add(10);

        Assert.assertTrue(singlyLinkedInt.contains(10));
    }
    @Test
    public void addIntegerTest2(){
        SinglyLinkedList<Integer> singlyLinkedInt = new SinglyLinkedList<Integer>();
        singlyLinkedInt.add(10);

        Assert.assertFalse(singlyLinkedInt.contains(20));
        ;
    }

}
