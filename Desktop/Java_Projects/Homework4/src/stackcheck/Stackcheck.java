package stackcheck;

import java.util.*;
import java.io.*;


public class Stackcheck {
	public static String top="";
//	public static int popvalue;
	
	public static void main(String args[]) {
	
	boolean runprogram=true;
	while (runprogram==true){
	System.out.println("Please enter a string of parenthesis / brackets / and braces:");
	Scanner stringinput = new Scanner(System.in);
	String Str = stringinput.nextLine();
	

	List<Character> charList = new ArrayList<Character>();

	for (char c : Str.toCharArray()) {
	  charList.add(c);
	}	
	Stack<Character> mystack=new Stack<Character>();
	mystack.addAll(charList);
	System.out.println(mystack);

	if (charList.size()==0){
		System.out.println("Your string is empty, please try again:");
		runprogram=true;
	}
	
	else{
		for(int i = 0; i<mystack.size(); i++){
			char ch = mystack.get(i);
		if (mystack.get(i)=='{' ||mystack.get(i)=='['||mystack.get(i)=='('){
			mystack.push((Character) ch);
//			System.out.println(mystack);
		}
        if (mystack.get(i) == '}' || mystack.get(i) == ')' || mystack.get(i) == ']')
        {
            if (mystack.isEmpty()){
                System.out.println("Unmatched.");
                break;
            }
            char last = mystack.peek();
            if (mystack.get(i) == '}' && last == '{' || mystack.get(i) == ')' && last == '(' || mystack.get(i) == ']' && last == '['){
                mystack.pop();
            	System.out.println("Matched.");
            	break;
            }
            else {
                System.out.println("Unmatched.");
                break;
            }
               	
        }

    }
	
	break;
	}
	}
		}
	
}

	

	
