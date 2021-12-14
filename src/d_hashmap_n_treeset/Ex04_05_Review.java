package d_hashmap_n_treeset;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

class Ex04_05_Review {
	public int solution(int n, int k, int[] arr) {
		int answer = -1;
		TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				for(int l = j+1; l < n; l++) {
					set.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}
		
		int cnt = 0;
		
		for(int x : set) {
			cnt++;
			if(cnt == k) return x;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex04_05_Review T = new Ex04_05_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, k, arr));
	}
}
