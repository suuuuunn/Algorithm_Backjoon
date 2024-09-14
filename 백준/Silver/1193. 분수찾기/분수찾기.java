import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int count = 1; int prev_count_sum = 0;
		
		while (true) {
			if (n <= count + prev_count_sum) {
				if (count % 2 == 1) {
					System.out.println((count - (n - prev_count_sum - 1)) + "/" + (n - prev_count_sum));
					break;
				} else {
					System.out.println((n - prev_count_sum) + "/" + (count - (n - prev_count_sum - 1)));
					break;
				}
			} else {
				prev_count_sum += count;
				count++;
			}
		}
	}
}
