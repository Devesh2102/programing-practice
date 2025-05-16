import java.io.File;
import java.io.IOException;

class FileCreator {
    public static void main(String[] args) throws IOException {
        // Define the file path where the new file will be created
        String filePath = "fileCreatedByJava.txt";

        // Create a File object with the given path
        File newFile = new File(filePath);

        // Attempt to create the file
        if (newFile.createNewFile()) {
            System.out.println("File created successfully at: " + filePath);
        } else {
            System.out.println("File already exists or couldn't be created.");
        }
    }
}
