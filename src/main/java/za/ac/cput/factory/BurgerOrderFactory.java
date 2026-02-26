package za.ac.cput.factory;

import za.ac.cput.domain.BurgerOrder;
import za.ac.cput.util.Helper;

public class BurgerOrderFactory {
    public static BurgerOrder createBurgerOrder(String burgerName, String burgerType, String burgerSize, double price, String userOrderEmail) {

        if (Helper.isNullOrEmpty(burgerName) || Helper.isNullOrEmpty(burgerType) || Helper.isNullOrEmpty(burgerSize) || Helper.isNullOrEmpty(userOrderEmail)){
            return null;
        }

        if (!Helper.isValidEmail(userOrderEmail)){
            return null;
        }

        return new BurgerOrder.Builder()
                .setBurgerType(burgerType)
                .setBurgerName(burgerName)
                .setBurgerSize(burgerSize)
                .setPrice(price)
                .setUserOrderEmail(userOrderEmail)
                .build();
    }
}
