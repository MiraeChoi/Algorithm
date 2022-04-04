package b_array;

import java.util.Scanner;

class Ex02_05_Review {
	//����
	//�ڿ��� N�� �ԷµǸ� 1���� N������ �Ҽ��� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
	//���� 20�� �ԷµǸ� 1���� 20������ �Ҽ��� 2, 3, 5, 7, 11, 13, 17, 19�� �� 8���Դϴ�.
	
	//�Է�
	//ù �ٿ� �ڿ����� ���� N(2<=N<=200,000)�� �־����ϴ�.
	
	//���
	//ù �ٿ� �Ҽ��� ������ ����մϴ�.
	public int solution(int n) {
		int answer = 0;
		int[] arr = new int[n+1];
		
		for(int i = 2; i <= n; i++) {
			if(arr[i] == 0) {
				answer++;
				
				for(int j = i; j <= n; j=j+i) arr[j] = 1;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_05_Review T = new Ex02_05_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.print(T.solution(n));
	}
}
