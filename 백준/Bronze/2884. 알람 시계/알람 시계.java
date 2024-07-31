import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h, m;
		h = sc.nextInt();
		m = sc.nextInt();
		if (h == 0 && m < 45) {
			h = 23;
			m += 15;
			System.out.printf("%d %d", h, m);
		} else if (h == 0 && m > 45) {
			m -= 45;
			System.out.printf("%d %d", h, m);
		} else if (h!=0 && m < 45) {
			h -= 1;
			m += 15;
			System.out.printf("%d %d", h, m);
		} else {
			m -= 45;
			System.out.printf("%d %d", h, m);
		}
		
	}
	
}