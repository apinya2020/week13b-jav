package week13b;

public class Overloading {
	
	public static void sound() {
		System.out.println("meow");
	}
	//overloading method
	public static void sound(String name) {
		String cat;
		cat=name;
		System.out.println(cat+" meow meow");
	}
	
	public static void main(String[]args) {
		//String name="Luca";
		sound();
		sound("Luca");//argument or actual parameter
	}
}
