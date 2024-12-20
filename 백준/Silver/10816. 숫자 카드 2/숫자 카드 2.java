import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		List<Integer> list = new ArrayList<>();
		st = new StringTokenizer(br.readLine(), " ");
		for (int i=0; i<n; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		// list 정렬
		Collections.sort(list);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<m; i++) {
			int key = Integer.parseInt(st.nextToken());
			
			sb.append(upper(list, key) - lower(list, key)).append(" ");
		}
		System.out.println(sb);
	}
	
	private static int upper(List<Integer> list, int key) {
		int lo = 0; int high = list.size();
		
		while (lo < high) {
			int mid = (lo + high) / 2;
			
			if (key < list.get(mid)) {
				high = mid;
			} else {
				lo = mid + 1;
			}
		}
		return lo;
	}
	
	private static int lower(List<Integer> list, int key) {
		int lo = 0; int high = list.size();
		
		while (lo < high) {
			int mid = (lo + high) / 2;
			
			if (key <= list.get(mid)) {
				high = mid;
			} else {
				lo = mid + 1;
			}
		}
		return lo;
	}
}