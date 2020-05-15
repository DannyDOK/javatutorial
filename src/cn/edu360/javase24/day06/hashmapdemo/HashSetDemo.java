package cn.edu360.javase24.day06.hashmapdemo;


import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("p1");
        set1.add("p2");
        set1.add("p1");
        System.out.println(set1.size());


        int[] arr = new int[] {1, 2, 3, 4, 5};



//        set1.remove("p1");
//        System.out.println(set1.size());
//        Iterator<String> iterator = set1.iterator();
        for (String s : set1) {
            System.out.println(s);
        }
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    }
}
