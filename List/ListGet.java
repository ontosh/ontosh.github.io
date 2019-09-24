package testpack;

import java.util.ArrayList;
import java.util.List;


public class ListGet {
	public static void main(String[] args) {
		List<Object> objectList = new ArrayList<Object>();
		objectList.add(12);
		objectList.add(12.23);
		objectList.add("new york");
		objectList.add('A');
		objectList.add(3487234L);
		objectList.add('q');
		
		System.err.println(objectList.get(0));
		
	
			
		
		for (int i = 0; i < objectList.size(); i++) {
			System.out.println(objectList.get(i));
			
		}
}
}