import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int n = s.nextInt();
		
		int sum = 0;
		for (int i=str.length(); i>0; i--) {
			if (str.charAt(i-1) >= '0' && str.charAt(i-1) <= '9') {
				int a = str.charAt(i-1) - 48;
				sum += a * Math.pow(n, str.length() - i);
			} else {
				int a = str.charAt(i-1) - 55;
				sum += a * Math.pow(n, str.length() - i);
			}
		}
		System.out.println(sum);
	}
	
}