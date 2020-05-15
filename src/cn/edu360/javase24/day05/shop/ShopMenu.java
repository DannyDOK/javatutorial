package cn.edu360.javase24.day05.shop;

/*
* 收获系统的入口程序
* */

import java.util.ArrayList;
import java.util.Scanner;

public class ShopMenu {
    public static void main(String[] args) {

        ProductManagement pmgmt = CreateSampleProducts.create();

        CartManagement cartManagement = new CartManagement();
        boolean flag = true;
        while (flag) {
            System.out.println("\n1. View items\n2. purchase \n3. check cart \n4. update cart \n5. check order \n6. pay bill \n7. exit\n");
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            switch(command) {
                case "1":
                    pmgmt.showProducts();
                    System.out.println("\n");
                    break;
                case "2":
                    System.out.println("Select item to purchase\n");
                    String inputProduct = scanner.nextLine();
                    cartManagement.addProductToCart(inputProduct, pmgmt);
                    break;
                case "3":
                    cartManagement.showCart();
                    break;
                case "4":
                    System.out.printf("");
                    break;
                case "7":
                    flag = false;
                    break;
                default:
                    System.out.println("Watch the menu!!!\n");
            }
        }
    }
}
