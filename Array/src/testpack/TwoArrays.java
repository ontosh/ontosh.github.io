package testpack;


public class TwoArrays {
	public static void main(String[] args) {

		int[][] arrayTwo = { { 6, 7, 8, 9, 0 }, { 10, 11, 12, 13, 14 } };

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 5; j++) {

				System.out.print(arrayTwo[i][j] + " ");

			}
		}
	}

}