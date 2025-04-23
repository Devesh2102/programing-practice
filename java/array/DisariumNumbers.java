class DisariumNumbers {
    public static void main(String[] args) {
        int[] numbers = {4, 11, 32, 153, 344, 45, 54, 89, 135, 518};
        printDisariumNumbers(numbers);
    }

    public static void printDisariumNumbers(int[] numbers) {
        System.out.println("Disarium numbers in the array:");

        for (int number : numbers) {
            int originalNumber = number;
            int digitCount = getDigitCount(number);
            int disariumSum = 0;

            while (number > 0) {
                int currentDigit = number % 10;
                disariumSum += calculatePower(currentDigit, digitCount);
                digitCount--;
                number /= 10;
            }

            if (originalNumber == disariumSum) {
                System.out.println(originalNumber + " is a Disarium number.");
            }
        }
    }

    public static int getDigitCount(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int calculatePower(int base, int exponent) {
        int result = 1;
        while(exponent-- > 0) {
            result *= base;
        }
        return result;
    }
}
