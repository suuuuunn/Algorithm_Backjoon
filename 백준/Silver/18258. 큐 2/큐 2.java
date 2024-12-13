import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int last = 0;
		
		Queue<Integer> que = new LinkedList<>();
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			switch (st.nextToken()) {
			case "push": 
				last = Integer.parseInt(st.nextToken());
				que.offer(last);
				break;
			case "pop": 
				if (que.isEmpty()) sb.append("-1").append("\n");
				else sb.append(que.poll()).append("\n");
				break;
			case "size":
				sb.append(que.size()).append("\n");
				break;
			case "empty":
				if (que.isEmpty()) sb.append("1").append("\n");
				else sb.append("0").append("\n");
				break;
			case "front":
				if (que.isEmpty()) sb.append("-1").append("\n");
				else sb.append(que.peek()).append("\n");
				break;
			case "back":
				if (que.isEmpty()) sb.append("-1").append("\n");
				else sb.append(last).append("\n");
				break;
			}
		}
        System.out.println(sb);
		
	}
	
}