
// Database.java
public class Database implements DatabaseInterface {
    @Override
    public void save(String data) {
        System.out.println("Saving to SQL Database: " + data);
    }
}
