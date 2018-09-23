import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter any word to reverse it :");
		String input = s.nextLine();
		
		for (String part : input.split(" ")) {
		    System.out.print(new StringBuilder(part).reverse().toString());
		    System.out.print(" ");
		}

	}

}
