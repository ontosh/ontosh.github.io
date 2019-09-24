package testpack;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		int[] numbers = new int[5];

		numbers[0] = 12;
		numbers[1] = 34;
		numbers[2] = 45;
		numbers[3] = 56;
		numbers[4] = 67;
		System.out.println(Arrays.toString(numbers));
System.out.println(numbers[3]);
	}
//we cant print arrays directly
	// we must use Arrays.toString() method to print

	
}
