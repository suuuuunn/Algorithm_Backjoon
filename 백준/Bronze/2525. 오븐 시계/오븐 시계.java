import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		int c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
	
		b += c;
		System.out.printf("%d %d", (Integer) ((a + b / 60 >= 24) ? a + b / 60 - 24 : (a + b / 60)), b - (b / 60) * 60);
	
	}
	
}