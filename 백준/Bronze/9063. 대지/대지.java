import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x[] = new int[n]; 
		int y[] = new int[n]; 
		for (int i=0; i<n; i++) {
			x[i] = s.nextInt();
			y[i] = s.nextInt();
		}
		
		int maxX = -10000; int minX = 10000;
		int maxY = -10000; int minY = 10000;
		for (int i=0; i<n; i++) {
			if (maxX <= x[i]) {
				maxX = x[i];
			}
			if (minX >= x[i]) {
				minX = x[i];
			}
			if (maxY <= y[i]) {
				maxY = y[i];
			}
			if (minY >= y[i]) {
				minY = y[i];
			}
		}
		System.out.println((Math.abs(maxX - minX)) * (Math.abs(maxY - minY)));
	}
	
}