package d_hashmap_n_treeset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Ex04_03_Review {
	public ArrayList<Integer> solution(int n, int k, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int lt = 0;
		
		for(int rt = 0; rt < n; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
			
			if(rt == k - 1 + lt) {
				answer.add(map.size());
				map.put(arr[lt], map.get(arr[lt])-1);
				
				if(map.get(arr[lt]) == 0) map.remove(arr[lt]);
				lt++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex04_03_Review T = new Ex04_03_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, k, arr)) System.out.print(x + " ");
	}
}
