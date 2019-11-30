package Pratice;

import java.util.LinkedList;

public class LinkListed {
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
		numberLinkedLIst.add(93);
		
		//using lamda expression
		
		numberLinkedLIst.forEach(n->System.out.println(n));  
		
}
}
