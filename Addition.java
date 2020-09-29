package week13b;

public class Addition {
	
	//General Method
	public static void Math(int a,int b) {
		int c;
		c=a+b;
		System.out.println("C = "+c);
	}
	//====Overloading Method====
	 //call Back method with no argument
	static void add() {
		System.out.println("Overloading Method");
	}
	
	//call Back method
	int add(int a,int b) {
		return(a+b);
	}
	  //call Back method
	int add(int a,int b,int c) {
		return (a+b+c);
	}
	 int add(double a, double b,double c) {
		return (int) (a+b+c);
	}
	 public static void main(String[]args) {
		Addition obj1 = new Addition();
		Math(20,30);
		add();
		System.out.println("Calling add method with two int parameter "+obj1.add(17,25));
		System.out.println("Calling add method with two int parameter "+obj1.add(17,25,8));
		System.out.println("Calling add method with two int parameter "+obj1.add(10,20,30));
	}
}
