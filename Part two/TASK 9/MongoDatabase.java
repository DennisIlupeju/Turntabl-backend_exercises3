
// MongoDatabase.java
public class MongoDatabase implements DatabaseInterface {
    @Override
    public void save(String data) {
        System.out.println("Saving to MongoDB: " + data);
    }
}
