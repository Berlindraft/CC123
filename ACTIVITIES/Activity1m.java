public class Activity1m {
    public static void main (String[] args){
        double tax = 0;
    //getting user input
        System.out.print("Enter employee number: ");
        String employeeID = Zyron.readString();

        System.out.print("Enter employee name: ");
        String employeeName = Zyron.readString();

        System.out.print("Enter hours worked: ");
        double employeeHours = Zyron.readDouble();

        System.out.print("Enter rate per hour: ");
        double employeeRph = Zyron.readDouble();

        double salary = employeeHours * employeeRph;
    //conditions to calculate tax formula
        if(salary <= 50000){
            tax = salary * 0.1;
        }else if(salary > 50000 && salary <= 100000){
            tax = 5000 + (salary * 0.15);
        }else if(salary > 100000 && salary <= 200000){
            tax = 15000 + (salary * 0.2);
        }else if(salary > 200000) {
            tax = salary * 0.25;
        }
    //net salary calculations
        double netSalary = salary - tax;
    //output
        System.out.println("================================");
        System.out.println("Employee Number: " + employeeID);
        System.out.println("Name: " + employeeName);
        System.out.println("================================");
        System.out.println("Hours Worked: " + employeeHours);
        System.out.println("Rate per Hour: " + employeeRph);
        System.out.println("================================");
        System.out.println("Gross Salary: " + salary);
        System.out.println("Total Tax: " + tax);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("================================");


    }
}
