package com.company;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {

        ArrayList<B> list= new ArrayList<B>();
        ArrayList<? extends B> xList= list;  // exends sätter övre nivå
                                            // super sätter undre nivå att ärva.
        // c ärver b,b ärver a


        Integer [] intValues = {17, 3, 9, 15, 8, 1};
        String[] stringValues = {"John", "Alice", "Zeus", "Stella", "Linnea"};
        Person p1 = new Person("Bob", "Jones");
        Person p2 = new Person("Anna", "Jones");
        Person p3 = new Person("Sue", "Anderson");
        Person[] personValues = {p1, p2, p3};
        BubbleSort bSort = new BubbleSort();
        QuickSort qSort = new QuickSort();
        qSort.quickSort(intValues);
        qSort.quickSort(personValues);
        // bSort.sort(intValues);
      //  bSort.sort(stringValues);
      //  bSort.sort(personValues);
        for(int i : intValues) {
            System.out.println(i);
        }
        System.out.println();
        for(String s : stringValues){
            System.out.println(s);
        }
        System.out.println();
        for (Person p : personValues) {
            System.out.println(p);
        }
    }
}