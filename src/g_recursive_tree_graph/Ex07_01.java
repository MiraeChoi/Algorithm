package g_recursive_tree_graph;

import java.util.Scanner;

class Ex07_01 {
	//����
	//�ڿ��� N�� �ԷµǸ� ����Լ��� �̿��Ͽ� 1���� N������ ����ϴ� ���α׷��� �ۼ��ϼ���.
	
	//�Է�
	//ù ��° ���� ���� N(3<=N<=10)�� �Էµȴ�.
	
	//���
	//ù° �ٿ� ����Ѵ�.
	public int[] solution(int n) {
		int[] answer = new int[n];
		
		for(int i = 0; i < n; i++) {
			answer[i] = i+1;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex07_01 T = new Ex07_01();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		for(int x : T.solution(n)) System.out.print(x + " ");
	}
}
