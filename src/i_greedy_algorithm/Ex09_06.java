package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex09_06 {
	static int n, m;
	static int[] ch;
	static ArrayList<ArrayList<Integer>> arr;
	
	public String solution(int s1, int s2) {
		String answer = "NO";
		Queue<Integer> Q = new LinkedList<>();
		Q.offer(s1);
		ch[s1] = 1;
		
		while(!Q.isEmpty()) {
			int tmp = Q.poll();
			
			for(int i = 1; i <= n; i++) {
				for(int j = 0; j < arr.get(i).size(); j++) {
					int cur = arr.get(i).get(j);
					
					if(cur == tmp && ch[i] == 0) {
						ch[i] = 1;
						Q.offer(i);
					}
				}
			}
			
			for(int n : arr.get(tmp)) {
				if(n == s2) return "YES";
				if(!Q.contains(n) && ch[n] == 0) {
					ch[n] = 1;
					Q.offer(n);
				}
			}
		}
		if(ch[s1] == ch[s2]) return "YES";
		return answer;
	}
	
	public static void main(String[] args) {
		Ex09_06 T = new Ex09_06();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		ch = new int[n+1];
		arr = new ArrayList<>();
		for(int i = 0; i <= n; i++) {
			arr.add(new ArrayList<>());
		}
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			arr.get(a).add(b);
		}
		int s1 = kb.nextInt();
		int s2 = kb.nextInt();
		System.out.println(T.solution(s1, s2));
	}
}
