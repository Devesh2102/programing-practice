import java.io.File;

class FileChecker {
    public static void main(String[] args) {
        // Define the path of the file to be checked
	//String filePath = "new_folder/fileCreatedByJava.txt";
	String filePath = "fileCreatedByJava.txt";


        // Create a File object
        File file = new File(filePath);

        // Check if the file exists
        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("File Location: " + file.getAbsolutePath());
            System.out.println("Is File Readable? " + file.canRead());
            System.out.println("Is File Writable? " + file.canWrite());
            System.out.println("File Size (bytes): " + file.length());
        } else {
            System.out.println("File does not exist at: " + filePath);
        }
    }
}
