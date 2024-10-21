import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int angle[] = new int[3];
		int sum = 0;
		
		for (int i=0; i<3; i++) {
			angle[i] = s.nextInt();
			sum += angle[i];
		}
		
		if (sum != 180) {
			System.out.println("Error");
		} else if (sum == 180 && angle[0] == 60 && angle[1] == 60) {
			System.out.println("Equilateral");
		} else if (sum == 180 && angle[0] != angle[1] && angle[1] != angle[2] && angle[2] != angle[0]) {
			System.out.println("Scalene");
		} else {
			System.out.println("Isosceles");
		}
		
	}

}