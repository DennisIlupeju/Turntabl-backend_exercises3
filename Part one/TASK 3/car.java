// Car.java
public class Car {
    private String model;
    private Engine engine; // Composition (Car owns Engine)

    public Car(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType); // Engine created inside Car
    }

    public void showDetails() {
        System.out.println(model + " has an engine of type: " + engine.getType());
    }
}