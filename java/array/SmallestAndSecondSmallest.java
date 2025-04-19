class SmallestAndSecondSmallest {
    public static void main(String[] args) {
        int[] numbers = {99, 99, 10, 5, 22, 43, 24, 23, 54, 76, 55, 23, 45};

        if (numbers.length < 2) {
            System.out.println("Array doesn't have enough elements.");
            return;
        }

        int smallestValue = numbers[0];
        int secondSmallestValue = Integer.MAX_VALUE;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallestValue) {
                secondSmallestValue = smallestValue;
                smallestValue = numbers[i];
            } else if (numbers[i] > smallestValue && numbers[i] < secondSmallestValue) {
                secondSmallestValue = numbers[i];
            }
        }

        System.out.println("Smallest value is: " + smallestValue);

        if (secondSmallestValue == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest value.");
        } else {
            System.out.println("Second smallest value is: " + secondSmallestValue);
        }
    }
}
