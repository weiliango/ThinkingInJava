package Exercise_10;
class TerminationCondition {
	public static void main(String[] args) {
		UberEats order = new UberEats(1);
		// order.pickUp();
		new UberEats(2);
		// order.delivered();
		new TerminationCondition().test();
		System.gc();
		//order 1's finalize() function will never been called here, since we still have a reference order which could be used somewhere
	}
	public void test() {
		UberEats order = new UberEats(3);
		order.pickUp();
	}
}
