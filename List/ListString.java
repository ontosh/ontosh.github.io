package testpack;

import java.util.ArrayList;
import java.util.List;

public class ListString {
public static void main(String[] args) {
	List<Object> flower = new ArrayList<Object>();
	flower.add(12);
	flower.add(12.23);
	flower.add("new york");
	flower.add('A');
	flower.add(3487234L);
	flower.add('q');
	
	
	List<Object> flowers = new ArrayList<Object>();
	flowers.add("tulip");
	flowers.add("sunflower");
	flowers.add("laliguras");
	flowers.add("Chameli");
	flowers.add("sayapateri");
	flowers.add("lilly");
	
	
System.out.println(flower);
}

}
