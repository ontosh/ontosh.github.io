package testpack;

public class IfLeader {
 public static void main(String[] args) {
	 int marks =78;
	 if ((marks>=0) && (marks<=30)){ 
		 System.out.println("D");
	 } else if ((marks>=31) && (marks<=50)){
		 System.out.println("c");
	 } else if ((marks>=51) && (marks<=80)){
		 System.out.println("B");
	 }else if ((marks>=81) && (marks>=100)) {
		 System.out.println("A");
	 }else if ((marks <=0) && (marks>=100)) {
		 System.out.println("Invalid");
	 }
		 
	 }
}


