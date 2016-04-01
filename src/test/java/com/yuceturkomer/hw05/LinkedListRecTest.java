package com.yuceturkomer.hw05;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Junit testing for LinkedListRec class.
 */
public class LinkedListRecTest {
    LinkedListRec<Integer> intTestp2;

    @Before
    public void setUp() throws Exception {
        System.out.println("The test called\n");
        intTestp2 = new LinkedListRec<Integer>();
        intTestp2.add(5);
        intTestp2.add(4);
        intTestp2.add(6);
        intTestp2.add(7);
        intTestp2.add(5);
        intTestp2.add(4);
        intTestp2.add(4);
        intTestp2.add(4);
        intTestp2.add(4);
        intTestp2.add(4);
        intTestp2.add(4);
        intTestp2.add(4);
        intTestp2.add(4);
        intTestp2.add(4);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("The test method is called and finished.\n");
    }

    @Test
    public void testRemove() throws Exception {
        Assert.assertEquals(intTestp2.remove(4),true);
        Assert.assertEquals(intTestp2.toString(),"5\n6\n7\n5\n");
    }
}