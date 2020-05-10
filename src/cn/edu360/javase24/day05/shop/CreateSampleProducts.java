package cn.edu360.javase24.day05.shop;

public class CreateSampleProducts {


    public static ProductManagement create() {

        Product p1 = new Product();
        p1.setProductId("p1");
        p1.setProductName("product 1");
        p1.setPrice(2.2f);
        p1.setQuantity(4);

        Product p2 = new Product();
        p2.setPrice(3.8f);
        p2.setQuantity(6);
        p2.setProductId("p2");
        p2.setProductName("product 2");

        Product p3 = new Product("p3", "product 3", 20.8f, 1);

        ProductManagement productManagement = new ProductManagement();
        productManagement.addProduct(p1);
        productManagement.addProduct(p2);
        productManagement.addProduct(p3);

        return productManagement;
    }
}
