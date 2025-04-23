class DigitSum {
    public static void main(String[] args) {
        int[] numbers = {124, 5023, 5101, 556, 322, 343, 214, 2343, 543, 106, 505, 223, 465};
        System.out.print("Numbers with digit sum equal to 7:-");

        for (int originalNumber : numbers) {
            int number = originalNumber;
            int digitSum = 0;

            while (number > 0) {
                int digit = number % 10;
                digitSum += digit;
                number /= 10;
            }

            if (digitSum == 7) {
                System.out.print(" " + originalNumber);
            }
        }
    }
}
