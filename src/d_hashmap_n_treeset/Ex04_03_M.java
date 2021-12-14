package d_hashmap_n_treeset;

import java.util.HashMap;
import java.util.Scanner;

class Ex04_03_M {
	public int[] solution(int n, int k, int[] arr) {
		int[] answer = new int[n-k+1];
		HashMap<Integer, Integer> map = new HashMap<>();
		int lt = 0;
		
		for(int rt = 0 + lt; rt < n; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
			
			if(rt == lt + k - 1) {
				answer[lt] = map.size();
				map.put(arr[lt], map.get(arr[lt])-1);
				
				if(map.get(arr[lt]) == 0) map.remove(arr[lt]);
				lt++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex04_03_M T = new Ex04_03_M();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, k, arr)) System.out.print(x + " ");
	}
}
