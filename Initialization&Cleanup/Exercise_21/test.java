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
		for(Type type: Type.values()) {
			System.out.println(type + " : " + type.ordinal());
		}
	}
}