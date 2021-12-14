package f_sorting_n_searching;

import java.util.Scanner;

class Ex06_09 {
	public int solution(int n, int m, int[] arr) {
		int answer = Integer.MAX_VALUE;
		int first = n / m;
		int second = n / m * 2;
		
		while(first < second && second < n) {
			int cnt1 = 0, cnt2 = 0, cnt3 = 0;
			
			for(int i = 0; i < first; i++) cnt1 += arr[i];
			for(int i = first; i < second; i++) cnt2 += arr[i];
			for(int i = second; i < n; i++) cnt3 += arr[i];
			System.out.println("(" + first + ", " + second + ")");
			System.out.println("1." + cnt1 + " 2." + cnt2 + " 3." + cnt3);
			
			int tmp = Integer.max(cnt3, Integer.max(cnt1, cnt2));
			System.out.println("tmp : " + tmp);
			if(tmp < answer) answer = tmp;
			System.out.println("answer : " + answer);
			
			if(cnt1 > cnt2 && cnt1 > cnt3) {
				if(cnt2 > cnt3) break;
				else second++;
			} else if(cnt2 > cnt1 && cnt2 > cnt3) {
				if(cnt1 > cnt3) break;
				else first++;
			} else if(cnt3 > cnt1 && cnt3 > cnt2) {
				if(cnt1 > cnt2) second++;
				else first++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex06_09 T = new Ex06_09();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}
