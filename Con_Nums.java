package Numbers;
import java.util.Scanner;
public class Con_Nums {
	public static void main(String [] args) {
		try (Scanner obj = new Scanner(System.in)) {
			System.out.println("Enter 2 numbers: ");
			int a = obj.nextInt(); // 12
			int b = obj.nextInt(); // 43
			//convert int data into string data
			String s = Integer.toString(a);
			String s1 = Integer.toString(b);
			String s3 = s + s1;
			System.out.println(s3);
			// convert string data into int data
			int c = Integer.parseInt(s3);
			System.out.println(c);
			}
}
}

