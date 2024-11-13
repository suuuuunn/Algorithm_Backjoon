import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt(); int b = s.nextInt(); int c = s.nextInt();
		int d = s.nextInt(); int e = s.nextInt(); int f = s.nextInt();
		
		System.out.print((c*e - b*f)/(a*e - b*d));
		System.out.print(" " + (c*d - a*f)/(b*d - a*e));
		
	}
	
}