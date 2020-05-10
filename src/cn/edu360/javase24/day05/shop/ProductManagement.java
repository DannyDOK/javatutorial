package cn.edu360.javase24.day05.shop;

import java.util.ArrayList;

/*
* Purpose:
* 1. Store product information
* 2. Provide methods to access these information
* */
public class ProductManagement {

    private ArrayList<Product> pdts = new ArrayList<>();

    public void addProduct(Product p) {
        this.pdts.add(p);
    }

    public void showProducts() {
        for (int i=0; i<pdts.size(); i++) {
            System.out.println(pdts.get(i));
        }
    }

}