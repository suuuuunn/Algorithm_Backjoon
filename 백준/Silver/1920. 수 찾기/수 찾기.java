import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int arr1[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i=0; i<n; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		int m = Integer.parseInt(br.readLine());
		int arr2[] = new int[m];
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		for (int i=0; i<m; i++) {
			arr2[i] = Integer.parseInt(st2.nextToken());
		}
		
		Arrays.sort(arr1);
		
		StringBuilder sb = new StringBuilder();
		for (int j=0; j<m; j++) {
			int left = 0; int right = n - 1;
			boolean found = false;
		    while (left <= right) {
		    	int mid = (left + right) / 2;
		    	if (arr2[j] == arr1[mid]) {
		    		found = true;
		    		break;
		    	} else if (arr2[j] < arr1[mid]) {
		    		right = mid - 1;
		    	} else {
		    		left = mid + 1;
		    	}
		    }
		    if (found) {
		    	sb.append(1).append("\n");
		    } else {
		    	sb.append(0).append("\n");
		    }
 		}
		System.out.println(sb);
		
	}
	
}