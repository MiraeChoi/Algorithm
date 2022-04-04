package b_array;

import java.util.Scanner;

class Ex02_08_T {
	//����
	//N���� �л��� ���������� �ԷµǸ� �� �л��� ����� �Էµ� ������� ����ϴ� ���α׷��� �ۼ��ϼ���.
	//���� ������ �Էµ� ��� ���� ����� ���� ó���Ѵ�.
	//�� ���� ���� ������ 92���ε� 92���� 3�� �����ϸ� 1���� 3���̰� �� ���� �л��� 4���� �ȴ�.
	
	//�Է�
	//ù �ٿ� N(3<=N<=100)�� �Էµǰ�, �� ��° �ٿ� ���������� �ǹ��ϴ� N���� ������ �Էµȴ�.
	
	//���
	//�Էµ� ������� ����� ����Ѵ�.
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		
		for(int i = 0; i < n; i++) {
			int count = 1;
			
			for(int j = 0; j < n; j++) {
				if(arr[j] > arr[i]) count++;
			}
			answer[i] = count;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_08_T T = new Ex02_08_T();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}
}
