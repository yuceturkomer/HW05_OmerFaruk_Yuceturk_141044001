package com.yuceturkomer.hw05;

import com.sun.org.apache.xalan.internal.lib.ExsltMath;

import java.util.Stack;

/**
 * TowerOfHanoi iterative solution
 */
public class TowerOfHanoiClass {
    private Stack<Integer> srcStack = new Stack<Integer>();
    private Stack<Integer> auxStack = new Stack<Integer>();
    private Stack<Integer> dstStack = new Stack<Integer>();

    /**
     * Prints the move that made.
     * @param from Char from where
     * @param to Char to where
     * @param disk Disk's int value as size
     */
    private void printMove(char from, char to, int disk) {
        System.out.println("Moving disk " + disk + " from \"" + from + "\" to \"" + to + "\"\n");
    }

    public TowerOfHanoiClass() {

    }

    public void TowerOfHanoi(int diskSize, char src, char dst, char aux) {
        char temp;
        if (diskSize % 2 == 0) {
            temp = dst;
            dst = aux;
            aux = temp;
        }
        double totalMove = ExsltMath.power(2, diskSize) - 1;

        for (int i = diskSize; i > 0; --i)
            srcStack.push(i);
        for (int i = 1; i <= totalMove; ++i) {
            if (i % 3 == 1)
                moveBetween(srcStack, dstStack, src, dst);
            else if (i % 3 == 2)
                moveBetween(srcStack, auxStack, src, aux);
            else if (i % 3 == 0)
                moveBetween(auxStack, dstStack, aux, dst);
        }

    }

    private void moveBetween(Stack<Integer> src, Stack<Integer> dest, char s, char d) {
        int pole1Top, pole2Top;

        if (src.size() == 0) {
            pole2Top = dest.pop();
            src.push(pole2Top);
            printMove(d, s, pole2Top);
        } else if (dest.size() == 0) {
            pole1Top = src.pop();
            dest.push(pole1Top);
            printMove(s, d, pole1Top);
        } else if (src.peek() > dest.peek()) {
            pole2Top = dest.pop();
            src.push(pole2Top);
            printMove(d, s, pole2Top);
        } else {
            pole1Top = src.pop();
            dest.push(pole1Top);
            printMove(s, d, pole1Top);
        }
    }

}
