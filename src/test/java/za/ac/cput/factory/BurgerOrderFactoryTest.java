package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.BurgerOrder;

import static org.junit.jupiter.api.Assertions.*;

class BurgerOrderFactoryTest {

    @Test
    void createBurgerOrder() {
        BurgerOrder order1 = BurgerOrderFactory.createBurgerOrder("The Big Mjojo Burger",
                " Beef  Burger (Premium BBQ)",
                "Large", 119.00,
                "123456723@mycput.ac.za");
        System.out.println(order1);
    }
}