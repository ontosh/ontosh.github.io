package src.testpack;

public class SwitchLoop {
	
	public static void main(String[] args) {
String color = "Green";




		switch (color) {
		case"Green":
			System.out.println("GO ahead");
			break;
		case"Yellow":
			System.out.println("Proceed with caution");
break;
		case"Red":
			System.out.println("STOP");
			break;
			default: System.out.println("Unspecified color -obey the officer");
			break;
		}
	}
}
