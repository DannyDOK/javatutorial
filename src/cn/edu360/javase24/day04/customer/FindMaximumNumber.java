package cn.edu360.javase24.day04.customer;

import java.lang.reflect.Array;
import java.util.*;

public class FindMaximumNumber {
    static int getMaxNumber(int[] aList) {
        int maxNumber = 0;

        for (int number : aList) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        return maxNumber;
    }

    static void sortArray(ArrayList<Integer> aList) {

        for (int i=1; i<aList.size(); i++) {
            for (int j=0; j<i; j++) {
                if (aList.get(i) < aList.get(j)) {
                    int tmp = aList.get(i);
                    aList.set(i, aList.get(j));
                    aList.set(j, tmp);
                }
            }
        }
        System.out.println(aList);
    }

    public static void main(String[] args) {
        int min, max;
        min = 0;
        max = 200;
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            aList.add((int) (Math.random() * ((max - min) + 1)) + min);
        }

        ArrayList<Integer> bList = new ArrayList<>(Arrays.asList(178, 8, 159, 96, 41, 119, 126, 110, 194, 50, 121, 100, 75, 125, 192, 51, 141, 64, 19, 99));
        System.out.println(aList);
        sortArray(aList);
    }
}
