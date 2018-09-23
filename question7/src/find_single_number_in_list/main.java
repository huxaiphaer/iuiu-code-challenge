package find_single_number_in_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		find_non_duplicates();

	}




	private static void find_non_duplicates() {

		int[] numbers = {5, 3, 4, 3, 5, 5, 3};

		Arrays.sort(numbers);

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] == numbers[i - 1]) {
				System.out.println(" Duplicate: " + numbers[i]);
			}

			else {
				System.out.println("Not Duplicate: " + numbers[i]);
			}
		}
	}

}
