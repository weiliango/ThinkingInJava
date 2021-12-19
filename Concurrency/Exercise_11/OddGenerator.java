package Exercise_11;

public class OddGenerator extends IntGenerator {
	private int currentOddValue = 1;
	public int next() {
	//public synchronized int next() {
		++currentOddValue;
		Thread.yield();
		++currentOddValue;
		return currentOddValue;
	}
	public static void main(String[] args) {
		OddChecker.test(new OddGenerator());
	}
}
