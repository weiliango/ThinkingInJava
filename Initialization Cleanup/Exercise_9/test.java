import java.util.*;
class Test {
	public Test() {
		/*
		System.out.println("fist constructor called"); 
		// will throw exception like
		// test.java:5: error: call to this must be first statement in constructor
		// this(47);
		*/
		
		this(47);
		System.out.println("fist constructor called");
	}
	public Test(int value) {
		System.out.println("second contructor called, value=" + value);
	}
	public static void main(String[] args) {
		Test test = new Test();
	}
}