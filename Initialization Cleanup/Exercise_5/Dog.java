class Dog {
	public void bark(int i) {
		System.out.println("bark by integer: " + i);
	}
	public void bark(short i) {
		System.out.println("bark by short: " + i);
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark((int)1);
		dog.bark((short)1);
	}
}