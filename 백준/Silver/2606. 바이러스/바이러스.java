import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int node, link, count;
	static boolean[] visited;
	static List[] computers;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		node = Integer.parseInt(br.readLine());
		link = Integer.parseInt(br.readLine());
		
		visited = new boolean[node+1];
		computers = new List[node+1];
		
		for (int i=1; i<=node; i++) {
			computers[i] = new ArrayList<Integer>();
		}
		
		StringTokenizer st;
		for (int i=0; i<link; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			computers[a].add(b);
			computers[b].add(a);
		}
	
		count = 0;
		bfs(1);
		
		System.out.println(count-1);
	}

	private static void bfs(int start) {
		Queue<Integer> que = new LinkedList<Integer>();
		que.add(start);
		while (!que.isEmpty()) {
			int now = que.poll();
			if (!visited[now]) {
				count++;
				visited[now] = true;
				for (int i=0; i<computers[now].size(); i++) {
					que.add((int)computers[now].get(i));
				}
			}
		}
	}
	
}