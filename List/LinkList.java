package testpack;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {
	public static void main(String[] args) {
		LinkedList<Integer> numberLinkedLIst = new LinkedList<Integer>();
		numberLinkedLIst.add(01);
		numberLinkedLIst.add(12);
		numberLinkedLIst.add(23);
		numberLinkedLIst.add(34);
		numberLinkedLIst.add(45);
		numberLinkedLIst.add(56);
		numberLinkedLIst.add(67);
		numberLinkedLIst.add(78);
		numberLinkedLIst.add(89);
		numberLinkedLIst.add(90);
		numberLinkedLIst.add(21);
		numberLinkedLIst.add(32);
		numberLinkedLIst.add(43);
		numberLinkedLIst.add(44);
		numberLinkedLIst.add(65);
		numberLinkedLIst.add(82);

		// adding an element at a specified index position (0):
		numberLinkedLIst.add(0, 1000);

		System.out.println("The size is: " + numberLinkedLIst.size());

		numberLinkedLIst.add(3, 100);

		numberLinkedLIst.addFirst(22);
		numberLinkedLIst.addLast(37);

		// printing all elements:
		// System.out.println("Elements of the LinkedList: " + numberLinkedLIst);

		// one of the ways to iteratre or traverse through elements:
		Iterator<Integer> it = numberLinkedLIst.iterator();
		while (it.hasNext()) {
			int num = it.next();
			System.out.print(num + " ");
		}

// other of the ways to iteratre or traverse through elements:
		for (int i = 0; i < numberLinkedLIst.size(); i++) {
			System.out.println(numberLinkedLIst.get(i));
		}

		// 3rd way:
		numberLinkedLIst.forEach(System.out::println);

		// 4th way: using lamda expression ??  THIS IS YOUR HOMEWORK, DEAR SANTOSH!
		
		// numberLinkedLIst.clear();
		
		
		System.out.println("Everything cleared up:"+ numberLinkedLIst);

		
		Collections.sort(numberLinkedLIst);     // we know this already :)
		System.out.println("Ascending order: " + numberLinkedLIst);
		
		// sorting in a reverese order:		
		Collections.reverse(numberLinkedLIst);
		System.out.println("Descending order: " + numberLinkedLIst);
		
	}
}
