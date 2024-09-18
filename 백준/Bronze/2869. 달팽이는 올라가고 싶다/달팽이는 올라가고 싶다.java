import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int v = s.nextInt();
		double n = (double) (v-a)/(a-b) + 1;
		System.out.println((int) Math.ceil(n));
	}
}