
// Main.java
public class Main {
    public static void main(String[] args) {
        Workable human = new HumanWorker();
        Workable robot = new RobotWorker();

        human.work();
        ((HumanWorker) human).eat();

        robot.work();
    }
}
