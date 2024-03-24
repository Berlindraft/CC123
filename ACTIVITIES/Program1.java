public class Program1 {
    public static void main(String [] args) {

//read input as 0 or 1
        System.out.println("Enter 0 or 1 as input:");
        int num1 = Zyron.readInt();
        int num2 = Zyron.readInt();
//output display
            System.out.println(" x ||  y  || results");
            System.out.println("---------------------");
//formula for results // converts the int values to boolean
        boolean bool1 = num1 != 0;
        boolean bool2 = num2 != 0;

            boolean results = !(bool1 ^ bool2);

//converting the boolean results during runtime
          int w;
            if(results){
                w = 1;
            }else
                w = 0;
//final row to print the results
        System.out.printf(" %d ||  %d  ||    %d", num1, num2, w);
    }
}
