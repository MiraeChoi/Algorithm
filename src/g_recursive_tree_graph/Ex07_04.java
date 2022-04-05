package g_recursive_tree_graph;

import java.util.Scanner;

class Ex07_04 {
	//����
	//1) �Ǻ���ġ ������ ����Ѵ�. �Ǻ���ġ �����̶� ���� 2���� ���� ���Ͽ� ���� ���ڰ� �Ǵ� �����̴�.
	//2) �Է��� �Ǻ���ġ ������ �� ���� ���̴�. ���� 7�� �ԷµǸ� 1 1 2 3 5 8 13�� ����ϸ� �ȴ�.
	
	//�Է�
	//ù �ٿ� �� �׼� N(1<=N<=100)�� �Էµȴ�.
	
	//���
	//ù �ٿ� �Ǻ���ġ ������ ����մϴ�.
	int n0 = 0;
	int n1 = 1;
	
	public void DFS(int n) {
		if(n == 0) return;
		else {
			DFS(n-1);
			System.out.print(n1 + " ");
			int tmp = n1;
			n1 = n0 + n1;
			n0 = tmp;
		}
	}
	
	public static void main(String[] args) {
		Ex07_04 T = new Ex07_04();
		Scanner kb = new Scanner(System.in);
		T.DFS(kb.nextInt());
	}
}
