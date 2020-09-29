package week13b;

public class operator {
	//formal parameter
	  static void sum(int p, int q) {
		int a,b,c;
		 a=p;
		 b=q;
		 c=a+b;
		System.out.println("result is "+c);
	}
	public static void main(String[]args) {
		//int a=10,b=20,c;
		//c=sum(a,b);
		//actual parameter/argument
		sum(10,20);
		
	}
}
