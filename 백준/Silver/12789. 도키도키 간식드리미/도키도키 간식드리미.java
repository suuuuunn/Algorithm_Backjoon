import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i=0; i<n; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> store = new Stack<>();
		int index = 1;
		while (true) {
			for (int i=0; i<arr.size(); i++) {
				if (index == arr.get(i)) {
					index++;
					stack.push(arr.get(i));
					arr.remove(i);
					i--;
				} else if (!store.isEmpty() && index == store.peek()) {
					index++;
					stack.push(store.pop());
					i--;
				} else {
					store.push(arr.get(i));
				}
			}
			if (stack.size() == n) {
				sb.append("Nice");
				break;
			}
			if (index != store.peek()) {
				sb.append("Sad");
				break;
			}
		}
		System.out.println(sb);
	}
	
}