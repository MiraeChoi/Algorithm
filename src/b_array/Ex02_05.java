package b_array;

import java.util.Scanner;

class Ex02_05 {
	//����
	//�ڿ��� N�� �ԷµǸ� 1���� N������ �Ҽ��� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
	//���� 20�� �ԷµǸ� 1���� 20������ �Ҽ��� 2, 3, 5, 7, 11, 13, 17, 19�� �� 8���Դϴ�.
	
	//�Է�
	//ù �ٿ� �ڿ����� ���� N(2<=N<=200,000)�� �־����ϴ�.
	
	//���
	//ù �ٿ� �Ҽ��� ������ ����մϴ�.
	public int solution(int n) {
		int answer = 0;
		int[] arr = new int[n];
		int count = 0;
		arr[0] = 1;
		
		for(int i = 2; i <= n; i++) {
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					arr[i-1]++;
					break;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) count++;
		}
		
		answer = count;
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_05 T = new Ex02_05();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.print(T.solution(n));
	}
}
