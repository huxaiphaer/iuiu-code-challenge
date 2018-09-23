package convert_first_3_to_lower_case;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any word.");
		Scanner s = new Scanner(System.in);

		String input = s.nextLine();
		convert_first_three(input);

	}

	public static void convert_first_three(String input) {

		if ((input).length() <= 3) {

			System.out.println(input.toUpperCase());
		} else {

			char[] chars = input.toCharArray();


				for (int i = 0; i < chars.length; i++) {
					String a="";
				
					if (i==0|| i==1 || i ==2) {
						
						a=String.valueOf(chars[i]).toLowerCase();  
					}
					
					else {
						a=String.valueOf(chars[i]).toUpperCase();  
					}
					
					
					System.out.print(a);
				}

			
		}
	}

}
