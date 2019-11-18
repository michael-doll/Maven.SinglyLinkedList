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
    }

    @Test
    public void addStringTest(){
        SinglyLinkedList<String> singlyLinkedString = new SinglyLinkedList<String>();
        String ourString = "apple";

        singlyLinkedString.add(ourString);

        Assert.assertTrue(singlyLinkedString.contains(ourString));
    }

    @Test
    public void addString2Test2(){
        SinglyLinkedList<String> singlyLinkedString = new SinglyLinkedList<String>();
        singlyLinkedString.add("taco");
        singlyLinkedString.add("pizza");

        Assert.assertTrue(singlyLinkedString.contains("pizza"));
    }

    @Test
    public void removeIntegerTest(){
        SinglyLinkedList<Integer> singlyLinkedInt = new SinglyLinkedList<Integer>();
        singlyLinkedInt.add(10);
        singlyLinkedInt.add(20);

        singlyLinkedInt.remove(0);
        Assert.assertFalse(singlyLinkedInt.contains(10));
    }

    @Test
    public void removeIntegerTest1(){
        SinglyLinkedList<Integer> singlyLinkedInt = new SinglyLinkedList<Integer>();
        singlyLinkedInt.add(10);
        singlyLinkedInt.add(20);

        singlyLinkedInt.remove(1);
        Assert.assertFalse(singlyLinkedInt.contains(20));
    }
}
