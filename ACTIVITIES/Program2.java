
public class Program2 {
    public static void main(String[] args){
        try { //started with a try catch to catch any errors during input
            System.out.println("==========CABLE BILL==========");
            System.out.print("Enter the account number: ");
            int accNumber = Zyron.readInt();

            System.out.println("Enter the customer type ");
            System.out.print("(r/R - Residential || b/B - Business): ");
            String accType = Zyron.readString();
//initial values assigned
            double amountDue = 0;
            double billProcess = 0;
            double basicServiceFee = 0;

//depending on the customer type the following if conditions are executed
            if(accType.equalsIgnoreCase("R"))
            {
                System.out.print("Enter the number of premium channels: ");
                int premiumChannels = Zyron.readInt();
                billProcess = 4.5;
                basicServiceFee = 20.5;
                amountDue = billProcess + basicServiceFee + (premiumChannels * 7.5);
            }
            else if (accType.equalsIgnoreCase("B"))
            {
                System.out.print("Enter the number of basic service connection: ");
                int accService = Zyron.readInt();

                System.out.print("Enter the number of premium channels: ");
                int premiumChannels = Zyron.readInt();
                billProcess = 15.0;
//if the basic service connection is more than 10
                    if(accService <= 10)
                    {
                        basicServiceFee = 75;
                    }
                    else
                    {
                        int remService = accService % 10;
                        basicServiceFee = 75 + (remService * 5);
                    }

                amountDue = billProcess + basicServiceFee + (premiumChannels * 50.0);

            }
//output display
            System.out.println("==============================");
            System.out.println("Account Number: " + accNumber);
            System.out.println("Amount due: " + amountDue);
        } catch (Exception e) {
            System.out.println("Invalid Input");
            System.out.println("Try again!");
        }
    }
}
