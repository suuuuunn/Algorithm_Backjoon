import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int n_count = 0;
		int min = 666;
		
		while (true) {
			int min2 = min; int count = 0;
			while (min2 > 0) {
				if (min2 % 10 == 6) {
					count++;
				} else if (min2 % 10 != 6 && count < 3) {
					count = 0;
				}
				min2 /= 10;
			}
			if (count >= 3) {
				n_count++;
			}
			if (n_count == n) {
				break;
			}
			min++;
		}
		System.out.println(min);
		
	}
	
}