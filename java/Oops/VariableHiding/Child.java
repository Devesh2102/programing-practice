class Child extends Parent {
    int num = 20;

    void show() {
        System.out.println("Child num: " + num);
        System.out.println("Parent num: " + super.num);
    }
}
