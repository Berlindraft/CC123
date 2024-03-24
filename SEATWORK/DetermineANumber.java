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

public class DetermineANumber{
	public static void main(String[] args){
			System.out.print("Enter a number: ");
			int number = Zyron.readInt();
			String printx;
	//positive even numbers
			if ((number > 0) && (number % 2 == 0)){
				printx = " is a positive even number";}
	//negative even numbers
			else if((number < 0) && (number % 2 == 0)){
				printx = " is a negative even number";}
	//negative odd numbers
			else if((number < 0) && (number % 2 != 0)){
				printx  = " is a negative odd number";}
	//positive odd numbers
			else if((number > 0) && (number % 2 != 0)) {
				printx = " is a positive odd number";}
	//when input is 0
			else{printx = " is zero";}
			System.out.println(number + printx);
		}
	}




