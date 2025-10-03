
// Main.java
public class Main {
    public static void main(String[] args) {
        FlyingBird sparrow = new Sparrow();
        sparrow.fly();  // Works fine

        Bird penguin = new Penguin();
        penguin.eat();  // Works fine
        ((Penguin) penguin).swim(); // Penguin swims
    }
}
