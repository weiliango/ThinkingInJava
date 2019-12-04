class Test {
	Test(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		Test[] array = new Test[20];
		for(int i = 0; i < array.length; i++) {
			array[i] = new Test(String.valueOf(i));
		}
	}
}