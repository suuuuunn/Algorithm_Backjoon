import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count = 0;
		
		while (n != 0) {
			if (n <=12 && n % 3 == 0) {
				count += n / 3;
				break;
			}
			n -= 5;
			count++;
			if (n < 0) {
				count = -1;
				break;
			}
		} 
		System.out.println(count);
	}
	
}