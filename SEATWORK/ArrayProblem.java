public class ArrayProblem {
    public static void main (String[] args){
        int i = 0;
        int total = 0;
        int small = 0;
        int large = 0;
        int posEven = 0;
        int posOdd = 0;
        int negEven = 0;
        int negOdd = 0;

        System.out.print("How many Integers: ");
        int cap = Zyron.readInt();

        int[] arr = new int[cap];
        do{
            System.out.print("Enter a number: ");
            arr[i] = Zyron.readInt();
            i++;
            total += arr[i];
            if (arr[i]>0 && arr[i]%2==0) {
                posEven += arr[i];
            }
            if (arr[i]>0 && arr[i]%2!=0) {
                posOdd += arr[i];
            }
            if (arr[i]<0 && arr[i]%2==0) {
                negEven += arr[i];
            }
            if (arr[i]>0 && arr[i]%2!=0) {
                negOdd += arr[i];
            }

        }while (i < cap);
        System.out.println("The array elements are: ");
        for(int j = 0; j < cap; j++) {
            System.out.println("array[" + j + "]" + " = " + arr[j]);
            small = arr[0];
            if (arr[j] < small) {
                small = arr[j];
            }
            large = arr[0];
            if (arr[j] > large) {
                large = arr[j];
            }
        }
        System.out.println("Sum: " + total);
        System.out.println("Average: " + total/cap);
        System.out.println("Smallest:" + small);
        System.out.println("Largest:" + large);
        System.out.println("Sum of positive even numbers: " + posEven);
        System.out.println("Sum of negative even numbers: " + negEven);
        System.out.println("Sum of negative odd numbers: " + negOdd);
        System.out.println("Sum of positive odd numbers: " + posOdd);

    }
}
