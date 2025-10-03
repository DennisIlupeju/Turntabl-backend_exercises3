// FileSaver.java
import java.io.FileWriter;
import java.io.IOException;

public class FileSaver {
    public void saveToFile(String data, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(data);
            System.out.println("Report saved to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}