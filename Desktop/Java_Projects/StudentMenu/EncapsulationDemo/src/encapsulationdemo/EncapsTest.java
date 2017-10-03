
package encapsulationdemo;

public class EncapsTest{
    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setEmpName("Mario");
         obj.setEmpAge(32);
         obj.setEmpSSN(112233);
         // if ssn is public, we could use obj.ssn;if private, no, get error; if protected, 	default value, OK 
 //      obj.ssn=222222;
//       System.out.println("SSN : "+obj.ssn);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee SSN: " + obj.getEmpSSN());
         System.out.println("Employee Age: " + obj.getEmpAge());
    } 
}

/*
Output:

Employee Name: Mario
Employee SSN: 112233
Employee Age: 32

*/