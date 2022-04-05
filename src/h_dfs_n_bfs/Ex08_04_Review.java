package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_04_Review {
	//����
	//1���� N���� ��ȣ�� ���� ������ �ֽ��ϴ�. ���� �ߺ��� ����Ͽ� M���� �̾� �Ϸķ� �����ϴ� ����� ��� ����մϴ�.
	
	//�Է�
	//ù ��° �ٿ� �ڿ��� N(3<=N<=10)�� M(2<=M<=N)�� �־����ϴ�.
	
	//���
	//ù ��° �ٿ� ����� ����մϴ�.
	//��� ������ ���������� ������������ ����մϴ�.
	static int n, m;
	static int[] pm;
	
	public void DFS(int L) {
		if(L == m) {
			for(int x : pm) System.out.print(x + " ");
			System.out.println();
		} else {
			for(int i = 1; i <= n; i++) {
				pm[L] = i;
				DFS(L+1);
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_04_Review T = new Ex08_04_Review();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		pm = new int[m];
		T.DFS(0);
	}
}
