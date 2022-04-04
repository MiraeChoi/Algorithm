package c_pointers_n_window;

import java.util.Scanner;

class Ex03_06 {
	//����
	//0�� 1�� ������ ���̰� N�� ������ �־����ϴ�. �������� �� �������� �ִ� k���� 0�� 1�� ������ �� �ֽ��ϴ�. �������� �ִ� k���� ������ ���� �� �������� 1�θ� ������ �ִ� ������ ���Ӻκм����� ã�� ���α׷��� �ۼ��ϼ���.
	//���� ���̰� ���̰� 14�� ������ ���� ������ �־����� k=2���
	//1 1 0 0 1 1 0 1 1 0 1 1 0 1
	//�������� ���� �� �ִ� 1�� ���ӵ� ���Ӻκм�����
	//1 1 0 0 [1 1 1 1 1 1 1 1]
	//�̸� �� ���̴� 8�Դϴ�.
	
	//�Է�
	//ù ��° �ٿ� ������ ������ �ڿ��� N(5<=N<100,000)�� �־����ϴ�.
	//�� ��° �ٿ� N������ 0�� 1�� ������ ������ �־����ϴ�.
	
	//���
	//ù �ٿ� �ִ� ���̸� ����ϼ���.
	public int solution(int n, int k, int[] arr) {
		int answer = 0;
		int m = 0;
		int[] zero = new int[n];
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == 0) {
				zero[m] = i;
				m++;
			}
		}
		
		for(int i = 0; i < m-(k-1); i++) {
			int count = 0;
			
			for(int j = 0; j < k; j++) {
				arr[zero[i+j]]++;
			}
			
			for(int j = 0; j < n; j++) {
				if(arr[j] == 1) count++;
				else if(arr[j] != 1) {
					if(count > answer) {
						answer = count;
					}
					count = 0;
				}
			}
			
			for(int j = 0; j < k; j++) {
				arr[zero[i+j]]--;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex03_06 T = new Ex03_06();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, k, arr));
	}
}
