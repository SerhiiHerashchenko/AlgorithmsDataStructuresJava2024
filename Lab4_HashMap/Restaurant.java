package Lab4_HashMap;
import java.util.HashMap;

public class Restaurant {
    HashMap<WaiterNumber, Order> orders;

    public void addOrder(Order order, String waiterName){
        if (orders.size()>10) {
            System.out.println("All waiters are busy! Please, wait a little bit");
            return;
        }
        orders.put(new WaiterNumber(waiterName, order), order);
    }

    public void removeOrder(int orderNumber){
        orders.
    }
}
