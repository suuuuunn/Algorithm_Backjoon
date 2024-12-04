import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());

		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> list;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i=0; i<n; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		list = new ArrayList<>(arr.stream().distinct().collect(Collectors.toList()));
		Collections.sort(list);
		
		Map<Integer, Integer> indexMap = new HashMap<>();
		for (int i=0; i<list.size(); i++) {
			indexMap.put(list.get(i), i);
		}
		
		for (int i=0; i<n; i++) {
			bw.write(indexMap.get(arr.get(i))+" ");
		}
		bw.flush();
	}
	
}