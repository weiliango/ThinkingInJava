package Exercise_10;
class UberEats {
	boolean delivered = false;
	int id = -1;
	UberEats(int id) {
		this.id = id;
	}
	void pickUp() {
		System.out.println("order has been picked up");
		this.delivered = false;
	}
	void delivered() {
		System.out.println("order has been delivered");
		this.delivered = true;
	}
	protected void finalize() {
		if (!delivered) {
			System.out.println("order id: " + id);
			System.out.println("Error: We terminate an order only if the food has been delivered");
		}
		try {
			super.finalize();
		} catch (Throwable t) {
			System.out.println(t.getMessage());
		}
	}
}

