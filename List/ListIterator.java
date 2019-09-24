package testpack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {
	public static void main(String[] args) {
		List<Object> objectList = new ArrayList<Object>();
		objectList.add(12);
		objectList.add(12.23);
		objectList.add("new york");
		objectList.add('A');
		objectList.add(3487234L);
		objectList.add('q');
		
		System.out.println(objectList.get(0));
		
	Iterator<Object> it = objectList.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
	
	}

}
	}

