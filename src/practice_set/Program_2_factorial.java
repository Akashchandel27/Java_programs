package practice_set;

import java.util.Scanner;

public class Program_2_factorial {
	public static void main(String[] args) {
		// factorial of the number!!!

		int a, b, fact = 1;

		Scanner in = new Scanner(System.in);
		System.out.println("enter any number");
		a = in.nextInt();
		System.out.println("the number you have entered is" + a);

		for (b = 1; b <= a; b++) // 1...5
			fact = fact * b;

		System.out.println("the factorail is " + fact);

		in.close();

	}

}
