class IncrementDecrement {
    public static void main(String[] args) {
        int num = 5;

        System.out.println("Original: " + num);
        System.out.println("Post-increment: " + (num++));
        System.out.println("After Post-increment: " + num);
        System.out.println("Pre-increment: " + (++num));

        System.out.println("Post-decrement: " + (num--));
        System.out.println("After Post-decrement: " + num);
        System.out.println("Pre-decrement: " + (--num));
    }
}
