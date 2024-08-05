import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int arr[][] = new int[9][9];
		int max = 0;
		int i_index = 0;
		int j_index = 0;
		for (int i=0; i<9; i++) {
			for (int j=0; j<9; j++) {
				arr[i][j] = s.nextInt();
				if (arr[i][j] >= max) {
					max = arr[i][j];
					i_index = i+1;
					j_index = j+1;
				}
			}
		}
		System.out.println(max);
		System.out.println(i_index + " " + j_index);
	}
	
}