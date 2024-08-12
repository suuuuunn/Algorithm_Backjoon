import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i=0; i<n; i++) {
			int money = s.nextInt();
			int quarter = money / 25;
			int dime = (money % 25) / 10;
			int nickel = (money % 25) % 10 / 5;
			int penny = (money % 25) % 10 % 5 / 1;
			System.out.printf("%d %d %d %d", quarter, dime, nickel, penny);
			System.out.println();
		}
	}
	
}