package PracticeProject;

public class ExceptionHandling {
 public static void main(String args[]) {
	 try {
		 System.out.println("Starting of try block");
		 throw new MyException("This is my error message");
	 }
	 catch(MyException exp){
		 System.out.println("Catch Block");
		 System.out.println(exp);
		 
	 }
 }
}
class MyException extends Exception{
	String str1;
	MyException(String str2){
		str1 = str2;
	}
	public String toString() {
		return("My Exception Occoured:" +str1);
		
	}
}
