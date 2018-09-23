package values_nearest_100;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter First Number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("Enter Second  Number");
		int b = s.nextInt();
		logic(a, b);

	}

	public static void logic(int a, int b) {

		int x = 100;
		int w = x - a;
		int y = x - b;

		if (w < y) {

			System.out.println(a + " is the nearest number of 100.");

		} else {

			System.out.println(b + " is the nearest number of 100.");

		}
	}

}
