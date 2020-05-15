package cn.edu360.javase24.day06.hashmapdemo;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();

        map1.put("1", "Danny");
        map1.put("2", "Denny");

        map1.remove("2");
        System.out.println(map1.containsKey("2"));

        Set<String> keySet = map1.keySet();


    }
}
