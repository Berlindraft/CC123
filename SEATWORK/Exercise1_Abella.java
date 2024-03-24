
public class Exercise1_Abella {

	public static void main(String[] args) {

		int num1, num2, add, sub, mult, div, mod, exp;
		boolean equal, not, great, less, gequal, lequal;

		System.out.println("Enter first number:");
		num1 = Zyron.readInt();
		System.out.println("Enter second number:");
		num2 = Zyron.readInt();

		add = num1 + num2;
		sub = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;
		mod = num1 % num2;
		exp = num1 * num1;

		System.out.println("=== Basic Operators ===");
		System.out.println( num1 + " + " + num2 + " = " + add);
		System.out.println( num1 + " - " + num2 + " = " + sub);
		System.out.println( num1 + " * " + num2 + " = " + mult);
		System.out.println( num1 + " / " + num2 + " = " + div);
		System.out.println( num1 + " % " + num2 + " = " + mod);
		System.out.println( num1 + " ^ " + "2" + " = " + exp);


		equal = num1==num2;
		not = num1!=num2;
		great = num1>num2;
		less = num1<num2;
		gequal = num1>=num2;
		lequal = num1<=num2;



		System.out.println("=== Relational Operators ===");
		System.out.println( num1 + " == " + num2 + " = " + equal);
		System.out.println( num1 + " != " + num2 + " = " + not);
		System.out.println( num1 + " > " + num2 + " = " + great);
		System.out.println( num1 + " < " + num2 + " = " + less);
		System.out.println( num1 + " >= " + num2 + " = " + gequal);
		System.out.println( num1 + " <= " + num2 + " = " + lequal);

	}

}
