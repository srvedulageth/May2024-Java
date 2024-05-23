package firstPkg;

public class QA4 extends QA2 implements QA3 {
	

	@Override
	public void Mul(int a, int b) {
		// TODO Auto-generated method stub
		int c = a*b;
		System.out.println("Mul of a*b = " + c);
		
	}
	
	public void div(int a, int b) {
		int c = a/b;
		System.out.println("Div a/b = " + c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QA4 QA4 = new QA4();
		QA4.Addition(10, 20);
		QA4.Sub(30, 20);
		QA4.Mul(5,  10);
		QA4.div(10, 5);

	}
}
