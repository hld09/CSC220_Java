package Studentmenu;

import java.util.*;

public class Studentmenu

{ 

       public static void main(String[] args)

       {
    	   Scanner input = new Scanner(System.in);
		int option;
	

              do
		{
		System.out.println("Option 0:	Exit");
		System.out.println("Option 1:	Add");
		System.out.println("Option 2:	View All");
		System.out.println("Option 3:	Delete");
		System.out.println("Option 4:	Update");
		System.out.println("Option 5:	Search");
		System.out.println("Option 6:	Copy");
		System.out.println("Which Option?");
		option=input.nextInt();
		
		switch(option)
		{
		case 0: break;
		case 1: 
			{
				StudentArray.add();
				break;
			}
	
		case 2:
		{
				StudentArray.viewall();
				break;
				
			}

		case 3:
		{
				StudentArray.delete();
				break;
				
			}

		
		case 4:
		{
				StudentArray.update();
				break;
				
			}
		case 5:
		{
				StudentArray.search();
				break;
				
			}
		case 6:
		{
				StudentArray.copy();
				break;
				
			}
		
		
		default:
		{
			System.out.println("invalid option");
		}
		
			
		}// end of switch
		
		} while (option !=0);

 }
}