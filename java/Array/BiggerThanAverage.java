class BiggerThanAverage {
    public static void main(String[] args) {
        int[] a = {3, 4, 3, 2, 2, 6, 7, 4, 5, 3};

        double sum = 0;
        int length = a.length;

        for (int num : a) {
            sum += num;
        }

        double avg = sum / length;
        System.out.println("Average is: " + avg);

        int count = 0;
        System.out.println("Numbers which are bigger than avg are:");
        for (int num : a) {
            if (num > avg) {
                System.out.println(num);
                count++;
            }
        }

        System.out.println("Total count of numbers which are bigger than average is: " + count);
    }
}
