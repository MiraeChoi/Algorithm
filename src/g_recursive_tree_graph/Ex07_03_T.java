package g_recursive_tree_graph;

import java.util.Scanner;

class Ex07_03_T {
	//����
	//�ڿ��� N�� �ԷµǸ� N!�� ���ϴ� ���α׷��� �ۼ��ϼ���.
	//���� ��� 5!=5*4*3*2*1=120�Դϴ�.
	
	//�Է�
	//ù ��° �ٿ� �ڿ��� N(1<=N<=100)�� �־����ϴ�.
	
	//���
	//ù ��° �ٿ� N���丮�� ���� ����մϴ�.
	public int DFS(int n) {
		if(n == 1) return 1;
		else return n * DFS(n-1);
	}
	
	public static void main(String[] args) {
		Ex07_03_T T = new Ex07_03_T();
		Scanner kb = new Scanner(System.in);
		System.out.println(T.DFS(kb.nextInt()));
	}
}
