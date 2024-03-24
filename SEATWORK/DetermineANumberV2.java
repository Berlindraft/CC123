/*
Problem: Write a Java program that will require the user
to input a number. Determine the number
Version1 = use if and else
Version2 = use ternary operator

Sample Output
1 is a Positive Odd Number
-1 is Negative Odd Number
2 is a Positive Even Number
-2 is a Negative Even Number

Author: Raymund Zyron Abella
Date Started:Feb 21, 2024
Date Submitted:Feb 21, 2024
@DetermineANumber.java
*/

public class DetermineANumberV2{
	public static void main(String[] args){
			System.out.print("Enter a number: ");
			int number = Zyron.readInt();
	//use of the ternary operator
		String x = (number > 0)? "Positive" : "Negative";
		String y = (number % 2 == 0)? "Even" : "Odd";
		System.out.println(number + " is a " + x + " " + y + " Number");
		}
	}




