import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while (n-- > 0) {
			HashMap<String, Integer> hmap = new HashMap<>();
			int k = Integer.parseInt(br.readLine());
			while (k-- > 0) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				st.nextToken(); // 이름은 필요없음
				String kind = st.nextToken(); // 옷의 종류
				
				// 같은 종류의 옷이면 value값 + 1
				if (hmap.containsKey(kind)) {
					hmap.put(kind, hmap.get(kind) + 1);
				} else {
					hmap.put(kind, 1);
				}
			}
			int count = 1;
			for (int val: hmap.values()) {
				count *= (val + 1);
			}
			sb.append(count - 1).append("\n");
		}
		System.out.println(sb);
	}
}