import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = n/5;
		if (n / 25 >= 1) {
			count += n / 25;
		}
		if (n / 125 >= 1) {
			count += n / 125;
		}
		System.out.println(count);
	}
}