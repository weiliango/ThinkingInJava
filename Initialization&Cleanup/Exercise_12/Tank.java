package Exercise_12;

class Tank {
	int cnt = 0;
	int id = 0;
	public Tank(int id) {
		this.id = id;
	}
	public void fill() {
		cnt++;
	}
	public void empty() {
		cnt--;
	}
	protected void finalize() {
		if (cnt != 0) {
			System.out.println("Error, tank must be empty when the object is cleaned up, id: " + id);
		}
	}
}