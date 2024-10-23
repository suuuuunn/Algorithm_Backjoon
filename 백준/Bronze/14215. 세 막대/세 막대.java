import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int side[] = new int[3];
		int sum = 0; int max = 0; int index = 0;
		for (int i=0; i<3; i++) {
			side[i] = s.nextInt();
			sum += side[i];
			if (side[i] >= max) {
				max = side[i];
				index = i;
			}
		}
		
		while (true) {
			if (sum - max > max) {
				System.out.println(side[0] + side[1] + side[2]);
				break;
			} else {
				max = sum - max - 1;
				side[index] = max;
			}
		}
		
	}
	
}