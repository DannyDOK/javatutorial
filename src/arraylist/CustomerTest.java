package arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Order order = new Order();
        Product product = new Product();

        product.price = 750.23f;
        product.quantity = 5;
        product.productId = "1";
        product.productName = "Phone";

        customer.userId = "1";
        customer.userName = "Danny";
        customer.userVipLevel = "super";

        order.customerVipLevel = customer.userVipLevel;
        order.products.add(product);
        order.orderId = "1";
        order.orderAmount = 3500.25;

        System.out.println(order.vipAmount());

        ArrayList<ArrayList> list = new ArrayList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();
        listTwo.add(5);
        listTwo.add(10);
        list.add(listTwo);
        System.out.println(list.get(0).get(1));

        Order.printSomething();
        System.out.println(Order.aNumber);
    }
}
