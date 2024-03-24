public class Receipt{
	public static void main (String [] args){
	double discount;

			System.out.println("Enter the product number: ");
			@SuppressWarnings("unused")
			String productNum = Zyron.readString();

			System.out.println("Enter the description: ");
			String productDes = Zyron.readString();

			System.out.println("Enter the unit price ");
			double unitP = Zyron.readDouble();

			System.out.println("Quantity of product: ");
			double quantity = Zyron.readDouble();

	//calculates the total item price
	double itemT = unitP * quantity;
	//applies the discount to the items
	if(quantity > 10){
		discount = itemT * 0.05;
		}else{
			discount = itemT * 0.02;
			}

	double discountedp = (itemT - discount);
	double vat = discountedp * 0.12;

	double Totalp = discountedp + vat;
	System.out.println("-------------------------------");
	System.out.println("Item: " + productDes + "\t" + "Price: " + unitP +  "\n" + "Qnty: "+ quantity);
	System.out.println("-------------------------------\n");
	System.out.println("Total is: Php " + Totalp);
	System.out.println("Discount: " + discount);
	System.out.println("VAT: " + vat);
	System.out.println("\n-------------------------------\n");


	System.out.print("Enter Amount: Php ");
	double amount = Zyron.readDouble();
	while (amount < Totalp){
		System.out.println("Not enough money!");
		System.out.print("Enter Amount: Php ");
		amount = Zyron.readDouble();
	}
	double change = amount - Totalp;
	System.out.println("Your Change is: Php " + change);



	}
}