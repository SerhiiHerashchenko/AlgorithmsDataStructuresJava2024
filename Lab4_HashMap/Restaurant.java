package Lab4_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Restaurant {
    private final HashMap<String, Order> orders = new HashMap<String, Order>();
    private final Set<Map.Entry<String, Order>> waiters_orders = orders.entrySet();

    public void add(Order order, String waiterName){
        if (orders.size()>=10) {
            System.out.println("All waiters are busy! Please, wait a little bit");
            return;
        }
        orders.put(waiterName, order);
    }

    public void remove(int orderNumber){
        final Set<Map.Entry<String,Order>> s = orders.entrySet();
        Order neededOrder = new Order();
        String neededWaiter = "";

        for (Order order : orders.values()) {
            if (order.GetOrderNumber() == orderNumber) {
                neededOrder = order;
                break;
            }
        }

        if (neededOrder.GetOrderNumber() == -1) {
            System.out.println("Order marked with this number doesn't exist");
            return;
        }

        for (Entry<String,Order> entry : s) {
            if (neededOrder.equals(entry.getValue())) {
                neededWaiter = entry.getKey();
            }
        }
        orders.remove(neededWaiter, neededOrder);
    }

    public Order get(int orderNumber){
        final Set<Map.Entry<String,Order>> s = orders.entrySet();
        Order neededOrder = new Order();
        String neededWaiter = "";

        for (Order order : orders.values()) {
            if (order.GetOrderNumber() == orderNumber) {
                neededOrder = order;
                break;
            }
        }

        if (neededOrder.GetOrderNumber() == -1) {
            return null;
        }

        for (Entry<String,Order> entry : s) {
            if (neededOrder.equals(entry.getValue())) {
                neededWaiter = entry.getKey();
            }
        }
        return orders.get(neededWaiter);
    } 

    @Override
    public String toString(){
        String s = "";
        final ArrayList<String> waiters = new ArrayList<>();
        for (Entry<String,Order> entry : waiters_orders) {
            waiters.add(entry.getKey());
        }
        for (String waiter : waiters) {
            s += (waiter + ":\n" + orders.get(waiter).toString() + "\n");
        }
        return s;
    }
}