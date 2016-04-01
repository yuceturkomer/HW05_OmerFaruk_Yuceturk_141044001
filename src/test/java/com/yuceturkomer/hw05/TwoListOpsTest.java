package com.yuceturkomer.hw05;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * The unit test methods
 */
public class TwoListOpsTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("The test called\n");
        TwoListOps<Integer> intTestp3 = new TwoListOps<Integer>();
        intTestp3.list1.add(3);
        intTestp3.list1.add(2);
        intTestp3.list1.add(-5);
        intTestp3.list2.add(-5);
        intTestp3.list2.add(3);
        intTestp3.list2.add(2);
        intTestp3.list2.add(3);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("The test method is called and finished.\n");
    }

    @Test
    public void testSortBoth() throws Exception {

    }

    @Test
    public void testIntersectionOfLists() throws Exception {

    }

    @Test
    public void testUnionOfLists() throws Exception {

    }

    @Test
    public void testIsSubset() throws Exception {

    }
}