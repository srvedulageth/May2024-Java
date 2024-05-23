package firstPkg;

public class ConcreteClass extends AbsClass{

	public void mydisplay(String a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		ConcreteClass CC = new ConcreteClass();
		CC.mydisplay("LALAL");

	}
}
