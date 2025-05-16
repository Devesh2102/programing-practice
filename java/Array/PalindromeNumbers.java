class PalindromeNumbers {
    public static void main(String[] args) {
        int[] numbers = {121, 1212, 3132, 1331, 135, 17971, 5343, 2345};

        System.out.println("Palindrome numbers:");

        for (int originalNumber : numbers) {
            int number = originalNumber;
            int reversedNumber = 0;

            // Reverse the number
            while (number > 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }

            // Check if the original number is equal to its reversed version (Palindrome check)
            if (originalNumber == reversedNumber) {
                System.out.println(originalNumber + " is a palindrome number.");
            }
        }
    }
}
