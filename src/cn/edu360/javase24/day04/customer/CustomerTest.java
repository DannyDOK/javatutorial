package cn.edu360.javase24.day04.customer;

import java.util.Scanner;

public class CustomerTest {

    public static void main(String[] args) {

        int numberField = 3;
        int numberCustomer = 3;
        Scanner sc = new Scanner(System.in);
        Customer[] customerList = new Customer[numberCustomer];

        for (int i=0; i<numberField; i++) {
            Customer customer = new Customer();
            String customerInput = sc.nextLine();
            String[] customerInputList = customerInput.split(",");
            for (int j=0; j < customerList.length; j++) {
                if (j == 0) {
                    customer.id = Integer.parseInt(customerInputList[j]);
                } else if (j == 1) {
                    customer.name = customerInputList[j];
                } else {
                    customer.salary = Float.parseFloat(customerInputList[j]);
                }
            }
            customerList[i] = customer;
        }
        System.out.println(customerList[0].id + customerList[1].name + customerList[1].salary);

        Customer customer4 = new Customer(4, "Test", 3000);
        Customer customer5 = new Customer();

        Customer[] customers1 = new Customer[] {customer4};

        System.out.println(customers1[0].name);
        customer4.name = "Danny";
        Customer[] customers2 = new Customer[] {customer4};
        System.out.println(customers2[0].name);
        System.out.println(customers1[0].name);
        System.out.println(customers1[0].age);
    }
}
