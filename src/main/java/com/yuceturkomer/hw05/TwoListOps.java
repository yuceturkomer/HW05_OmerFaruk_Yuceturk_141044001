package com.yuceturkomer.hw05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The TwoListOps class has two ArrayLists in it. Some operations
 * may be performed on them such as: sorting them both, getting intersects-unions-subsets of them. *
 */
public class TwoListOps<E extends Comparable<E>> implements TwoListOpsInterface {
    protected ArrayList<E> list1;
    protected ArrayList<E> list2;

    /**
     * Sorts both lists by using Collections.sort()
     */
    public void sortBoth() {
        Collections.sort(list1);
        Collections.sort(list2);
    }

    /**
     * No param constructor
     */
    public TwoListOps() {
        list1 = new ArrayList<E>();
        list2 = new ArrayList<E>();
    }

    /**
     * A wrapper method for getting intersections of lists.
     * pre: Lists are sorted.
     *
     * @return Intersect of lists
     */
    public List intersectionOfLists() {
        List returnList = new ArrayList<E>();
        return intersectionOfLists(list1, list2, returnList);
    }

    /**
     * Method for getting intersection of lists
     *
     * @param list1      the first list this class has
     * @param list2      the second list this class has
     * @param returnList the list to be added returned later
     * @return intersection List
     */
    public List intersectionOfLists(List<E> list1, List<E> list2, List<E> returnList) {
        if (list1 == null || list2 == null)
            throw new NullPointerException("Either of list is null\n"); //Null exception throwing
        else if (list1.size() == 0 || list2.size() == 0)
            return returnList; //If either of list is empty, return
        if (list1.get(0).equals(list2.get(0)) && !returnList.contains(list1.get(0))) {
            returnList.add(list1.get(0));
        }
        if (list1.size() > 1) {
            if (list1.get(0).compareTo(list2.get(0)) < 0)
                returnList = intersectionOfLists(list1.subList(1, list1.size()), list2, returnList);
            else if (list2.size() > 1 && list1.get(0).compareTo(list2.get(0)) > 0)
                returnList = intersectionOfLists(list1, list2.subList(1, list2.size()), returnList);
            else if (list2.size() > 1 && list1.get(0).compareTo(list2.get(0)) == 0)
                returnList = intersectionOfLists(list1.subList(1, list1.size()), list2.subList(1, list2.size()), returnList);
        }
        return returnList;
    }

    /**
     * The wrapper method for getting union of lists
     *
     * @return the union List
     */
    public List unionOfLists() {
        List returnList = new ArrayList<E>();
        return unionOfLists(list1, list2, returnList);
    }

    /**
     * Method for getting union of lists
     *
     * @param list1      the first list this class has
     * @param list2      the second list this class has
     * @param returnList the list to be added returned later
     * @return union List
     */
    public List unionOfLists(List<E> list1, List<E> list2, List<E> returnList) {
        if (list1 == null || list2 == null)
            throw new NullPointerException("Either of list is null\n");
        else if (list1.size() == 0 || list2.size() == 0)
            return returnList;
        if (!returnList.contains(list1.get(0))) {
            returnList.add(list1.get(0));
        }
        if (!returnList.contains(list2.get(0))) {
            returnList.add(list2.get(0));
        }
        if (list1.size() > 1) {
            returnList = unionOfLists(list1.subList(1, list1.size()), list2, returnList);
        }
        if (list2.size() > 1) {
            returnList = unionOfLists(list1, list2.subList(1, list2.size()), returnList);
        }
        return returnList;

    }

    /**
     * The wrapper method for checking if either of list is subset of the other
     *
     * @return boolean value if it's subset of other one
     */
    public boolean isSubset() {
        sortBoth();
        return isSubset(list1, list2, list1.size(), list2.size());
    }

    /**
     * Method for checking if either of list is subset of the other
     *
     * @param list1  the first list this class has
     * @param list2  the second list this class has
     * @param l1size the first list's size(same for every recursive call)
     * @param l2size the second list's size(same for every recursive call)
     * @return boolean value if it's subset of other one
     */
    public boolean isSubset(List<E> list1, List<E> list2, int l1size, int l2size) {
        boolean returnVal = true;
        if (list1 == null || list2 == null)
            throw new NullPointerException("Either of list is null\n");
        else if (list1.size() == 0 || list2.size() == 0)
            returnVal = true;
        List<E> checkArr = intersectionOfLists();
        if (l1size <= l2size && list1.size() > 1) {
            if (!checkArr.contains(list1.get(0)))
                return false;
            returnVal = isSubset(list1.subList(1, list1.size()), list2, l1size, l2size);
        } else if (l1size > l2size && list2.size() > 1) {
            if (!checkArr.contains(list2.get(0)))
                return false;
            returnVal = isSubset(list1, list2.subList(1, list2.size()), l1size, l2size);
        }

        return returnVal;
    }

    @Override
    public String toString() {
        return "List 1 ->" + list1.toString() + "\nList 2 ->" + list2.toString();
    }


}
