package cn.edu360.javase24.day04.customer;

import java.util.*;

// Single line comment
public class helloWorld {

    public static void main(String[] Arg){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        if (name.equals("Danny")) {
            System.out.println(name);
        } else {
            System.out.println("not my name");
        }
    }
}

