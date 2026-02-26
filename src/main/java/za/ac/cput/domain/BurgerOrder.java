package za.ac.cput.domain;

import java.util.Objects;

public class BurgerOrder {

    private String burgerName;      // Name of the burger (e.g., steers, burger king, kfc)
    private String burgerType;       // chicken, beef, veggie
    private String burgerSize;        // Small, Medium, Large
    private double price;            // Base price of the burger
    private String userOrderEmail;   // Customer's email for order confirmation


    public BurgerOrder() {
    }

    //TODO: come back here and add a constructor with the builder class
    // like private BurgerOrder(Builder builder){}

    private BurgerOrder(Builder builder) {
        this.burgerName = builder.burgerName;
        this.burgerType = builder.burgerType;
        this.burgerSize = builder.burgerSize;
        this.price = builder.price;
        this.userOrderEmail = builder.userOrderEmail;
    }


    public String getBurgerName() {
        return burgerName;
    }

    public String getBurgerType() {
        return burgerType;
    }

    public String getBurgerSize() {
        return burgerSize;
    }

    public double getPrice() {
        return price;
    }

    public String getUserOrderEmail() {
        return userOrderEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof BurgerOrder that)) return false;
        return Double.compare(getPrice(), that.getPrice()) == 0 &&
                Objects.equals(getBurgerName(), that.getBurgerName()) &&
                Objects.equals(getBurgerType(), that.getBurgerType()) &&
                Objects.equals(getBurgerSize(), that.getBurgerSize()) &&
                Objects.equals(getUserOrderEmail(), that.getUserOrderEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBurgerName(), getBurgerType(),
                getBurgerSize(), getPrice(), getUserOrderEmail());
    }

    @Override
    public String toString() {
        return "BurgerOrder{" +
                "burgerName='" + burgerName + '\'' +
                ", burgerType='" + burgerType + '\'' +
                ", burgerSize='" + burgerSize + '\'' +
                ", price=R" + price +
                ", userOrderEmail='" + userOrderEmail + '\'' +
                '}';
    }

    public static class Builder {
        private String burgerName;
        private String burgerType;
        private String burgerSize;
        private double price;
        private String userOrderEmail;

        public Builder setBurgerName(String burgerName) {
            this.burgerName = burgerName;
            return this;
        }

        public Builder setBurgerType(String burgerType) {
            this.burgerType = burgerType;
            return this;
        }

        public Builder setBurgerSize(String burgerSize) {
            this.burgerSize = burgerSize;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setUserOrderEmail(String userOrderEmail) {
            this.userOrderEmail = userOrderEmail;
            return this;
        }

        public BurgerOrder build(){
            return new BurgerOrder(this);
        }
    }
}
