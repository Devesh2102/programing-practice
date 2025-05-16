class PrimeNumbers {
    public static void main(String[] args) {
        int[] numbers = {11, 13, 112, 332, 15, 17, 53, 2345, 4354, 33};
        System.out.println("Prime numbers in the array:");

        for (int currentNumber : numbers) {
            if (currentNumber < 2) {
                continue; // Skip numbers less than 2 (not prime)
            }

            boolean isPrime = true;

            for (int i = 2; i <= currentNumber / 2; i++) {
                if (currentNumber % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(currentNumber + " is a prime number.");
            }
        }
    }
}
