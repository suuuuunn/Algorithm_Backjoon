import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken()); int m = Integer.parseInt(st.nextToken());
		HashMap<Integer, String> hmap1 = new HashMap<>();
		HashMap<String, Integer> hmap2 = new HashMap<>();
		
		for (int i=1; i<=n; i++) {
			String s = br.readLine();
			hmap1.put(i, s);
			hmap2.put(s, i);
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<m; i++) {
			String s = br.readLine();
			// 문자인가?
			if (49 <= s.charAt(0) && s.charAt(0) <= 57) {
				sb.append(hmap1.get(Integer.parseInt(s))).append("\n");
			} else {
				sb.append(hmap2.get(s)).append("\n");
			}
		}
		System.out.println(sb);
	}
}