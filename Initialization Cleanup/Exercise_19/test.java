class Test {
	void f(String... args) {
		for(String str: args) {
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
		new Test().f("a", "b", "c");
		String[] strs = {"d", "e", "f"};
		new Test().f(strs);
	}
}