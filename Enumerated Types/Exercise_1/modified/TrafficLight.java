package modified;
import java.util.*;
// import static net.mindview.util.Print.*;
import static modified.Signal.*;

public class TrafficLight {
	Signal color = RED;
	public void change() {
		switch (color) {
			case RED: 	color = GREEN;
						break;
			case GREEN: color = YELLOW;
						break;
			case YELLOW: color = RED;
						break;
		}
	}
	public String toString() {
		return "The traffic light is " + color;
	}
	public static void main(String[] args) {
		TrafficLight t = new TrafficLight();
		for(int i = 0; i < 7; i++) {
			// print(t);
			System.out.println(t);
			t.change();
		}
	}
}