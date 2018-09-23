import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println("Enter any statement : ");
		 Scanner s = new Scanner(System.in);
		 String enter_statement = s.nextLine();
		 System.out.println(""+ removeDuplicates(enter_statement));


	}
	
	
	public static String removeDuplicates(String input){
	    String result = "";
	    for (int i = 0; i < input.length(); i++) {
	        if(!result.contains(String.valueOf(input.charAt(i)))) {
	            result += String.valueOf(input.charAt(i));
	        }
	    }
	    return result;
	}

}
