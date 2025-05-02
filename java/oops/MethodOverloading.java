class MethodOverloading {
    public static void main(String[] args) {
        main(1);
        main(2, 7);
        main("abc");
    }

    // Overloaded main method with two int parameters
    public static void main(int a, int b) {
        System.out.println("Overloaded main with int a and int b: " + a + ", " + b);
    }

    // Overloaded main method with a String parameter
    public static void main(String a) {
        System.out.println("Overloaded main with String a: " + a);
    }

    // Overloaded main method with a single int parameter
    public static void main(int a) {
        System.out.println("Overloaded main with int a: " + a);
    }
}
