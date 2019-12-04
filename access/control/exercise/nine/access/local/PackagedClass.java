package access.control.exercise.nine.access.local;
import static li.weiliang.util.Print.*;

//this is causing problem, you are using default package access
//two solutions: 
//1. add public keyword
//2. move the classes into same package
class PackagedClass {
	public PackagedClass() {
		print("Creating a packaged class");
	}
}