import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		int top = -1;
		for (int i=0; i<n; i++) {
			int x = Integer.parseInt(br.readLine());
			if (x == 0) {
				top--;
			} else {
				top++;
				arr[top] = x;
			}
		}
		int sum = 0;
		for (int i=0; i<=top; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}