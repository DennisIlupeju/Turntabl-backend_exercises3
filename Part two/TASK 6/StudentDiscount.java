/ StudentDiscount.java
public class StudentDiscount extends Discount {
    @Override
    public double applyDiscount(double price) {
        return price * 0.8; // 20% off
    }
}