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
		Deque<Integer> deq = new ArrayDeque<>();
		
		int index[] = new int[n];
		st  = new StringTokenizer(br.readLine(), " ");
		for (int i=1; i<=n; i++) {
			deq.offer(i);
			index[i-1] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(deq.poll()).append(" ");
		int k = 1;
		while (deq.size() > 1) {
			if (index[k-1] > 0) {
				for (int i=0; i<index[k-1]-1; i++) {
					deq.offerLast(deq.poll());
				}
				k = deq.poll();
				sb.append(k).append(" ");
			} else if (index[k-1] < 0) {
				for (int i=0; i < (-index[k-1])-1; i++) {
					deq.offerFirst(deq.pollLast());
				}
				k = deq.pollLast();
				sb.append(k).append(" ");
			}
		}
		sb.append(deq.poll());
		
		System.out.println(sb);
	}

}