import static li.weiliang.util.Print.*;
public class Operator {
	public void update(int value, Data data) {
		print("before operate, data value: " + data.getValue());
		data.value = value;
		print("after operate, data value: " + data.getValue());
	}
	public static void main(String[] args) {
		Operator operator = new Operator();
		operator.update(2, new Data());
	}
}