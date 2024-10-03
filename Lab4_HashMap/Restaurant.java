package Lab4_HashMap;
import java.util.HashMap;

public class Restaurant {
    HashMap<String, Order> orders;

    public void addOrder(Order order, String waiterName){
        if (orders.size()>10) {
            System.out.println("All waiters are busy! Please, wait a little bit");
            return;
        }
        orders.put(waiterName, order);
    }
}
