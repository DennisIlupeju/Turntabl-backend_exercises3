
// UserService.java
public class UserService {
    private DatabaseInterface database;

    public UserService(DatabaseInterface database) {
        this.database = database;
    }

    public void addUser(String user) {
        database.save(user);
    }
}
