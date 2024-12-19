import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		int document[] = new int[n];
		for (int i=0; i<n; i++) {
			document[i] = Integer.parseInt(st.nextToken());
		}

		Deque<Integer> que = new ArrayDeque<>();
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i=0; i<n; i++) {
			int value = Integer.parseInt(st.nextToken());
			if (document[i] == 0) {
				que.addLast(value);
			}
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<m; i++) {
			int element = Integer.parseInt(st.nextToken());
			que.offerFirst(element);
			sb.append(que.pollLast()).append(" ");
		}
		System.out.println(sb);
	}
	
}