import java.util.ArrayList;
import java.util.HashSet;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList intArray = new ArrayList<Integer>();
		intArray.add(1);
		intArray.add(5);
		intArray.add(3);
		HashSet<Integer> set = new HashSet<>(intArray);
		System.out.println(set.add(9));

	}

}
