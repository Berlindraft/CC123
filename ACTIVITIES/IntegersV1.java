/*
 * @IntegersV1.java
 * @Author: Raymund Zyron Abella
 * @Date: March 21, 2024
 * @ver 1.1
 */
public class IntegersV1 {

    public static void main(String[] args) {
        try {

            boolean status = true;  //boolean initialization for looping
            do{  // repeats the entire code in the user opts so
            int i = 0;
            int j = 0;
            int total = 0;
            int plus = 0;
            int minus = 0;
            int plusCount = 0;
            int minusCount = 0;
//variable initialization

            System.out.print("How many integers: ");
            int intCap = Zyron.readInt();
            int[] num = new int[intCap];
// array of numbers for input
            if (intCap > 0) { // only executes if the array capacity is greater than 0
                do {
                    System.out.print("Enter number: "); //enter number prompt
                    num[i] = Zyron.readInt();
//calculates the total numbers in the array
                    total += num[i];
//determines whether the number is greater or less than 0 then adds a counter
                    if (num[i] > 0) {
                        plus += num[i];
                        plusCount++;
                    }
                    if (num[i] < 0) {
                        minus += num[i];
                        minusCount++;
                    }

                    i++;
                } while (i < intCap);

//get the largest and smallest value in a different loop
                int largest = num[0]; //sets first the largest value the first number in the array
                int smallest = num[0]; //sets first the smallest value the first number in the array
                 do {
                    if (largest < num[j]) {
                        largest = num[j];
                    }
                    if (num[j] < smallest) {
                        smallest = num[j];
                    }
                    j++;
                }while (j < intCap);

                System.out.println("======================================");
                System.out.println("Total: " + total);
                System.out.println("Average: " + (double) total / intCap);
                System.out.println("Largest Value: " + largest);
                System.out.println("Smallest Value: " + smallest);
                System.out.println("Total of Positive Numbers: " + plus);
                System.out.println("Total of Negative Numbers: " + minus);
                System.out.println("Number of Positive Numbers: " + plusCount);
                System.out.println("Number of Negative Numbers: " + minusCount);
                System.out.println("======================================");
                System.out.println("[ 1 ] - continue \t [ 0 ] - exit");
                System.out.print("Input: ");
                int ch = Zyron.readInt();
                    if(ch == 0){
                        status = false; // sets the loop status to false if the user wants to exit
                    }
                }
            } while(status);
        } catch (Exception e) { //try catch function to handle invalid inputs
            System.out.println("Invalid Input");
        }
    }
}
