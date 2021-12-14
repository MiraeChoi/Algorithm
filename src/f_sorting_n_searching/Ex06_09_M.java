package f_sorting_n_searching;

import java.util.Scanner;

class Ex06_09_M {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		int lt = arr[n-1], rt = 0;
		for(int i = 0; i < n; i++) rt += arr[i];
		
		while(lt <= rt) {
			int mid = (lt + rt) / 2;
			System.out.println("¡Úmid : " + mid + "¡Ú");
			int sum = 0, cnt = 1;
			
			for(int i = 0; i < n; i++) {		
				if(sum + arr[i] > mid) {
					sum = arr[i];
					cnt++;
				} else {
					sum += arr[i];
				}
				System.out.println("i : " + i + " / sum : " + sum);
			}
			
			System.out.println("lt : " + lt + " / rt : " + rt);
			System.out.println("cnt : " + cnt);
			
			if(cnt <= m) {
				answer = mid;
				rt = mid - 1;
			} else {
				lt = mid + 1;
			}
			System.out.println("---------answer : " + answer);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex06_09_M T = new Ex06_09_M();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}
