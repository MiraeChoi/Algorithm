package b_array;

import java.util.Scanner;

class Ex02_09_Review {
	//����
	//5*5 �����ǿ� �Ʒ��� ���� ���ڰ� ���� �ֽ��ϴ�.
	//(�׸� 1)
	//N*N�� �������� �־����� �� ���� ��, �� ���� ��, �� �밢���� �� �� �� �� ū ���� ����մϴ�.
	
	//�Է�
	//ù �ٿ� �ڿ��� N�� �־�����.(2<=N<=50)
	//�� ��° �ٺ��� N�ٿ� ���� �� �ٿ� N���� �ڿ����� �־�����. �� �ڿ����� 100�� ���� �ʴ´�.
	
	//���
	//�ִ����� ����մϴ�.
	public int solution(int n, int[][] arr) {
		int answer = 0;
		int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;
		
		for(int i = 0; i < n; i++) {
			sum1 = 0; sum2 = 0;
			
			sum3 += arr[i][i];
			sum4 += arr[i][n-i-1];
			
			for(int j = 0; j < n; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			
			if(sum1 > answer) answer = sum1;
			if(sum2 > answer) answer = sum2;
		}
		
		if(sum3 > answer) answer = sum3;
		if(sum4 > answer) answer = sum4;
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_09_Review T = new Ex02_09_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}
}
