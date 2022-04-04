package f_sorting_n_searching;

import java.util.Arrays;
import java.util.Scanner;

class Ex06_10 {
	//����
	//N���� �������� �������� �ֽ��ϴ�. �� �������� x1, x2, x3, ......, xN�� ��ǥ�� ������, ���������� ��ǥ�� �ߺ��Ǵ� ���� �����ϴ�.
	//������ C������ ���� ������ �ִµ�, �� ������ ���� ������ �ִ� ���� �������� �ʽ��ϴ�. �� ���������� �� ������ ���� ���� �� �ְ�,
	//���� ����� �� ���� �Ÿ��� �ִ밡 �ǰ� ���� �������� ��ġ�ϰ� �ͽ��ϴ�.
	//C������ ���� N���� �������� ��ġ���� �� ���� ����� �� ���� �Ÿ��� �ִ밡 �Ǵ� �� �ִ밪�� ����ϴ� ���α׷��� �ۼ��ϼ���.
	
	//�Է�
	//ù �ٿ� �ڿ��� N(3<=N<=200,000)�� C(2<=C<=N)�� ������ ���̿� �ΰ� �־����ϴ�.
	//��° �ٿ� �������� ��ǥ xi(0<=xi<=1,000,000,000)�� ���ʷ� �־����ϴ�.
	
	//���
	//ù �ٿ� ���� ����� �� ���� �ִ� �Ÿ��� ����ϼ���.
	public int solution(int n, int c, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int[] horse = new int[c];
		horse[0] = arr[0];
		horse[c-1] = arr[n-1];
		if(c == 2) return horse[c-1]-horse[0];
		
		int lt = 0, rt = arr[n-1], mid = n/2;
		for(int i = 1; i < n-1; i++) {
			if(arr[i]-arr[i-1] > arr[i+1]-arr[i]) {
				answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex06_10 T = new Ex06_10();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int c = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, c, arr));
	}
}
