package j_dynamic_programming;

import java.util.Scanner;

class Ex10_01_M {
	//설명
	//철수는 계단을 오를 때 한 번에 한 계단 또는 두 계단씩 올라간다. 만약 총 4계단을 오른다면 그 방법의 수는
	//1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2 로 5가지이다.
	//그렇다면 총 N계단일 때 철수가 올라갈 수 있는 방법의 수는 몇 가지인가?
	//(그림 1)
	
	//입력
	//첫째 줄은 계단의 개수인 자연수 N(3≤N≤35)이 주어집니다.
	
	//출력
	//첫 번째 줄에 올라가는 방법의 수를 출력합니다.
	static int n, sum = 0;
	static int[] dy;
	
	public void DFS(int v) {
		if(v > n) return;
		if(v <= 2) dy[v] = v;
		else dy[v] = dy[v-2] + dy[v-1];
		v++;
		DFS(v);
	}
	
	public static void main(String[] args) {
		Ex10_01_M T = new Ex10_01_M();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		dy = new int[n+1];
		T.DFS(1);
		System.out.println(dy[n]);
	}
}
