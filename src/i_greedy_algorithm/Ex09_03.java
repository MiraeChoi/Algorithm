package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Sort03 implements Comparable<Sort03> {
	int a, l;
	
	public Sort03(int a, int l) {
		this.a = a;
		this.l = l;
	}

	@Override
	public int compareTo(Sort03 o) {
		return this.a - o.a;
	}
}

class Ex09_03 {
	public int solution(int n, ArrayList<Sort03> arr, int min, int max) {
		int answer = 0;
		Collections.sort(arr);
		
		for(int i = min; i < max; i++) {
			int cnt = 0;
			
			for(int j = 0; j < n; j++) {
				if(arr.get(j).a <= i && arr.get(j).l > i) {
					cnt++;
					continue;
				}
			}
			answer = Math.max(answer, cnt);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex09_03 T = new Ex09_03();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Sort03> arr = new ArrayList<>();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			int x = kb.nextInt();
			int y = kb.nextInt();
			arr.add(new Sort03(x, y));
			min = Math.min(min, x);
			max = Math.max(max, y);
		}
		System.out.println(T.solution(n, arr, min, max));
	}
}
