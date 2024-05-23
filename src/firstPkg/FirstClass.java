package firstPkg;

public class FirstClass {
	int          a=5;
	String       s="VVV";
	float        b=0.10f;
	
	public FirstClass() {
		System.out.println("This is Constructor for FirstClass");
	}
	
	public FirstClass(int a) {
		System.out.println("This is Constructor for FirstClass " + a);
	}
	public void printMethod() {
		final int c = 100;
		System.out.println(a);
		System.out.println(s);
		System.out.println(c);
	}
	
	public static void main(String []args) {
		FirstClass abc = new FirstClass();
		FirstClass abc1 = new FirstClass(5);
		abc.printMethod();	
	}
}