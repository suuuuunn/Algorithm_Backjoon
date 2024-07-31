import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a;
		String c;
		a = scanner.nextInt();
		c = scanner.next();
		System.out.println(a * Integer.parseInt(c.substring(2)));
		System.out.println(a * Integer.parseInt(c.substring(1, 2)));
		System.out.println(a * Integer.parseInt(c.substring(0, 1)));
		System.out.println(
				a * Integer.parseInt(c.substring(2)) + 10 * a * Integer.parseInt(c.substring(1, 2)) 
				+ 100 * a * Integer.parseInt(c.substring(0, 1)));
		
	}
	
}