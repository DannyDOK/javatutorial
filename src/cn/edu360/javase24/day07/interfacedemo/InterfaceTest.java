package cn.edu360.javase24.day07.interfacedemo;

public class InterfaceTest {

    public static void main(String[] args) {
        XXService xxService = new XXServiceImpl();

        String step1 = xxService.step1();
        System.out.println(step1);
    }
}
