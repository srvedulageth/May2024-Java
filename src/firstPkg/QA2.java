package firstPkg;

public class QA2 extends QA1{

	public void Sub(int a, int b) {
		int c = a - b;
		System.out.println("Sub of a+b = " + c);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QA2 QA2 = new QA2();
		QA2.Sub(10, 20);
		QA2.Addition(30, 40);

	}
}
