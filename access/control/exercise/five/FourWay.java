import static li.weiliang.util.Print.*;
public class FourWay {
	int a = 0;
	public int b = 1;
	protected int c = 2;
	private int d = 3;

	public FourWay() {
		print("FourWay Constructor Triggered");
	}

	void showa() { print(a); }
	public void showb() { print(b); }
	protected void showc() { print(c); }
	private void showd() { print(d); }
}