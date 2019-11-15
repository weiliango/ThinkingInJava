class Dog {
	public void bark(int i) {
		System.out.println("bark by integer: " + i);
	}
	public void bark(short i) {
		System.out.println("bark by short: " + i);
	}
	public void doubleBark(int i, char c) {
		System.out.println("doulbeBark one triggered with int:" + i + " char: " + c);
	}
	public void doubleBark(char c, int i) {
		System.out.println("doulbeBark two triggered with int:" + i + " char: " + c);
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.doubleBark(1, 'a');
		dog.doubleBark('b', 2);
	}
}