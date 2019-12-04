public class Main {
	public static void main(String[] args) {
		FourWay fw = new FourWay();
		fw.showa();
		fw.showb();
		fw.showc();
		// fw.showd();
		// Main.java:7: error: showd() has private access in FourWay
		// fw.showd();
	}
}