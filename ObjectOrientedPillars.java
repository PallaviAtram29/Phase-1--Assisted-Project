package PracticeProject;

public class ObjectOrientedPillars {
 public static void main(String args[]) {
	 PetDog Lilly = new PetDog();
	 System.out.println(Lilly.toString());
 }
}
 class PetDog{
	String name;
	String breed;
	int age;
	String color;
	public void dog(String name,String breed,int age, String color) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
	}
	public int getAge() {
		return age;
	}
	public  String getColor() {
		return color;
	}
	public String toString() {
		return("Hi My Name is "+ this.getName()+ "\nMy breed,age and color are" +this.getBreed()+" ,"+this.getAge()+", and"+this.getColor()+ ",");
	
	}
}
