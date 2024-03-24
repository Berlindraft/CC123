/*Author: Raymund ZYron Abella
Date started: Feb 20, 2024
Date Submitted; Feb 20, 2024
@Activity1.java
*/

public class Activity1_Abella{
	public static void main(String[] args){

		double projects_total = 0;
		double quizzes_total = 0;
		double seatworks_total = 0;
		double final_grade;

//gets the grades for projects
		System.out.println("Input 4 grades for Projects:");
		for(int i = 1; i <=4; i++){
			System.out.print("[ " + i + " ] " + " - ");
			double project = Zyron.readDouble();
			projects_total += project;
			}
//gets the grades for the quizzes
		System.out.println("Input 3 grades for Quizzes:");
				for(int i = 1; i <=3; i++){
					System.out.print("[ " + i + " ] " + " - ");
					double quiz = Zyron.readDouble();
					quizzes_total += quiz;
			}
//gets the grades for the seatworks
		System.out.println("Input 2 grades for Seatworks:");
				for(int i = 1; i <=2; i++){
					System.out.print("[ " + i + " ] " + " - ");
					double seatwork = Zyron.readDouble();
					seatworks_total += seatwork;
			}

			//formula for computing the average grades
			double project_average = projects_total/4;
			double quizzes_average = quizzes_total/3;

			double seatwork_average = seatworks_total/2;
			double project_grade = ((project_average)* 0.5);
			double quizzes_grade = ((quizzes_average)* 0.3);
			double seatwork_grade = ((seatwork_average)* 0.2);

			final_grade = project_grade + quizzes_grade + seatwork_grade;
			System.out.println("**************************************");
			System.out.println("Average grade for Projects: " + project_average);
			System.out.println("Average grade for Quizzes: " + quizzes_average);
			System.out.println("Average grade for Seatworks: " + seatwork_average);
			System.out.println("Final Grade grade: " + final_grade);
			System.out.println("**************************************");

	}
}