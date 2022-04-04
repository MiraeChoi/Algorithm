package c_pointers_n_window;

import java.util.Scanner;

class Ex03_05_Review {
	//����
	//N�Է����� ���� ���� N�� �ԷµǸ� 2�� �̻��� ���ӵ� �ڿ����� ������ ���� N�� ǥ���ϴ� ����� �������� ����ϴ� ���α׷��� �ۼ��ϼ���.
	//���� N=15�̸�
	//7+8=15
	//4+5+6=15
	//1+2+3+4+5=15
	//�� ���� �� 3������ ��찡 �����Ѵ�.
	
	//�Է�
	//ù ��° �ٿ� ���� ���� N(7<=N<1000)�� �־����ϴ�.
	
	//���
	//ù �ٿ� �� ������ ����մϴ�.
	public int solution(int n) {
		int answer = 0;
		int sum = 0, lt = 0;
		int m = n / 2 + 1;
		int[] arr = new int[m];
		
		for(int i = 0; i < arr.length; i++) arr[i] = i+1;
		for(int rt = 0; rt < m; rt++) {
			sum += arr[rt];
			
			if(sum == n) answer++;
			while(sum >= n) {
				sum -= arr[lt++];
				if(sum == n) answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex03_05_Review T = new Ex03_05_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
}
