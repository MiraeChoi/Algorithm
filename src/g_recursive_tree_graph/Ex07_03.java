package g_recursive_tree_graph;

import java.util.Scanner;

class Ex07_03 {
	//����
	//�ڿ��� N�� �ԷµǸ� N!�� ���ϴ� ���α׷��� �ۼ��ϼ���.
	//���� ��� 5!=5*4*3*2*1=120�Դϴ�.
	
	//�Է�
	//ù ��° �ٿ� �ڿ��� N(1<=N<=100)�� �־����ϴ�.
	
	//���
	//ù ��° �ٿ� N���丮�� ���� ����մϴ�.
	int answer = 1;
	
	public int DFS(int n) {
		if(n == 0) return answer;
		else {
			answer = answer * n;
			DFS(n-1);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex07_03 T = new Ex07_03();
		Scanner kb = new Scanner(System.in);
		System.out.println(T.DFS(kb.nextInt()));
	}
}
