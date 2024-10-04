import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		
		for (int i = 2; i<=x; i++) {
			while (x % i == 0) {
				System.out.println(i);
				x /= i;
				if (i >= 2) {
					i--;
				}
				break;
			}
			
		}
		
	}
	
}