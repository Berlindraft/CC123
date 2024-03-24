public class zyron2{
	public static void main(String[] args){
		System.out.println("1 + 2 = " + 1 + 2);
		System.out.println("1 + 2 = " + (1 + 2));
		System.out.println(1 + 2 + "abc");
		System.out.println("abc" + 1 + 2);

		int result = +-~17;
        System.out.println("Result: " + result);

        // Pre-decrement example
		int x = 5;
		int y = --x; // Decrement x first, then assign to y
		System.out.println("Pre-decrement:");
		System.out.println("x: " + x); // Output: 4
		System.out.println("y: " + y); // Output: 4

		// Post-decrement example
		int a = 5;
		int b = a--; // Assign a to b first, then decrement a
		System.out.println("\nPost-decrement:");
		System.out.println("a: " + a); // Output: 4
        System.out.println("b: " + b); // Output: 5

	}
}