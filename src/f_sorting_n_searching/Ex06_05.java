package f_sorting_n_searching;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex06_05 {
	public String solution(int n, int[] arr) {
		String answer = "U";
		Queue<Integer> q = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			if(q.contains(arr[i])) return "D";
			else q.offer(arr[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex06_05 T = new Ex06_05();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, arr));
	}
}
