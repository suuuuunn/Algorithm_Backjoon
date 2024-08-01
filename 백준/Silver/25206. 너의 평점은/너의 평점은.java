import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[60];
		float credit = 0;
		float sum = 0;
		float rankfloat = 0;
		for (int i=0; i<20; i++) {
			for (int j=0; j<3; j++) {
				arr[j + 3*i] = sc.next();
			}
			float n = Float.parseFloat(arr[3*i + 1]);
			String rank = arr[3*i + 2];
			// System.out.println("n: " + n);
			// System.out.println("rank: " + rank);
			credit += n;
			switch (rank) {
				case "A+":
					rankfloat = (float) 4.5;
					break;
				case "A0":
					rankfloat = (float) 4.0;
					break;
				case "B+":
					rankfloat = (float) 3.5;
					break;
				case "B0":
					rankfloat = (float) 3.0;
					break;
				case "C+":
					rankfloat = (float) 2.5;
					break;
				case "C0":
					rankfloat = (float) 2.0;
					break;
				case "D+":
					rankfloat = (float) 1.5;
					break;
				case "D0":
					rankfloat = (float) 1.0;
					break;
				case "F":
					rankfloat = (float) 0.0;
					break;
				default:
					rankfloat = (float) 0.0;
					credit -= n;
					break;
			}
			// System.out.println("rankfloat: " + rankfloat);
			sum += rankfloat * n;
			// System.out.println("sum: " + sum);
		}
		System.out.println((double) sum / credit);
		
	}
	
}