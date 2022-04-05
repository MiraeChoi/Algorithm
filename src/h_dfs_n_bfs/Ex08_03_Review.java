package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_03_Review {
	//����
	//�̹� �����ø��ǾƵ��ȸ���� ���� ������ ���� ���Ͽ� ������ �������� �ֽ� N���� ������ Ǯ���� �մϴ�.
	//�� ������ �װ��� Ǯ���� �� ��� ������ Ǫ�� �� �ɸ��� �ð��� �־����� �˴ϴ�.
	//���ѽð� M �ȿ� N���� ���� �� �ִ� ������ ���� �� �ֵ��� �ؾ� �մϴ�.
	//(�ش� ������ �ش� �ð��� �ɸ��� Ǫ�� �ɷ� �����Ѵ�, �� ������ �� ���� Ǯ �� �ֽ��ϴ�.)

	//�Է�
	//ù ��° �ٿ� ������ ���� N(1<=N<=20)�� ���� �ð� M(10<=M<=300)�� �־����ϴ�.
	//�� ��° �ٺ��� N�ٿ� ���� ������ Ǯ���� ���� ������ Ǫ�� �� �ɸ��� �ð��� �־����ϴ�.

	//���
	//ù ��° �ٿ� ���� �ð� �ȿ� ���� �� �ִ� �ִ� ������ ����մϴ�.
	static int answer = 0, n, m;
	static int[] s, t;
	
	public void DFS(int L, int sum, int time) {
		if(time > m) return;
		if(L == n) answer = Math.max(answer, sum);
		else {
			DFS(L+1, sum + s[L], time + t[L]);
			DFS(L+1, sum, time);
		}
	}
	
	public static void main(String[] args) {
		Ex08_03_Review T = new Ex08_03_Review();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		s = new int[n];
		t = new int[n];
		for(int i = 0; i < n; i++) {
			s[i] = kb.nextInt();
			t[i] = kb.nextInt();
		}
		T.DFS(0, 0, 0);
		System.out.println(answer);
	}
}
