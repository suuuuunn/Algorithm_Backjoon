import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt(); int y = s.nextInt();
		int w = s.nextInt(); int h = s.nextInt();
		
		int a = Math.min(w-x, h-y);
		int b = Math.min(x-0, y-0);
		System.out.println(Math.min(a, b));
		
	}
	
}