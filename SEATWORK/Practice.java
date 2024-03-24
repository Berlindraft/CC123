 /*
 Author: Raymund Zyron Abella
 Date Started: Feb 22, 2024
 Date Submitted: Feb 22, 2024
 Activity.java
 */
 public class Practice{
	 public static void main(String[] args){

		System.out.println("-------[MONTHLY PAYCHECK]-------\n");
//gets base salary
		 System.out.print("Enter base Salary: Php ");
		 double base_salary = Zyron.readDouble();
//gets years worked
		 System.out.print("\nEnter years worked: ");
		 double years_worked = Zyron.readDouble();
//gets total sales made for the month
		 System.out.print("\nEnter total sales made: Php ");
		 double total_sales = Zyron.readDouble();
//for calculating monthly bonus based on the years worked
		 double bonus = ( years_worked > 5)? years_worked * 20 : years_worked * 10;
//or getting additional bonus based on the total sales commission
		 double additional_bonus = (total_sales < 10000)?((total_sales >= 5000)?(total_sales * 0.03):(total_sales + 0)):(total_sales * 0.06);
//calculation for total paycheck
		double paycheck = 	base_salary + bonus + additional_bonus;

		System.out.println("\n------------[TOTAL]-------------");

		System.out.println("\nBonus:  Php " + bonus + "\n");
		System.out.println("\nAdditional Bonus:  Php " + additional_bonus + "\n");
		System.out.println("\nMonthly paycheck:  Php " + paycheck + "\n");
		System.out.println("--------------------------------");
		 }
	 }