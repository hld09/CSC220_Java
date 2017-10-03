import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args){
	
		System.out.println("MENU OPTIONS"+"\n"+"\n");
		System.out.println("0. Quit/Exit"+"\n");
		System.out.println("1. Add a new student into the list"+"\n");
		System.out.println("2. View entire list of students"+"\n");
		System.out.println("3. View by specified major"+"\n");
		System.out.println("4. View by specific class level"+"\n");
		System.out.println("5.Delete student from the list"+"\n");
		System.out.println("6. Update specific student's record in list"+"\n");
		System.out.println("7. Search for specific student"+"\n");
		System.out.println("7. Copy a specific student's list"+"\n");
	
//	System.out.println("Please enter the number of students would you like to add to the records:");
//	Scanner studentnumber = new Scanner(System.in);
//	int studentstotal = studentnumber.nextInt();

	System.out.println("Please enter your name:");
	Scanner nameinput = new Scanner(System.in);
	String student_name = nameinput.nextLine();
	
	System.out.println("Please enter your id:");
	Scanner idinput = new Scanner(System.in);
	double idnumber = idinput.nextDouble();

	System.out.println("Please enter your address:");
	Scanner addressinput = new Scanner(System.in);
	String address = addressinput.nextLine();

	System.out.println("Please enter your age:");
	Scanner ageinput = new Scanner(System.in);
	float age = ageinput.nextFloat();

	System.out.println("Please enter your major:");
	Scanner majorinput = new Scanner(System.in);
	String major = majorinput.nextLine();

	System.out.println("Please enter your minor:");
	Scanner minorinput = new Scanner(System.in);
	String minor = minorinput.nextLine();

	System.out.println("Are you a freshman, sophomore, junior, or senior?:");
	Scanner yearinput = new Scanner(System.in);
	String year = yearinput.nextLine();

	System.out.println("Please enter your gpa:");
	Scanner gpainput = new Scanner(System.in);
	float gpa = gpainput.nextFloat();
	
	
		
	}
}

//
//
//Create and operate on a list of students’ records
//Student’s record contains attributes including
//Name, ID, Address, Age, Major, Minor, Classification (ex: Freshman,
//sophomore, Junior, Senior, Graduate) , GPA, and any other attribute(s) that you
//like to include.


//Implementation Requirements:
//Define a FindStudent method to be used for Add, Delete,
//update, Search methods.
//For ADD:
//Duplicate record is not allowed. Student’s name is assumed to be the key.
//For Search Option:
//Student can be searched based on Name, or ID.
//Method FindStudent can be overloaded:
//FindStudent(stID) , FindStudent(stName)
//For Delete Option:
//A record is physically deleted from the list.
//- Output should be user friendly.
//- Appropriate variables naming; stRecord, stname, stmajor,…
//-

//- Use appropriate heading for your outputs/messages
//EX: Student to be deleted is not in the list, record xxx is already in the list,
//Student to be added is already in the list,…
//- Run your program with different data to cover all possible cases:
//- Record found, record is not in the list, duplicate record,….
//-
//- Submit your programs, outputs to the blackboard