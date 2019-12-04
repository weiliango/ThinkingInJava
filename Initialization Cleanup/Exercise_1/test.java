class Test {
	String str;
	Test() {
		System.out.println(str);
		//This responses with null
		//since constructor is the first function during an instance initialization 
		//so this str is initialized by Java to null
	}
	public static void main(String[] args) {
		Test test = new Test();
	}
}