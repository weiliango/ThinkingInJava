import static li.weiliang.util.Print.*;
import java.util.*;
public class ConnectionManager {
	static List<Connection> cons = new LinkedList<>();
	static int cnt = 0;

	private ConnectionManager() {
		for(int i = 0; i < 10; i++) {
			cons.add(new Connection(i));
		}
	}

	public static Connection next() {
		if (cnt < cons.size()) {
			return cons.get(cnt++);
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		ConnectionManager cm = new ConnectionManager();
		for(int i = 0; i < 11; i++) {
			Connection con = cm.next();
			if (con != null) {
				print(con.val);
			} else {
				print("null");
			}
		}
	}
}