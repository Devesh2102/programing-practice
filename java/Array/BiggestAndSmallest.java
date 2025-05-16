class BiggestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 22, 43, 24, 23, 54, 76, 55, 23, 45};

        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int biggest = arr[0], smallest = arr[0];

        for (int num : arr) {
            if (num > biggest) {
                biggest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("Biggest: " + biggest + ", Smallest: " + smallest);
    }
}
