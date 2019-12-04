package access.control.exercise.two;
import java.util.*;
import access.control.exercise.two.*;
// java version "1.8.0_231"
// Java(TM) SE Runtime Environment (build 1.8.0_231-b11)
// Java HotSpot(TM) 64-Bit Server VM (build 25.231-b11, mixed mode)

// the collision mentined in ThinkInJava has been fixed in java8
// based on my test, if you include self-defined class and system library together
// self-defined class has a higher priority

// and if you explicitly include the class name, it throws an exception
// PackageCollisionTest.java:3: error: a type with the same simple name is already defined by the single-type-import of Vector
// import access.control.exercise.two.Vector;

public class PackageCollisionTest {
	public PackageCollisionTest() {}
	public static void main(String[] args) {
		Vector vector = new Vector();
	}
}