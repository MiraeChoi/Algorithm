package b_array;

import java.util.Scanner;

class Ex02_11 {
	public int solution(int n, int[][] arr) {
		int answer = 0;
		int[] ban = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] count = new int[ban.length];
		int[] same = new int[n];
		
		for(int i = 0; i < arr[0].length; i++) {
			for(int k = 0; k < ban.length; k++) {
				count[k] = 0;
			}
			
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < ban.length; k++) {
					if(arr[j][i] == ban[k]) count[k]++;
				}
			}
			
			int tmp = 0;
			
			for(int k = 0; k < ban.length; k++) {
				if(count[k] >= 2) {
					tmp = k+1;
					
					for(int j = 0; j < n; j++) {
						if(tmp == arr[j][i]) same[j]++;
					}
				}
			}
		}
		
		answer = 0;
		int max = 0;
		
		for(int i = 0; i < same.length; i++) {
			if(same[i] > max) {
				max = same[i];
			}
		}
		
		for(int i = 0; i < same.length; i++) {
			if(max == same[i]) {
				answer = i+1;
				break;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_11 T = new Ex02_11();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][5];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}
}

