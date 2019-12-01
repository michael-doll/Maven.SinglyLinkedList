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

    @Test
    public void findTest(){
        SinglyLinkedList<Integer> singlyLinkedInt = new SinglyLinkedList<Integer>();
        singlyLinkedInt.add(10);
        singlyLinkedInt.add(20);
        Integer expected = 1;
        Integer actual = singlyLinkedInt.find(20);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findTest2(){
        SinglyLinkedList<Integer> singlyLinkedInt = new SinglyLinkedList<Integer>();
        singlyLinkedInt.add(10);
        singlyLinkedInt.add(20);
        Integer expected = 0;
        Integer actual = singlyLinkedInt.find(10);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findTest3(){
        SinglyLinkedList<Integer> singlyLinkedInt = new SinglyLinkedList<Integer>();
        singlyLinkedInt.add(10);
        singlyLinkedInt.add(20);
        Integer expected = -1;
        Integer actual = singlyLinkedInt.find(30);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void copyTest(){
        SinglyLinkedList<Integer> singlyLinkedInt = new SinglyLinkedList<Integer>();
        singlyLinkedInt.add(10);
        singlyLinkedInt.add(20);
        singlyLinkedInt.add(30);
        SinglyLinkedList<Integer> singlyLinkedIntCopy = singlyLinkedInt.copy();
        Assert.assertTrue(singlyLinkedIntCopy.contains(10));
        Assert.assertTrue(singlyLinkedIntCopy.contains(20));
        Assert.assertTrue(singlyLinkedIntCopy.contains(30));
    }

    @Test
    public void copyTest2(){
        SinglyLinkedList<String> singlyLinkedString = new SinglyLinkedList<String>();
        singlyLinkedString.add("Taco");
        singlyLinkedString.add("Burger");
        singlyLinkedString.add("Telephone");
        SinglyLinkedList<String> singlyLinkedStringCopy = singlyLinkedString.copy();
        Assert.assertTrue(singlyLinkedStringCopy.contains("Taco"));
        Assert.assertTrue(singlyLinkedStringCopy.contains("Burger"));
        Assert.assertTrue(singlyLinkedStringCopy.contains("Telephone"));
    }

    @Test
    public void sizeTest(){
        SinglyLinkedList<Integer> singlyLinkedInt = new SinglyLinkedList<Integer>();
        singlyLinkedInt.add(10);
        singlyLinkedInt.add(20);
        singlyLinkedInt.add(30);
        Integer expected = 3;
        Assert.assertEquals(singlyLinkedInt.size(), expected);

    }

    @Test
    public void sizeTest2(){
        SinglyLinkedList<Integer> singlyLinkedInt = new SinglyLinkedList<Integer>();
        singlyLinkedInt.add(10);
        singlyLinkedInt.add(20);
        singlyLinkedInt.add(30);
        singlyLinkedInt.remove(2);
        Integer expected = 2;
        Assert.assertEquals(singlyLinkedInt.size(), expected);
    }

//    @Test
//    public void sortTest(){
//        SinglyLinkedList<Integer> singlyLinkedInt = new SinglyLinkedList<Integer>();
//        singlyLinkedInt.add(10);
//        singlyLinkedInt.add(30);
//        singlyLinkedInt.add(20);
//
//        singlyLinkedInt.sort();
//        singlyLinkedInt.display();
//    }
}
