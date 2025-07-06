import java.util.Scanner;

public class HexToBinarySimple {
    public static void main(String[] args) {
        String[] hexBits = {
            "0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String hex = scanner.nextLine().toLowerCase(); 
        scanner.close();

        String binary = "";
        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);

            if (ch >= '0' && ch <= '9') {
                binary += hexBits[ch - '0'];
            } else if (ch >= 'a' && ch <= 'f') {
                binary += hexBits[10 + (ch - 'a')];
            } else {
                System.out.println("Invalid hexadecimal character: " + ch);
                return;
            }
        }
        System.out.println("The equivalent Binary for hexadecimal " + hex + " is " + binary);
    }
}

