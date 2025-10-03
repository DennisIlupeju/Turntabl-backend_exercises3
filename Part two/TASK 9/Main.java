
// Main.java
public class Main {
    public static void main(String[] args) {
        DatabaseInterface sqlDb = new Database();
        DatabaseInterface mongoDb = new MongoDatabase();

        UserService userService1 = new UserService(sqlDb);
        userService1.addUser("Alice");

        UserService userService2 = new UserService(mongoDb);
        userService2.addUser("Bob");
    }
}
