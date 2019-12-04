class Test {
	public void f1() {
		f2();
		this.f2();
	}

	public void f2() {
		System.out.println("it's working");
	}

	public static void main (String[] args) {
		Test test = new Test();
		test.f1();
	}
}