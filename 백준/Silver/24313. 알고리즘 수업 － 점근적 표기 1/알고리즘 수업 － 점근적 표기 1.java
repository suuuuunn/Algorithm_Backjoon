import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt(); int b = s.nextInt();
		int c = s.nextInt(); int n = s.nextInt();
		int value = 1;
		if (a == c && b>0) {
			value = 0;
		} else if (a == c && b<=0){
			value = 1;
		} else {
			int x = b / (c - a);
			if (a > c) {
				if (x == 100) {
					value = (x >= n) ? 1 : 0;
				} else {
					value = 0;
				}
			} else if (a < c) {
				value = (x <= n) ? 1 : 0;
			}
		}
		System.out.println(value);
	}
	
}