package h_dfs_n_bfs;

import java.util.ArrayList;
import java.util.Scanner;

class Ex08_01 {
	//설명
	//N개의 원소로 구성된 자연수 집합이 주어지면, 이 집합을 두 개의 부분집합으로 나누었을 때
	//두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 "YES"를 출력하고, 그렇지 않으면 "NO"를 출력하는 프로그램을 작성하세요.
	//둘로 나뉘는 두 부분집합은 서로소 집합이며, 두 부분집합을 합하면 입력으로 주어진 원래의 집합이 되어야 합니다.
	//예를 들어 {1, 3, 5, 6, 7, 10}이 입력되면 {1, 3, 5, 7} = {6, 10} 으로 두 부분집합의 합이 16으로 같은 경우가 존재하는 것을 알 수 있다.
	
	//입력
	//첫 번째 줄에 자연수 N(1<=N<=10)이 주어집니다.
	//두 번째 줄에 집합의 원소 N개가 주어진다. 각 원소는 중복되지 않는다.
	
	//출력
	//첫 번째 줄에 "YES" 또는 "NO"를 출력한다.
	static String answer = "NO";
	static int n;
	static ArrayList<Integer> a = new ArrayList<>();
	static ArrayList<Integer> b = new ArrayList<>();
	static int[] ch;
	static int[] arr;
	
	public void DFS(int L) {
		if(L == n) {
			for(int i = 0; i < ch.length; i++) if(ch[i] == 1) a.add(arr[i]);
			for(int i = 0; i < ch.length; i++) if(ch[i] == 0) b.add(arr[i]);
			
			int ca = 0; int cb = 0;
			for(int i = 0; i < a.size(); i++) ca += a.get(i);
			for(int i = 0; i < b.size(); i++) cb += b.get(i);
			
			for(int i = 0; i < a.size(); i++) {
				System.out.print(a.get(i) + "/");
			}
			System.out.println();
			System.out.println("ca : " + ca);
			for(int i = 0; i < b.size(); i++) {
				System.out.print(b.get(i) + "/");
			}
			System.out.println();
			System.out.println("cb : " + cb);
			
			if(ca == cb) {
				answer = "YES";
				System.out.println("-------------------------------------------");
				a.clear(); b.clear();
				return;
			}
			a.clear(); b.clear();
		} else {
			ch[L] = 1;
			DFS(L+1);
			ch[L] = 0;
			DFS(L+1);
		}
	}
	
	public static void main(String[] args) {
		Ex08_01 T = new Ex08_01();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		ch = new int[n];
		arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		T.DFS(0);
		System.out.println(answer);
	}
}
