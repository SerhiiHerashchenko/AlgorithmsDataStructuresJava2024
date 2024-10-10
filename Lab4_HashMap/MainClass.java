package Lab4_HashMap;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        ArrayList<String> dishes1 = new ArrayList<String>();
        dishes1.add("суп");
        dishes1.add("пюре");
        ArrayList<String> dishes2 = new ArrayList<String>();
        dishes2.add("супчик");
        dishes2.add("пюрешка");

        Order order1 = new Order(1, "Julia", dishes1);
        Order order2 = new Order(2,"Julia2", dishes2);

        restaurant.addOrder(order1, "Hulio");
        restaurant.addOrder(order2, "Hulio");

        System.out.println(restaurant.toString());
    }
}
