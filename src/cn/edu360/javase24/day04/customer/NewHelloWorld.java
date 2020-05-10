package cn.edu360.javase24.day04.customer;
import java.util.*;
import java.util.ArrayList;


public class NewHelloWorld {

    static void iterateListOne(List<Integer> aList) {

        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i));
        }

    }


    static void iterateListTwo(List<Integer> aList) {

        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i));
        }

    }


    static void iterateListThree(List<Integer> aList) {

        for (int temp : aList) {
            System.out.println(temp);
        }

    }


    static void iterateListFour(List<Integer> aList) {

        Iterator<Integer> aIterator = aList.iterator();
        while (aIterator.hasNext()) {
            System.out.println(aIterator.next());
        }

    }

    static void iterateListFive(List<Integer> aList) {
        ListIterator<Integer> aListIterator = aList.listIterator();
        while (aListIterator.hasNext()) {
            System.out.println(aListIterator.next());
        }
    }

    static void iterateListSix(List<Integer> aList) {
        int i = 0;
        while (i < aList.size()) {
            System.out.println(aList.get(i));
            i++;
        }
    }


    static void iterateListSeven(List<Integer> aList) {
        aList.forEach(System.out::println);
    }


    static void iterateListEight(List<Integer> aList) {
        aList.stream().forEach((aTemp) -> System.out.println(aTemp));
    }


    public interface MethodRunner {
        void run(List<Integer> arg);
    }


    static Long recordTimeElapsed(MethodRunner method, List<Integer> aList) {
        Long start = System.nanoTime();
        method.run(aList);
        Long end = System.nanoTime();
        return end - start;
    }


    public static void main(String[] arg) {

        List<MethodRunner> methods = new ArrayList<>();

        methods.add(NewHelloWorld::iterateListOne);

        methods.add(NewHelloWorld::iterateListThree);

        methods.add(NewHelloWorld::iterateListFour);

        methods.add(NewHelloWorld::iterateListFive);

        methods.add(NewHelloWorld::iterateListSix);

        methods.add(NewHelloWorld::iterateListSeven);

        methods.add(NewHelloWorld::iterateListEight);

        List<Integer> aList = new ArrayList<>();

        Scanner sc = new Scanner((System.in));

        Integer number = sc.nextInt();

        for (int i = 0; i <= number; i++){
            aList.add(i);
        }

        List<Long> listTimeElapsed = new ArrayList<>();

        for (MethodRunner method : methods) {
            Long timeElapsed = recordTimeElapsed(method, aList);
            listTimeElapsed.add(timeElapsed);
        }

        System.out.println(listTimeElapsed);

        Integer number2 = sc.nextInt();

        System.out.println(number+number2);
    }
}
