public class looping2 {
    public static void main(String[] args) {
        int x = 1, y = 10, z = 2;

        do {
            x++;
            y -= x;
            z *= y;
            System.out.println("Value of x: " + x);
            System.out.println("Value of y: " + y);
            System.out.println("Value of z: " + z);
        } while (x < 5);
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println("Value of z: " + z);
    }
}
