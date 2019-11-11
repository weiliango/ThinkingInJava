public class Outer {
	public class Inner {
		String name = "Inner";
	}
	public Inner generateInnerInstance() {
		System.out.println("going to generate new inner instance");
		return new Inner();
	}
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.generateInnerInstance();
	}
}