
// Main.java
public class Main {
    public static void main(String[] args) {
        Discount student = new StudentDiscount();
        Discount senior = new SeniorDiscount();

        System.out.println("Student pays: " + student.applyDiscount(100));
        System.out.println("Senior pays: " + senior.applyDiscount(100));
    }
}
