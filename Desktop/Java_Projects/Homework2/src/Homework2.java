import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Homework2 {
	
	public static void main(String[] args){
		// PROGRAM ONE 
        System.out.println("PROGRAM ONE"); //formatting line
        System.out.println(""); //formatting line

        List Li1 = Arrays.asList(1,2,3,4,5); //list one
        System.out.println("List 1: "+Li1);

        List Li2 = Arrays.asList(6,7,8,9,10); //list two
        System.out.println("List 2: "+Li2);
        
        System.out.println(""); //formatting line
        
        //joins list \/
        List joinedlist = new ArrayList(Li1);
        joinedlist.addAll(Li2);
        System.out.println("This is the concatenated list: "+joinedlist);
        // END PROGRAM ONE
        System.out.println(""); //formatting line
        System.out.println("PROGRAM TWO"); //formatting line
        System.out.println(""); //formatting line

        
        //PROGRAM 2: Matrix Multiplication


		System.out.println("Enter rows:");
		Scanner rowinput = new Scanner(System.in);
		int r = rowinput.nextInt();
		
		System.out.println("Enter columns:");
		Scanner columninput = new Scanner(System.in);
		int c = columninput.nextInt();
		
        System.out.println("MATRIX ONE"); //formatting line
        System.out.println("_________"); //formatting line
        int matrix[][] = new int[r][c];
        
// initialize matrix
for (int i = 0; i < matrix.length; i++)
  for (int j = 0; j < matrix[i].length; j++)
    matrix[i][j] = (int)(Math.random() * 200);

//print matrix
for (int row = 0; row < matrix.length; row++) {
  for (int column = 0; column < matrix[row].length; column++) {
    System.out.print(matrix[row][column] + " ");
  }

  System.out.println();
} 

System.out.println(""); //formatting line
System.out.println("MATRIX TWO"); //formatting line
System.out.println("___________"); //formatting line

int matrix2[][] = new int[c][r];

//initialize matrix 2
for (int i = 0; i < matrix2.length; i++)
for (int j = 0; j < matrix2[i].length; j++)
matrix2[i][j] = (int)(Math.random() * 200);

//print matrix 2
for (int row = 0; row < matrix2.length; row++) {
for (int column = 0; column < matrix2[row].length; column++) {
System.out.print(matrix2[row][column] + " ");
}

System.out.println();
} 
//END OF PRINTING TWO MATRICES


System.out.println(""); //formatting line
System.out.println("MULTIPLIED MATRIX"); //formatting line
System.out.println("___________"); //formatting line

int C[][]=new int[r][c]; // Array to store Result of Multiplication of 2 Matrices

//MAKES MULTIPLIED MATRIX
for(int i=0; i<r; i++)
{
    for(int j=0; j<c; j++)
    {        
        	C[i][j] = matrix[i][j]*matrix2[j][i];
    }
}

//PRINTS MULTIPLIED MATRIX

for (int i = 0; i < C.length; i++) {
    for (int j = 0; j < C[i].length; j++) {
        System.out.print(C[i][j] + " ");
    }
    System.out.println();
}

//System.out.print(C[i][j] + " ");    
//System.out.println();   

	} //static void bracket
} //public class bracket

