package cn.edu360.javase24.day05.shop;

import java.util.ArrayList;

public class CartManagement {
    private ArrayList<Product> cart = new ArrayList<>();

    public void addProductToCart(String selectProduct, ProductManagement productManagement) {
        String[] split = selectProduct.split(",");
        for(int i=0;i<split.length;i++) {
            String[] idAndQuantity = split[i].split(":");
            Product product = new Product();
            product.setProductId(idAndQuantity[0]);
            product.setQuantity(Integer.parseInt(idAndQuantity[1]));
            Product productById = productManagement.getProductById(idAndQuantity[0]);
            product.setProductName(productById.getProductName());
            product.setPrice(productById.getPrice());
            cart.add(product);
        }
    }

    public void removeProductToCart(Product product) {
        cart.remove(product);
    }

    public void showCart() {
        for (int i=0;i<cart.size();i++) {
            System.out.println(cart.get(i));
        }
    }
}
