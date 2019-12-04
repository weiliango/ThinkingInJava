package Exercise_14;
class StaticBlock {
	static String string;
	static {
		string = "Static Block";
	}
	StaticBlock() {
		System.out.println(string);
	}
}