package com.yuceturkomer.hw05;

import java.util.List;

/**
 *  TwoListOpsInterface
 */
public interface TwoListOpsInterface {
    /**
     * An intersection method for lists.
     *
     * @return A List of intersection of list1 and list2.
     */
    List intersectionOfLists();//returns intersection set as a list of list1 and list2

    /**
     * A union method for lists.
     *
     * @return A List of union of list1 and list2.
     */
    List unionOfLists();//returns union set as a list of list1 and list 2

    /**
     * Check if list1 is subset of list2 - OR - list2 is subset of list1.
     *
     * @return If either of the list is sublist of the other one.
     */
    boolean isSubset();
}
