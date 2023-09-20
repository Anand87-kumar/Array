package in.java.arrays;
//Write a java program to print even length words in a string?
public class Even_Length {

	public static void main(String[] args) {
		String str = "Hell World We lol";
		for(String s: str.split(" ")) {
			if(s.length()%2==0) {
				System.out.println(s);
			}
		}

	}

}
