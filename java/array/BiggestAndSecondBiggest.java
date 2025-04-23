class BiggestAndSecondBiggest {
    public static void main(String[] args) {
        int[] numbers = {99, 99, 10, 5, 22, 43, 24, 23, 54, 76, 55, 23, 45};

        if (numbers.length < 2) {
            System.out.println("Array doesn't have enough elements.");
            return;
        }

        int biggestValue = numbers[0];
        int secondBiggestValue = Integer.MIN_VALUE;  // -2147483648

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > biggestValue) {
                secondBiggestValue = biggestValue;
                biggestValue = numbers[i];
            } else if (numbers[i] < biggestValue && numbers[i] > secondBiggestValue) {
                secondBiggestValue = numbers[i];
            }
        }

        System.out.println("Biggest value is: " + biggestValue);

        if (secondBiggestValue == Integer.MIN_VALUE) {
            System.out.println("There is no second biggest value.");
        } else {
            System.out.println("Second biggest value is: " + secondBiggestValue);
        }
    }
}
