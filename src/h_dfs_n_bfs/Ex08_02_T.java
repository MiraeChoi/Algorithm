package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_02_T {
	//����
	//ö���� ���� �ٵ��̵��� ������ ���忡 ������ �Ѵ�. �׷��� ���� Ʈ���� Cų�α׷� �Ѱ� �¿� ���� ����.
	//ö���� C�� ���� �����鼭 ���� �ٵ��̵��� ���� ���̰� �¿�� �ʹ�.
	//N������ �ٵ��̿� �� �ٵ����� ���� W�� �־�����, ö���� Ʈ���� �¿� �� �ִ� ���� ���ſ� ���Ը� ���ϴ� ���α׷��� �ۼ��ϼ���.
	
	//�Է�
	//ù ��° �ٿ� �ڿ��� C(1<=C<=100,000,000)�� N(1<=N<=30)�� �־����ϴ�.
	//��° �ٺ��� N���� �ٵ����� ���԰� �־�����.
	
	//���
	//ù ��° �ٿ� ���� ���ſ� ���Ը� ����Ѵ�.
	static int answer = Integer.MIN_VALUE, c, n;
	
	public void DFS(int L, int sum, int[] arr) {
		if(sum > c) return;
		if(L == n) {
			answer = Math.max(answer, sum);
		}
		else {
			DFS(L+1, sum + arr[L], arr);
			DFS(L+1, sum, arr);
		}
	}
	
	public static void main(String[] args) {
		Ex08_02_T T = new Ex08_02_T();
		Scanner kb = new Scanner(System.in);
		c = kb.nextInt();
		n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}
}
