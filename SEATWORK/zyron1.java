public class zyron1{
	public static void main(String[] args){
		int grade1, grade2, sum	= 0;

		System.out.println("First Number:");
		grade1 = Zyron.readInt();
		System.out.println("Second Number:");
		grade2= Zyron.readInt();
		sum = grade1 + grade2;
		System.out.println(grade1+ "+" +grade2+ "=" +sum);
	}

}