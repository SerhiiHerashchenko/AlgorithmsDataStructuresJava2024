package Lab4_HashMap;
import java.util.ArrayList;

public class Order {
    private final int orderNumber;
    private final String customerName;
    private final ArrayList<String>dishes;

    public Order(int orderNumber, String customerName, ArrayList<String> dishes){
        this.customerName = customerName;
        this.orderNumber = orderNumber;
        this.dishes = dishes;
    }

    public int GetOrderNumber(Order order){
        return this.orderNumber;
    }

    @Override
    public int hashCode(){
        return orderNumber;
    }
}
