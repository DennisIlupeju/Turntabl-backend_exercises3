
// SeniorDiscount.java
public class SeniorDiscount extends Discount {
    @Override
    public double applyDiscount(double price) {
        return price * 0.7; // 30% off
    }
}
