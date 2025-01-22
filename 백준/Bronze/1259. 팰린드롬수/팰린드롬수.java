import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			int count = 0;
			String s = br.readLine();
			if (s.equals("0")) {
				break;
			}
			int n = s.length();
			for (int i=0; i<n/2; i++) {
				if (s.charAt(i) != s.charAt(n-1-i)) {
					count++;
				}
			}
			if (count == 0) sb.append("yes").append("\n");
			if (count != 0) sb.append("no").append("\n");
		}
		System.out.println(sb);
	}
}