class Test {
	public enum Type {
		a,
		b,
		c,
		d,
		e,
		f,
	}
	public static void main(String[] args) {
		Type type = Type.c;

		switch (type) {
			case a:
				System.out.println("a");
				break;
			case b:
				System.out.println("b");
				break;
			default:
				System.out.println("c or d or e or f");
		}
	}
}