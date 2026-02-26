package za.ac.cput;

import za.ac.cput.domain.BurgerOrder;

public class Main {
    static void main(String[] args) {
        System.out.println("Hello Backend");

        BurgerOrder order1 = new BurgerOrder.Builder()
                .setBurgerName("KFC Zinger")
                .setBurgerSize("Larger")
                .setPrice(100.00)
                .setBurgerType("Cheese")
                .setUserOrderEmail("123456734@mycput.ac.za")
                .build();

        BurgerOrder order2 = new BurgerOrder.Builder()
                .setBurgerType("beef")
                .setPrice(85.50)
                .setBurgerName("Steers Classic")
                .setBurgerSize("Medium")
                .setUserOrderEmail("3124524@gmail.com")
                .build();

        BurgerOrder order3 = new BurgerOrder.Builder()
                .setBurgerName("Veggie Delight")
                .setBurgerType("veggie")
                .setBurgerSize("Small")
                .setPrice(45.00)
                // Optional: email not set
                .build();

        // Display orders
        System.out.println("=== BURGER ORDERS ===");
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);

    }
}
