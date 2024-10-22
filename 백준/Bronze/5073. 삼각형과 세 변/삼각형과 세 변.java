import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int side[] = new int[3]; side[0] = 1;
		while (true) {
			int max = 0; int index = 0; int sum = 0;
			for (int i=0; i<3; i++) {
				side[i] = s.nextInt();
				if (max <= side[i]) {
					max = side[i];
					index = i;
				}
				sum += side[i];
			}
			
			if (side[0] == 0 && side[1] == 0 && side[2] == 0) {
				break;
			} else if (sum - max <= max) {
				System.out.println("Invalid");
			} else if (side[0] == side[1] && side[1] == side[2]) {
				System.out.println("Equilateral");
			} else if (side[0] != side[1] && side[1] != side[2] && side[2] != side[0]) {
				System.out.println("Scalene");
			} else {
				System.out.println("Isosceles");
			}
		}
	}
	
}