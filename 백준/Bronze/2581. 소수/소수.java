import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s  = new Scanner(System.in);
		int a = s.nextInt(); int b = s.nextInt();
		int sum = 0; int p = 0; int min = a; int count = 0;
		for (int i=a; i<=b; i++) {
			p = 0;
			for (int j=2; j<=i/2; j++) {
				if (i % j == 0) {
					p = j;
				}
			}
			if (p == 0 && i != 1) {
				count++;
				sum += i;
				if (count == 1) {
					min = i;
				}
			}
		}
		if (count == 0) {
			sum = -1;
			System.out.println(sum);
		} else  {
			System.out.println(sum);
			System.out.println(min);
		}
		
	}
	
}