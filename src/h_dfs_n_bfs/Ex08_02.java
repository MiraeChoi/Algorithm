package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_02 {
	//����
	//ö���� ���� �ٵ��̵��� ������ ���忡 ������ �Ѵ�. �׷��� ���� Ʈ���� Cų�α׷� �Ѱ� �¿� ���� ����.
	//ö���� C�� ���� �����鼭 ���� �ٵ��̵��� ���� ���̰� �¿�� �ʹ�.
	//N������ �ٵ��̿� �� �ٵ����� ���� W�� �־�����, ö���� Ʈ���� �¿� �� �ִ� ���� ���ſ� ���Ը� ���ϴ� ���α׷��� �ۼ��ϼ���.
	
	//�Է�
	//ù ��° �ٿ� �ڿ��� C(1<=C<=100,000,000)�� N(1<=N<=30)�� �־����ϴ�.
	//��° �ٺ��� N���� �ٵ����� ���԰� �־�����.
	
	//���
	//ù ��° �ٿ� ���� ���ſ� ���Ը� ����Ѵ�.
	static int answer;
	static int c, n;
	static int[] arr;
	
	public void DFS(int L, int sum) {
		if(sum > c) return;
		if(L == n) {
			answer = Integer.max(answer, sum);
		}
		else {
			Integer.max(answer, sum + arr[L]);
			DFS(L+1, sum + arr[L]);
			Integer.max(answer, sum);
			DFS(L+1, sum);
		}
	}
	
	public static void main(String[] args) {
		Ex08_02 T = new Ex08_02();
		Scanner kb = new Scanner(System.in);
		c = kb.nextInt();
		n = kb.nextInt();
		arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		T.DFS(0, 0);
		System.out.println(answer);
	}
}
