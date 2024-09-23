import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); int k = s.nextInt();
		int m = 1;
		for (int i=1; i<=k; i++) {
			if (n<k) {
				m = 0;
				break;
			} else if (n%i == 0) {
				m = i;
			} else if (n%i != 0) {
				k++;
				continue;
			}
		}
		System.out.println(m);
			
	}
	
}
