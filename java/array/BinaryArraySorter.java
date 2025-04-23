import java.util.Arrays;

class BinaryArraySorter{
    public static void main(String[] args) {
        int[] a = {0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0};

        int left = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                int temp = a[i];
                a[i] = a[left];
                a[left] = temp;
                left++;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
