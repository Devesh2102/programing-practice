import java.io.*;
import java.util.*;

class FileCRUD {

    static final String FILE_NAME = "users.txt";

    // Create a new user and append to file
    public static void createUser(String id, String name, String email) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true));
        writer.write(id + "," + name + "," + email);
        writer.newLine();
        writer.close();
        System.out.println("User created successfully.");
    }

    // Read all users
    public static void readUsers() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
        String line;
        System.out.println("ID\tName\tEmail");
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 3) {
                System.out.println(parts[0] + "\t" + parts[1] + "\t" + parts[2]);
            }
        }
        reader.close();
    }

    // Update user by ID
    public static void updateUser(String id, String newName, String newEmail) throws IOException {
        File inputFile = new File(FILE_NAME);
        File tempFile = new File("temp.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String line;
        boolean found = false;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts[0].equals(id)) {
                writer.write(id + "," + newName + "," + newEmail);
                found = true;
            } else {
                writer.write(line);
            }
            writer.newLine();
        }
        writer.close();
        reader.close();

        if (found) {
            inputFile.delete();
            tempFile.renameTo(inputFile);
            System.out.println("User updated successfully.");
        } else {
            tempFile.delete();
            System.out.println("User not found.");
        }
    }

    // Delete user by ID
    public static void deleteUser(String id) throws IOException {
        File inputFile = new File(FILE_NAME);
        File tempFile = new File("temp.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String line;
        boolean found = false;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (!parts[0].equals(id)) {
                writer.write(line);
                writer.newLine();
            } else {
                found = true;
            }
        }
        writer.close();
        reader.close();

        if (found) {
            inputFile.delete();
            tempFile.renameTo(inputFile);
            System.out.println("User deleted successfully.");
        } else {
            tempFile.delete();
            System.out.println("User not found.");
        }
    }

    // Main Menu
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- User Management System ---");
            System.out.println("1. Create User");
            System.out.println("2. Read Users");
            System.out.println("3. Update User");
            System.out.println("4. Delete User");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    createUser(id, name, email);
                    break;
                case 2:
                    readUsers();
                    break;
                case 3:
                    System.out.print("Enter ID to update: ");
                    String uid = sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter New Email: ");
                    String newEmail = sc.nextLine();
                    updateUser(uid, newName, newEmail);
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    String did = sc.nextLine();
                    deleteUser(did);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
