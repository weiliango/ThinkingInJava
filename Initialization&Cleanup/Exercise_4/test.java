class Test {
	public Test() {
		System.out.println("Test Class Constuctor Triggered");
	}
	public Test(String msg) {
		System.out.println("Test Class Constuctor Triggered with String: " + msg);
	}
	public static void main(String[] args) {
		Test test = new Test("String Argument");
	}
}