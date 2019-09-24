package testpack;

import java.util.ArrayList;
import java.util.List;

public class ListObject {
	public static void main(String[] args) {
		List<Object> objectList = new ArrayList<Object>();
		objectList.add(12);
		objectList.add(12.23);
		objectList.add("new york");
		objectList.add('A');
		objectList.add(3487234L);
		objectList.add('q');
		
		
		
for (Object object : objectList) {
	System.out.println(object);
}
}
}