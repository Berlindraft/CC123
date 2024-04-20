/*
* @Author: Raymund Zyron Abella
* */
public class Activity2 {
    public static void main(String[] args) {
        // rows and columns prompt for array
        System.out.print("Enter number of rows: ");
        int rows = Zyron.readInt();
        System.out.print("Enter number of columns: ");
        int cols = Zyron.readInt();

        int[][] arr = new int[rows][cols];
//array initialization and declaration
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter value for row [" + i + "] col [" + j + "]: ");
                arr[i][j] = Zyron.readInt();
            }
        }
// calling and displaying the method calls with passing the values
        display(arr);
        sumOfRows(arr);
        sumOfCols(arr);
        minC(arr);
        maxC(arr);
    }
//display method that shows in tabular form
    public static void display(int arr[][]) {
        System.out.println("Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
//scans through the loop and adds the values in that row
    public static void sumOfRows(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("The total number in rows " + (i+1) + " of an array: " + sum);
        }
    }
    //scans through the loop and adds the values in that row
    public static void sumOfCols(int arr[][]) {
        for (int j = 0; j < arr[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][j];
            }
            System.out.println("The total number in col " + (j+1) + " of an array: " + sum);
        }
    }
    //scans through the loop and compare the smallest values with each column
    public static void minC(int arr[][]) {
        for (int j = 0; j < arr[0].length; j++) {
            int min = arr[0][j];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
            System.out.println("The col "+ (j+1) + " smallest number in an array is: " + min);
        }
    }
    //scans through the loop and compare the largest values with each column
    public static void maxC(int arr[][]) {
        for (int j = 0; j < arr[0].length; j++) {
            int max = arr[0][j];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.println("The col " + (j+1) + " largest number in an array is: " + max);
        }
    }
}