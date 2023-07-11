package Homework.HW4;

import java.util.LinkedList;

import Homework.HW3.MyUtilities;

public class HWT1 {
    static final int MINRANDOMVALUE = -100;
    static final int MAXRANDOMVALUE = 100;

    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        LinkedList<Integer> linkedList = MyUtilities.createRandomLinkedList(MyUtilities.randomIntNumber(5, 50),
                MINRANDOMVALUE, MAXRANDOMVALUE);

        System.out.println("\nИсходный список: ");
        System.out.println(linkedList);

        // LinkedList<Integer> rollLinkedList = reverseLinkedList(linkedList);
        reverseLinkedList(linkedList);

        System.out.println("\n\"Перевернутый\" список: ");
        // System.out.println(rollLinkedList);
        System.out.println(linkedList);

    }

    private static void reverseLinkedList(LinkedList<Integer> linkedList) {
        int size = linkedList.size();
        int n = size / 2;
        for (int i = 0; i < n; i++) {
            int j = size - 1 - i;
            Integer numberFromTheEnd = linkedList.remove(j);
            Integer symmetricalNumber = linkedList.remove(i);
            linkedList.add(i, numberFromTheEnd);
            linkedList.add(j, symmetricalNumber);

        }
    }
}
