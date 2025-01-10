import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int arr[] = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		double avg = average(arr);
		int mode = mode(arr);
		
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%.0f", avg)).append("\n");
		sb.append(arr[arr.length/2]).append("\n");
		sb.append(mode).append("\n");
		sb.append(arr[n-1]-arr[0]).append("\n");
		
		System.out.println(sb);
	}

	private static int mode(int[] arr) {
		int count = 0; int max = -1; 
		int mode = arr[0]; boolean check = false;
		for (int i=0; i<arr.length-1; i++) {
			if (arr[i] == arr[i+1]) {
				count++;
			} else {
				count = 0;
			}
			if (max < count) {
				max = count;
				mode = arr[i];
				check = true;
			} else if (max == count && check == true) {
				mode = arr[i];
				check = false;
			}
		}
		return mode;
	}

	private static double average(int[] arr) {
		double sum = 0;
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		double avg = Math.round(sum / arr.length);
		return avg;
	}
}