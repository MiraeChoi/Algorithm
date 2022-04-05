package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_01_Review {
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
	static int n, total = 0;
	static int[] arr;
	boolean flag = false;
	
	public void DFS(int L, int sum) {
		if(flag) return;
		if(sum > total / 2) return;
		if(L == n) {
			if(total - sum == sum) {
				answer = "YES";
				flag = true;
			}
		} else {
			DFS(L+1, sum + arr[L]);
			DFS(L+1, sum);
		}
	}
	
	public static void main(String[] args) {
		Ex08_01_Review T = new Ex08_01_Review();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
			total += arr[i];
		}
		T.DFS(0, 0);
		System.out.println(answer);
	}
}
