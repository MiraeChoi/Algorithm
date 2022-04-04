package c_pointers_n_window;

import java.util.Scanner;

class Ex03_03_T {
	//����
	//������ �ƺ��� �������� ��մϴ�. ���� �ƺ��� �������� N�� ������ �������� �ְ� ���ӵ� K�� ������ �ִ� ������� ������ ���϶�� �߽��ϴ�.
	//���� N=10�̰� 10�� ���� �������� �Ʒ��� �����ϴ�. �̶� K=3�̸�
	//12 15 11 20 25 10 20 19 13 15
	//���ӵ� 3�ϰ��� �ִ� ������� 11+20+25=56�����Դϴ�.
	//�������� ������ �����ּ���.
	
	//�Է�
	//ù �ٿ� N(5<=N<=100,000)�� K(2<=K<=N)�� �־����ϴ�.
	//�� ��° �ٿ� N���� ���ڿ��� �־����ϴ�. �� ���ڴ� 500������ ���� �ƴ� �����Դϴ�.
	
	//���
	//ù �ٿ� �ִ� ������� ����մϴ�.
	public int solution(int n, int k, int[] arr) {
		int answer = 0;
		int sum = 0;
		
		for(int i = 0; i < k; i++) sum += arr[i];
		answer = sum;
		
		for(int i = k; i < arr.length; i++) {
			sum += (arr[i] - arr[i-k]);
			answer = Math.max(answer, sum);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex03_03_T T = new Ex03_03_T();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(T.solution(n, k, arr));
	}
}
