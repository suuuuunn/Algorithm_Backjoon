import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int m = s.nextInt(); int n = s.nextInt();
		char arr1[][] = new char[50][50];
		char arr2[][] = new char[50][50]; 
		
		for (int i=0; i<50; i++) {
			for (int j=0; j<50; j++) {
				if (i % 2 == 0 && j % 2 == 0) {
					arr1[i][j] = 'B';
					arr2[i][j] = 'W';
				} else if (i % 2 == 0 && j % 2 == 1) {
					arr1[i][j] = 'W';
					arr2[i][j] = 'B';
				} else if (i % 2 == 1 && j % 2 == 0) {
					arr1[i][j] = 'W';
					arr2[i][j] = 'B';
				} else {
					arr1[i][j] = 'B';
					arr2[i][j] = 'W';
				}
			}
		}
		
		String mn[] = new String[m];
		for (int i=0; i<m; i++) {
			mn[i] = s.next();
		}
	
		int min = 64;
		for (int k=0; k<=m-8; k++) {
			for (int l=0; l<=n-8; l++) {
				int count1 = 0; int count2 = 0;
				for (int i=k; i<k+8; i++) {
					for (int j=l; j<l+8; j++) {
						if (arr1[i][j] != mn[i].charAt(j)) {
							count1++;
						}
						if (arr2[i][j] != mn[i].charAt(j)) {
							count2++;
						}
					}
				}
				if (min >= count1 && count1 <= count2) {
					min = count1;
				}
				if (min >=count2 && count2 < count1) {
					min = count2;
				}
			}
		}
		System.out.println(min);
	}
	
}
