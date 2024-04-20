/* 
 * Author: Raymund Zyron Abella
*/
public class methods {
    public static void main(String[] args) { // main method
        int cons = 5;
        int cons2 = 7;
// read number prompt
        System.out.print("Enter a number: ");
        int num1 = Zyron.readInt();
        System.out.print("Enter another number: ");
        int num2 = Zyron.readInt();
// print statements
        System.out.println(num1 + " + " + num2 + " = " + Summer(num1, num2));
        System.out.println(num2 + " - " + num1 + " = " + Differ(num2, num1));
        System.out.println(cons*2 + " - " + cons + " = " + Differ(cons*2, cons));
        System.out.println(cons + " * " + num1 + " = " + Multiply(cons, num1));
        System.out.println(num1 + " / " + "2" + " = " + doubleDivide(num1, 2));
        System.out.println(cons2 + " / " + cons + " = "+ doubleDivide(cons2, cons));
        System.out.println("2" + " % " + cons+ " = " + Mod(2, cons));
        System.out.println(cons + " ^ " + "2" +  " = " + Expo(cons));
    }

public static int Summer(int c1, int c2){
    return c1 + c2;
}// addition method
public static int Differ(int c1, int c2){
    return c1 - c2;
}// subtraction method
public static int Multiply(int c1, int c2){
    return c1 * c2;
}// multiplication method
public static double doubleDivide(int c1, int c2){
    return (double)c1 / c2;
}// division method
public static int Mod(int c1, int c2){
    return c1 % c2;
}// modulo method
public static int Expo(int c){
    return c * c;
}// exponent method
}
