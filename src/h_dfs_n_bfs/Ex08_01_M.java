package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_01_M {
	//����
	//N���� ���ҷ� ������ �ڿ��� ������ �־�����, �� ������ �� ���� �κ��������� �������� ��
	//�� �κ������� ������ ���� ���� ���� ��찡 �����ϸ� "YES"�� ����ϰ�, �׷��� ������ "NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
	//�ѷ� ������ �� �κ������� ���μ� �����̸�, �� �κ������� ���ϸ� �Է����� �־��� ������ ������ �Ǿ�� �մϴ�.
	//���� ��� {1, 3, 5, 6, 7, 10}�� �ԷµǸ� {1, 3, 5, 7} = {6, 10} ���� �� �κ������� ���� 16���� ���� ��찡 �����ϴ� ���� �� �� �ִ�.
	
	//�Է�
	//ù ��° �ٿ� �ڿ��� N(1<=N<=10)�� �־����ϴ�.
	//�� ��° �ٿ� ������ ���� N���� �־�����. �� ���Ҵ� �ߺ����� �ʴ´�.
	
	//���
	//ù ��° �ٿ� "YES" �Ǵ� "NO"�� ����Ѵ�.
	static String answer = "NO";
	static int n;
	static int[] arr;
	static int[] ch;
	static int sum;
	
	public void DFS(int L) {
		if(L == n) {
			int cnt = 0;
			for(int i = 0; i < n; i++) if(ch[i] == 1) cnt += arr[i];
			if(sum - cnt == cnt) {
				answer = "YES";
				return;
			}
		} else {
			ch[L] = 1;
			DFS(L+1);
			ch[L] = 0;
			DFS(L+1);
		}
	}
	
	public static void main(String[] args) {
		Ex08_01_M T = new Ex08_01_M();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		arr = new int[n];
		ch = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for(int i = 0; i < n; i++) sum += arr[i];
		T.DFS(0);
		System.out.println(answer);
	}
}
