package testpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ListDemo {
	public static void main(String[] arge) {
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(12);
		myList.add(23);
		myList.add(34);
		myList.add(45);
		myList.add(56);
		myList.add(67);
		myList.add(78);
		myList.add(89);
		System.out.println(myList);
		Collections.sort(myList);
		System.out.println(myList);
		Collections.sort(myList, Collections.reverseOrder());
		System.out.println(myList);
		
		
}
}