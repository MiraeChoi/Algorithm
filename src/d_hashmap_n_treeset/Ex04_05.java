package d_hashmap_n_treeset;

import java.util.Scanner;
import java.util.TreeSet;

class Ex04_05 {
	public int solution(int n, int k, int[] arr) {
		int answer = -1;
		TreeSet<Integer> count = new TreeSet<>();
		int lt = 0, ct = 1, rt = 2;
		
		while(lt < arr.length-2) {
			count.add(arr[lt] + arr[ct] + arr[rt]);
			
			if(rt == arr.length-1) {
				if(ct == rt - 1) {
					lt++;
					ct = lt;
				}
				ct++;
				rt = ct;
			}
			rt++;
			
			if(count.size() == k + 1) {
				count.remove(count.first());
			}
		}
		
		if(count.size() >= k) answer = count.first();
		return answer;
	}
	
	public static void main(String[] args) {
		Ex04_05 T = new Ex04_05();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, k, arr));
	}
}
