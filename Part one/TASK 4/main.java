// Main.java
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        System.out.println("Dog sound: " + dog.makeSound());
        System.out.println("Cat sound: " + cat.makeSound());
    }
}
