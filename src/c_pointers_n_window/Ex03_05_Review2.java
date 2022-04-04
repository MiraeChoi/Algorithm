package c_pointers_n_window;

import java.util.Scanner;

class Ex03_05_Review2 {
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
		int cnt = 1;
		n--;
		
		while(n > 0) {
			cnt++;
			n = n - cnt;
			
			if(n % cnt == 0) answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex03_05_Review2 T = new Ex03_05_Review2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
}
