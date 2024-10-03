package Lab4_HashMap;
import java.util.ArrayList;

public class Order {
    int orderNumber;
    String customerName;
    ArrayList<String>dishes;

    public Order(int orderNumber, String customerName, ArrayList<String> dishes){
        this.customerName = customerName;
        this.orderNumber = orderNumber;
        this.dishes = dishes;
    }
}
