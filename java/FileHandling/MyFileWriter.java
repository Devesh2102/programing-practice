import java.io.FileWriter;
import java.io.IOException;

class MyFileWriter{
    public static void main(String[] args) {
        // Path of the file to write into
        String filePath = "fileCreatedByJava.txt";

        // Try-with-resources ensures FileWriter is closed automatically
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("THIS TEXT IS GOING TO BE WRITTEN IN FILE..");
            System.out.println("Successfully written in file.");
        } catch (IOException e) {
            System.out.println("An I/O Exception occurred:");
            e.printStackTrace();
        }
    }
}
