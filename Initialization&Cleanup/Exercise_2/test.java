class Test {
	String str1;
	String str2="string 2";
	public Test() {
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		str1 = "string 1";
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
	}
	public static void main(String[] args) {
		Test test = new Test();
	}
}