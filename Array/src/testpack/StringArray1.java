package testpack;

public class StringArray1 {
public static void main(String[] args) {
	String [][] sArray = {
			{"asd","sdf","dfg","fgh"},
			{"qwe","wer","ert","rty","tyu"}
			
	};
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j <4 ; j++) {
			System.out.println(sArray[i][j]);
			
		}
		
	}
}
}
