package f_sorting_n_searching;

import java.util.Arrays;
import java.util.Scanner;

class Ex06_10_M {
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
		Arrays.sort(arr);
		int answer = 0;
		int lt = arr[0], rt = arr[n-1];
		
		while(lt <= rt) {
			int mid = (lt + rt) / 2;
			System.out.println("lt : " + lt + " / rt : " + rt);
			System.out.println("mid : " + mid);
			int ep = arr[0];
			int count = 1;
			
			for(int i = 1; i < n; i++) {
				if(arr[i] - ep >= mid) {
					System.out.println("arr : " + arr[i]);
					ep = arr[i];
					count++;
				}
			}
			System.out.println("cnt : " + count);
			
			if(count >= c) {
				answer = mid;
				lt = mid + 1;
			} else rt = mid - 1;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex06_10_M T = new Ex06_10_M();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int c = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, c, arr));
	}
}
