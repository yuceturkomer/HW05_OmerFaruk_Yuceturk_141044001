package com.yuceturkomer.hw05;

import java.util.List;

/**
 * Main class for testing all the parts
 */
public class MainOfAll {
    @SuppressWarnings("unchecked")
    public static void main(String args[]) {
        /*----------------------------PART 1 TEST------------------------------*/
        System.out.println("\n\n******************* PART 1 TESTS ******************\n\n");
        TowerOfHanoiClass tOfHanoi = new TowerOfHanoiClass();
        tOfHanoi.TowerOfHanoi(3,'S','D','A');
        /*-------------------------PART 1 TEST END-----------------------------*/

        /*----------------------------PART 2 TEST------------------------------*/

        System.out.println("\n\n******************* PART 2 TESTS ******************\n\n");
        LinkedListRec<Integer> intTestp2 = new LinkedListRec<Integer>();
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
        System.out.println("Part 2 LinkedList\n" + intTestp2.toString() + "\n");
        intTestp2.remove(4);
        System.out.println("Part 2 LinkedList after removing integer 4\n" + intTestp2.toString() + "\n");
        intTestp2.remove(5);
        System.out.println("Part 2 LinkedList after removing integer 5\n" + intTestp2.toString() + "\n");

        /*-------------------------PART 2 TEST END-----------------------------*/

        /*----------------------------PART 3 TEST-------------------------------*/

        System.out.println("\n\n******************* PART 3 TESTS ******************\n\n");
        TwoListOps<Integer> intTestp3 = new TwoListOps<Integer>();
        intTestp3.list1.add(3);
        intTestp3.list1.add(2);
        intTestp3.list1.add(8);
        intTestp3.list1.add(-5);
        intTestp3.list1.add(-5);
        intTestp3.list1.add(-5);
        intTestp3.list1.add(-5);
        intTestp3.list1.add(8);
        intTestp3.list2.add(8);
        intTestp3.list2.add(1);
        intTestp3.list2.add(-5);
        intTestp3.list2.add(-5);
        intTestp3.list2.add(3);
        intTestp3.list2.add(3);
        intTestp3.list2.add(3);
        System.out.println("Before sorting\n" + intTestp3 + "\n");
        intTestp3.sortBoth();
        System.out.println("After sorting\n" + intTestp3 + "\n");
        List<Integer> intReturn = intTestp3.intersectionOfLists(); //Intersection return
        System.out.println("Intersection\n" + intReturn + "\n");
        intReturn = intTestp3.unionOfLists();                     //Union return
        System.out.println("Union\n" + intReturn + "\n");
        intTestp3.list1.clear();
        intTestp3.list2.clear();
        System.out.println("\nList cleared.Re-entering values...\n");
        intTestp3.list1.add(-5);
        intTestp3.list1.add(-5);
        intTestp3.list1.add(-5);
        intTestp3.list1.add(4);
        intTestp3.list1.add(4);
        intTestp3.list1.add(5);
        intTestp3.list1.add(8);
        intTestp3.list2.add(-5);
        intTestp3.list2.add(-5);
        intTestp3.list2.add(8);
        System.out.println("New list.\n" + intTestp3);
        boolean intBoolReturn = intTestp3.isSubset();
        System.out.println("Is subset?\n" + intBoolReturn);
        /*-------------------------PART 3 TEST END------------------------------*/

    }
}



