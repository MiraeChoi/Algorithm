package c_pointers_n_window;

import java.util.Scanner;

class Ex03_04_T {
	//����
	//N���� ���� �̷���� ������ �־����ϴ�.
	//�� �������� ���Ӻκм����� ���� Ư������ M�� �Ǵ� ��찡 �� �� �ִ��� ���ϴ� ���α׷��� �ۼ��ϼ���.
	//���� N=8, M=6�̰� ������ ������ ���ٸ�
	//1 2 1 3 1 1 1 2
	//���� 6�� �Ǵ� ���Ӻκм����� {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}�� �� 3�����Դϴ�.
	
	//�Է�
	//ù° �ٿ� N(1��N��100,000), M(1��M��100,000,000)�� �־�����.
	//������ ���Ұ��� 1,000�� ���� �ʴ� �ڿ����̴�.
	
	//���
	//ù° �ٿ� ����� ���� ����Ѵ�.
	public int solution(int n, int m, int[] arr) {
		int answer = 0, sum = 0, lt = 0;
		
		for(int rt = 0; rt < n; rt++) {
			sum += arr[rt];
			if(sum == m) answer++;
			
			while(sum >= m) {
				sum -= arr[lt++];
				if(sum == m) answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex03_04_T T = new Ex03_04_T();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}
