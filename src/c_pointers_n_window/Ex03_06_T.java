package c_pointers_n_window;

import java.util.Scanner;

class Ex03_06_T {
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
		int answer = 0, cnt = 0, lt = 0;
		
		for(int rt = 0; rt < n; rt++) {
			if(arr[rt] == 0) cnt++;
			
			while(cnt > k) {
				if(arr[lt] == 0) cnt--;
				lt++;
			}
			answer = Math.max(answer, rt-lt+1);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex03_06_T T = new Ex03_06_T();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, k, arr));
	}
}
