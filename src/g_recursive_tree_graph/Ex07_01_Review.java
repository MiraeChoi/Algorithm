package g_recursive_tree_graph;

import java.util.Scanner;

class Ex07_01_Review {
	//����
	//�ڿ��� N�� �ԷµǸ� ����Լ��� �̿��Ͽ� 1���� N������ ����ϴ� ���α׷��� �ۼ��ϼ���.
	
	//�Է�
	//ù ��° ���� ���� N(3<=N<=10)�� �Էµȴ�.
	
	//���
	//ù° �ٿ� ����Ѵ�.
	public void DFS(int n) {
		if(n == 0) return;
		else {
			DFS(n-1);
			System.out.print(n + " ");
		}
	}
	
	public static void main(String[] args) {
		Ex07_01_Review T = new Ex07_01_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		T.DFS(n);
	}
}
