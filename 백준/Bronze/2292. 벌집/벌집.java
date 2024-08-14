import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count = 2;
		int bee = 7;
		if (n == 1) {
			count = 1;
		} else {
			for (int i=1; bee / n <= 0; i++) {
				bee += 6 * (i + 1);
				count += 1;
			}
		}
		System.out.println(count);
		
	}
	
}