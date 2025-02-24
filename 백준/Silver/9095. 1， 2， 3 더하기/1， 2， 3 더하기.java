import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static Integer dp[] = new Integer[11]; 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		dp[1] = 1; dp[2] = 2; dp[3] = 4;
		for (int i=0; i<n; i++) {
			int k = Integer.parseInt(br.readLine());
			if (dp[k] == null) {
				func(k);
			}
			sb.append(dp[k]).append("\n");
		}
		System.out.println(sb);
	}
	private static Integer func(int k) {
		if (dp[k] == null) {
			dp[k] = func(k-1) + func(k-2) + func(k-3);
		}
		return dp[k];
	}
	
}