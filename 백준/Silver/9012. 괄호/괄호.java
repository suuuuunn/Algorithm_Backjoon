import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n; i++) {
			String s = br.readLine();
			int sum = 0;
			for (int j=0; j<s.length(); j++) {
				sum = (s.charAt(j) == '(') ? sum+1 : sum-1;
				if (sum < 0) {
					break;
				}
			}
			if (sum != 0) {
				sb.append("NO").append("\n");
			} else {
				sb.append("YES").append("\n");
			}
		}
		System.out.println(sb);
		
	}
	
}