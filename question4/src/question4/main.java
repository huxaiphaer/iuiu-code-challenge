package question4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> m = new ArrayList<>();

		for (;;) {

			try {
				System.out.println("Enter any numbers , press any letter to sum them");
				Scanner s = new Scanner(System.in);

				int input = s.nextInt();

				m.add(input);

			} catch (InputMismatchException c) {
				add(m);

			}

		}

	}

	public static void add(ArrayList<Integer> a) {

		int sum = 0;

		for (int i = 0; i < a.size(); i++) {

			sum += a.get(i);
		}

		System.out.println("The total sum of entered numbers is " + sum);

	}

}
