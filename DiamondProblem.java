package PracticeProject;

public class DiamondProblem {
 public static void main(String args[]) {
	 TestClass tc = new TestClass();
	 tc.show();
	 
 }
	

}
interface First{
	default void show() {
		System.out.println("Default First");
	}
}
interface Second{
	default void show() {
		System.out.println("Default Second");
	}
}
 class TestClass implements First,Second
{
	public void show() {
		First.super.show();
		Second.super.show();
	
	}
	
}