public class looping {
    public static void main(String[] args) {
        int c = 1;
        int a;
        int b = 0;

        for (a = 10; a > 0; a -= 2) {
            for (b = 2; b < a; b += 2) {
                c += b * a;
                System.out.println("Value of a: " + a);
                System.out.println("Value of b: " + b);
                System.out.println("Value of c: " + c);
            }
        }
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        System.out.println("Value of c: " + c);
    }
}
