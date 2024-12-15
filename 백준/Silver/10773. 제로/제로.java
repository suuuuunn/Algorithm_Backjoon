import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		int sum = 0;
		for (int i=0; i<n; i++) {
			int x = Integer.parseInt(br.readLine());
			if (x == 0) {
				int pop = stack.pop();
				sum -= pop;
			} else {
				stack.add(x);
				sum += x;
			}
		}
		System.out.println(sum);
	}
}