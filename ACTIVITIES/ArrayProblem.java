/*
Author: Raymund Zyron Abella
*/
public class ArrayProblem {
    public static void main (String[] args){
		try{boolean status = true;
		do{
		int i = 0;
		int total = 0;
		int small = 0;
		int large = 0;
		int posEven = 0;
		int posOdd = 0;
		int negEven = 0;
        int negOdd = 0;
//variable initialization
        System.out.print("How many Integers: ");
        int cap = Zyron.readInt();
//array capacity prompt
        int[] arr = new int[cap];
//do while to get input
        do{
            System.out.print("Enter a number: ");
            arr[i] = Zyron.readInt();
//if statements to get positive/negative and odd/even numbers
            if (arr[i]>0 && arr[i]%2==0) {
                posEven += arr[i];
            }
            if (arr[i]>0 && arr[i]%2!=0) {
                posOdd += arr[i];
            }
            if (arr[i]<0 && arr[i]%2==0) {
                negEven += arr[i];
            }
            if (arr[i]<0 && arr[i]%2!=0) {
                negOdd += arr[i];
            }
            total += arr[i];

			i++;
        }while (i < cap);
//another for loop to get certain functions once the array is defined
        System.out.println("The array elements are: ");
        for(int j = 0; j < cap; j++) {
            System.out.println("array[" + j + "]" + " = " + arr[j]);
//smallest and largest values
            small = arr[0];
			if (arr[j] < small) {
			       small = arr[j];
			            }
			large = arr[0];
			if (arr[j] > large) {
			        large = arr[j];
            }
        }
//print statements
        System.out.println("Sum: " + total);
        System.out.println("Average: " + total/cap);
        System.out.println("Smallest:" + small);
        System.out.println("Largest:" + large);
        System.out.println("Sum of positive even numbers: " + posEven);
        System.out.println("Sum of negative even numbers: " + negEven);
        System.out.println("Sum of negative odd numbers: " + negOdd);
        System.out.println("Sum of positive odd numbers: " + posOdd);
        System.out.println();
        System.out.print("Press 1 to continue and 0 to exit...");
        int ch = Zyron.readInt();// prompts to loop again
        if(ch == 0){
			status = false;
			}
		}while (status);
	}catch (Exception e){ //catches invalid inputs
		System.out.println("Invalid Input!");
		}
    }
}
