import java.util.*;
public class SequenceList {
	List<StringHolder> list = new LinkedList();
	public class StringHolder {
		String string;

		public StringHolder(String string) {
			this.string = string;
			list.add(this);
		}

		public String toString() {
			System.out.println(string);
			return string;
		}
	}

	public static void main(String[] args) {
		SequenceList s = new SequenceList();
		s.new StringHolder("StringHolder One");
		s.new StringHolder("StringHolder Two");
		s.new StringHolder("StringHolder Three");
		for(StringHolder sh: s.list) {
			sh.toString();
		}
	}
}