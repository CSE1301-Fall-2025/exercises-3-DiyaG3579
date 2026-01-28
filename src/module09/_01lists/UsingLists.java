package module09._01lists;

import java.util.ArrayList;
import java.util.List;

public class UsingLists {

	public static void main(String[] args) {
		List <String> rainbow = new ArrayList<>();
		rainbow.add("Red");
		rainbow.add("Orange");
		rainbow.add("Yellow");
		rainbow.add("Green");
		rainbow.add("Blue");
		rainbow.add("Purple");
		System.out.println(rainbow);
		System.out.println(rainbow.get(0));
		rainbow.clear();
		rainbow.add("Pink");
		System.out.println(rainbow);
		// String [] rainbow = new String [6];
		// rainbow[0] = "Red";
		// rainbow[1] = "Orange";
		// rainbow[2] = "Yellow";
		// rainbow[3] = "Green";
		// rainbow[4] = "Blue";
		// rainbow[5] = "Purple";
		
	}
}
