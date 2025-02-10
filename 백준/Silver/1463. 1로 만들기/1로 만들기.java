import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static Integer[] dp = new Integer[1000001];
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		dp[1] = 0; dp[2] = 1; dp[3] = 1;
		
		System.out.println(makeOne(n));
	}
	
	private static Integer makeOne(int n) {
		if (dp[n] == null) {
			if (n % 6 == 0) {
				dp[n] = Math.min(Math.min(makeOne(n/3), makeOne(n/2)), makeOne(n-1)) + 1;
			} else if (n % 3 == -0) {
				dp[n] = Math.min(makeOne(n-1), makeOne(n/3)) + 1;
			} else if (n % 2 == 0) {
				dp[n] = Math.min(makeOne(n-1), makeOne(n/2)) + 1;
			} else {
				dp[n] = makeOne(n-1) + 1;
			}
		} 
		return dp[n];
	}
	
}