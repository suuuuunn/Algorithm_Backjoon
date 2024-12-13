import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static StringBuilder sb = new StringBuilder();
	static Queue<Integer> que = new LinkedList<>();
	static int last = 0;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());

		while (n-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			switch(st.nextToken()) {
			case "push": push(Integer.parseInt(st.nextToken())); break;
			case "pop": pop(); break;
			case "size": size(); break;
			case "empty": empty(); break;
			case "front": front(); break;
			case "back": back(); break;
			}
		}
		System.out.println(sb);
	}

	
	static void push(Integer x) {
		que.offer(x);
		last = x;
	}
	
	static void pop() {
		if (que.size() == 0) sb.append(-1).append("\n");
		else sb.append(que.poll()).append("\n");
	}
	
	static void size() {
		sb.append(que.size()).append("\n");
	}
	
	static void empty() {
		if (que.isEmpty()) sb.append(1).append("\n");
		else sb.append(0).append("\n");
	}
	
	static void front() {
		if (que.isEmpty()) sb.append(-1).append("\n");
		else sb.append(que.peek()).append("\n");
	}
	
	static void back() {
		if (que.isEmpty()) sb.append(-1).append("\n");
		else sb.append(last).append("\n");
	}
	
}
