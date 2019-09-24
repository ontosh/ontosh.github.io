package testpack;

import java.util.Arrays;

public class ArrayCopy {
public static void main(String[] args) {
		// a String array 
		String [] Names = {"SANTOSH","you","him","his"};
		Object [] tonames = new Object[4];	
		System.arraycopy(Names, 0, tonames, 0, 4);
		System.err.println(Arrays.deepToString(tonames));
}
}
