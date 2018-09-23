import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter to add two Numbers : ");
		Scanner s = new Scanner(System.in);
		int add1 = s.nextInt();
		int add2= s.nextInt();
		System.out.println(add(add1, add2));

	}
	
	public static int  add(int add1,  int add2) {
		int sum = 0;
		sum = add1 + add2;
		
		if (add1 == add2) {
			sum = add1+ add2;
			return sum + sum + sum;
		}
		
		return sum;
	}

}
