class EvenIndexElements {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	System.out.print("Even index elements are: ");
        for (int i = 0; i < arr.length; i += 2) {
           System.out.print(" " + arr[i]);
        }
    }
}
