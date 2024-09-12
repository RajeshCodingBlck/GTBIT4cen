package OOP1_2;

public class B extends A {

	int a=100;
	super.fun();
	public void fun2() {
		System.out.println("fun2 is called");
	}
	
	@Override  // Define New Defination
	public void fun() {
		System.out.println("fun of B is called");
		
	}
	
	public void sum(int a, int b) {
		System.out.println("Int Sum is Called");
		System.out.println(a+b);
	}
	
	public void sum( double a,double b) {
		System.out.println("Double Sum is Called");
		System.out.println(a+b);
	}
	
	public void sum(double a, int b) {
		System.out.println("Double and Int Sum is Called");
		System.out.println(a+b);
	}
	
	public void sum(int b, double a) {
		System.out.println("Double and Int Sum is Called");
		System.out.println(a+b);
	}
	public void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
//	public int sum(int a, int b, int c) {
//		System.out.println(a+b+c);
//	}
}
