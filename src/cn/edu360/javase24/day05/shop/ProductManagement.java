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

    public ArrayList<Product> getPdts() {
        return pdts;
    }

    public void showProducts() {
        for (int i=0; i<pdts.size(); i++) {
            System.out.println(pdts.get(i));
        }
    }

    public Product getProductById(String id) {

        for (int i=0; i<pdts.size();i++) {
            Product p = pdts.get(i);
            if (pdts.get(i).getProductId().equals(id)) {
                return p;
            }
        }
        return null;
    }

}