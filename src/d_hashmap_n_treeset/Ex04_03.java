package d_hashmap_n_treeset;

import java.util.HashMap;
import java.util.Scanner;

class Ex04_03 {
	public int[] solution(int n, int k, int[] arr) {
		int[] answer = new int[n-k+1];
		HashMap<Integer, Integer> map;
		
		for(int i = 0; i < n-k+1; i++) {
			map = new HashMap<>();
			
			for(int j = 0+i; j < k+i; j++) {
				if(j == n) break;
				map.put(arr[j], map.getOrDefault(arr[j], 0)+1);
			}

			answer[i] = map.size();
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex04_03 T = new Ex04_03();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, k, arr)) System.out.print(x + " ");
	}
}
