package firstPkg;

public class ClassDemoInterface implements DemoInterface{
	
	public static void main(String[] args) {
		ClassDemoInterface CDF = new ClassDemoInterface();
		CDF.meth1();
		CDF.meth2();
		CDF.meth3();
	}

	@Override
	public void meth1() {
		System.out.println("Demo Interface 1");		
	}

	@Override
	public void meth2() {
		System.out.println("Demo Interface 2");		
	}

	@Override
	public void meth3() {
		System.out.println("Demo Interface 3");		
	}
}
