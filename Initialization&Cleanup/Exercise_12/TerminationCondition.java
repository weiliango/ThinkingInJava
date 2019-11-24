package Exercise_12;
class TerminationCondition {
	public static void main(String[] args) {
		test_1();
		test_2();
		test_3();
		System.gc();
	}
	public static void test_1() {
		Tank tank = new Tank(1);
		tank.fill();
	}
	public static void test_2() {
		Tank tank = new Tank(2);
		tank.fill();
		tank.empty();
	}
	public static void test_3() {
		Tank tank = new Tank(3);
	}

}