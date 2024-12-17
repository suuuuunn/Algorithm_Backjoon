import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<>();
		for (int i=1; i<=n; i++) {
			list.add(i);
			// System.out.print(list.get(i-1) + " ");
		}
		
		Queue<Integer> arr = new LinkedList<>();
		int index = k-1;
		while (arr.size() != n) {
			if (index > list.size() - 1) {
				index -= list.size();
				while (index > list.size() - 1) {
					index -= list.size();
				}
				arr.offer(list.get(index));
				list.remove(index);
				index += (k-1);
			} else {
				arr.offer(list.get(index));
				list.remove(index);
				index += (k-1);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while (!arr.isEmpty()) {
			sb.append(arr.poll());
			if (!arr.isEmpty()) {
				sb.append(", ");
			}
		}
		sb.append(">");
		System.out.println(sb);
	}
	
}
