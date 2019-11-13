package static_solution;
import java.util.*;

enum CartoonCharacter {
	SLAPPY, SPANKY, PUNCHY, SILLY, COUNCY, NUTTY, BOB;
	public static CartoonCharacter next(Random rand) {
		return values()[rand.nextInt(values().length)];
	}
}

public class EnumImplementation {
	public static void printNext(Random rand) {
		System.out.print(CartoonCharacter.next(rand) + ", ");
	}
	public static void main(String[] args) {
		CartoonCharacter cc = CartoonCharacter.BOB;
		Random rand = new Random(47);
		for (int i = 0; i < 10 ; i++) {
			printNext(rand);
		}
	}
}

//if we implement next by static method, 
//since in a static method, we cannot call non-static reference
//so we have to pass rand instance as a parameter 
//which exposed rand to methods which should not operate it (main & EnumImplementation)

//In enum, use interface gives us a better flexibity 
//And you can still use static method if necessary, it is not conflicting with interface