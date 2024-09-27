import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int p = 0;
		int count = 0;
		for (int i=0; i<n; i++) {
			p = 0;
			int prime = s.nextInt();
			for (int j = 2; j<=prime/2; j++) {
				if (prime % j == 0) {
					p = j;
				}
			}
			if (p == 0 && prime != 1) {
				count++;
			}
		}
		System.out.println(count);
	}

}