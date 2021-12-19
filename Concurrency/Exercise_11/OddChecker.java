package Exercise_11;
import java.util.concurrent.*;

public class OddChecker implements Runnable {
	private IntGenerator generator;
	private final int id;
	public OddChecker(IntGenerator g, int ident) {
		generator = g;
		id = ident;
	}
	public void run() {
		while (!generator.isCanceled()) {
			int val = generator.next();
			if(val % 2 == 0) {
				System.out.println(val + " not odd!");
				generator.cancel();
			}
		}
	}
	public static void test(IntGenerator gp, int count) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < count; i++)
			exec.execute(new OddChecker(gp, i));
		exec.shutdown();
	}
	public static void test(IntGenerator gp) {
		test(gp, 10);
	}

}
