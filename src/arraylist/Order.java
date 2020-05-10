package arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Order {
    String orderId;
    double orderAmount;
    String customerVipLevel;
    ArrayList<Product> products = new ArrayList<>();
    private double vipAmount;
    static int aNumber = 1;

    private double discountedAmount() {
        double discountedAmount;
        if (orderAmount < 1000) {
            discountedAmount = orderAmount;
        } else if (orderAmount >= 1000 && orderAmount < 2000) {
            discountedAmount = 0.98 * orderAmount;
        } else if (orderAmount >= 2000 && orderAmount < 3000) {
            discountedAmount = 0.95 * orderAmount;
        } else {
            discountedAmount = 0.92 * orderAmount;
        }
        return discountedAmount;
    }

    public double vipAmount() {
        if (this.customerVipLevel == "gold") {
            this.vipAmount = discountedAmount() * 0.98;
        } else if (this.customerVipLevel == "diamond") {
            this.vipAmount = discountedAmount() * 0.96;
        } else if (this.customerVipLevel == "super") {
            this.vipAmount = discountedAmount() * 0.92;
        }
        return this.vipAmount;
    }

    public static void printSomething() {
        System.out.println("this is a static method");
    }

}
