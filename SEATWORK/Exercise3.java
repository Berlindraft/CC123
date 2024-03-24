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

public class Exercise3{
	public static void main(String[] args){
			int number = Zyron.readInt();
			//handles the positive numbers
			if (number > 0 && number % 2 == 0){
				System.out.println(number + " is a positive even number");
			}else{
				System.out.println(number + " is a positive odd number");
				}
			//handles the negative numbers
			if (number < 0 && number % 2 == 1){
				System.out.println(number + " is a negative even number");
			}else{
				System.out.println(number + " is a negative odd number");
					}
		}

	}