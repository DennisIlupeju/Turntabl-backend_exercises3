// Main.java
public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        FileSaver saver = new FileSaver();

        String content = report.generateReport();
        saver.saveToFile(content, "report.txt");
    }
}
