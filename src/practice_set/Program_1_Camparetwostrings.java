package practice_set;
import java.util.Scanner;
public class Program_1_Camparetwostrings {

	public static void main(String[] args) {
		
		// take two strings s1 and s2
		String s1, s2;

		// scan here
		Scanner in = new Scanner(System.in);

		System.out.println("Enter string s1");
		s1 = in.nextLine();
		System.out.println("Enter string s2");
		s2 = in.nextLine();

		if (s1.compareTo(s2) > 0) {
			System.out.println("S1 is greater");
		} else if (s1.compareTo(s2) < 0) {
			System.out.println("S2 is greater");
		} else {
			System.out.println("both are equals");
		}
		in.close();

	}

}
