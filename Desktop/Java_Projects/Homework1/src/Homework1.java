import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		
		//DECLARING VARIABLES
		
		System.out.println("Please enter your name:");
		Scanner nameinput = new Scanner(System.in);
		String Name = nameinput.nextLine();
		
		System.out.println("Please enter your major:");
		Scanner majorinput = new Scanner(System.in);
		String Major = majorinput.nextLine();
		
		System.out.println("Please enter your numerical attendance score:");
		Scanner ascore = new Scanner(System.in);
		float Attendance = ascore.nextLine();
		
		System.out.println("Please enter your total numerical homework score:");
		Scanner hscore = new Scanner(System.in);
		float Homework = hscore.nextLine();
		
		System.out.println("Please enter your numerical score for project 1:");
		Scanner p1score = new Scanner(System.in);
		float Project1 = p1score.nextLine();
		
		System.out.println("Please enter your numerical score for project 2:");
		Scanner p2score = new Scanner(System.in);
		float Project2 = p2score.nextLine();
		
		System.out.println("Please enter your numerical score for the midterm:");
		Scanner midscore = new Scanner(System.in);
		float Midterm = midscore.nextLine();
		
		System.out.println("Please enter your numerical score for your final:");
		Scanner finalscore = new Scanner(System.in);
		float Final = finalscore.nextLine();
		
		System.out.println("Please enter any extra points earned throughout the year:");
		Scanner extrapts = new Scanner(System.in);
		float Extrapoints = extrapts.nextLine();
		
//		//WEIGHTED SCORES
//		Attendance: 05%
//		Homework/Project 50%
//		(Let’s assume we have 5 homework: 35% and 2 Projects: 15% )
//		Mid Exam: 20%
//		Final Exam 25%
//		Students could get 0-4 extra points for the course. 
		float w_attendance = (Attendance*0.05)
		System.out.print( "Your attendance score is: "+ w_attendance);

		
		//System.out.print( "Your major is: "+ Major );

	}
}
