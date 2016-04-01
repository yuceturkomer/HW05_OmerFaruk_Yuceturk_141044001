package com.yuceturkomer.hw05;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * The unit test methods
 */
public class TwoListOpsTest {
    TwoListOps<Integer> intTestp3;

    @Before
    public void setUp() throws Exception {
        System.out.println("The test called\n");
        intTestp3 = new TwoListOps<Integer>();
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
        intTestp3.sortBoth();
        Assert.assertEquals("List 1 ->[-5, 2, 3]\nList 2 ->[-5, 2, 3, 3]",intTestp3.toString());
    }

    @Test
    public void testIntersectionOfLists() throws Exception {
        intTestp3.sortBoth();
        List a = intTestp3.intersectionOfLists();
        Assert.assertEquals(a.toString(),"[-5, 2, 3]");
    }

    @Test
    public void testUnionOfLists() throws Exception {
        intTestp3.sortBoth();
        List a = intTestp3.unionOfLists();
        Assert.assertEquals(a.toString(),"[-5, 2, 3]");
    }

    @Test
    public void testIsSubset() throws Exception {
        Assert.assertEquals(intTestp3.isSubset(),true);
    }
}