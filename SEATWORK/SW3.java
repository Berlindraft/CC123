public class SW3 {
    public static void main (String[] args) {
        String ast1 = "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *";
        String ast2 = "* *";
        String ast3 = "* * *";
        String ast4 = "* * * *";
        String ast5 = "* * * * *";
        String spc = "  ";

        System.out.println(ast1 + "\n" + ast2 + "	\tProgramming Assignment 1\t	" + ast2);
        System.out.println(ast3 + spc + spc + "\tComputer Programming I\t\t" + "  " + spc + spc + ast3);
        System.out.println(ast4 + "  " + "  \t  Author: Duffy Ducky\t\t" + "    " + ast4);
        System.out.println(ast5 + spc + " " + "\tDue Date: Wednesday, March 10\t"  + spc + ast5 + "\n" + ast1);

    }
}