package j_dynamic_programming;

import java.util.Scanner;

class Ex10_03_T {
	//����
	//N���� �ڿ����� �̷���� ������ �־����� ��, �� �߿��� ���� ��� �����ϴ�(���� ������ ū ����) ���ҵ��� ������ ã�� ���α׷��� �ۼ��϶�.
	//���� ���, ���Ұ� 2, 7, 5, 8, 6, 4, 7, 12, 3 �̸� ���� ��� �����ϵ��� ���ҵ��� ���ʴ�� �̾Ƴ��� 2, 5, 6, 7, 12�� �̾Ƴ���
	//���̰� 5�� �ִ� �κ� ���������� ���� �� �ִ�.
	
	//�Է�
	//ù° ���� �ԷµǴ� �������� �� N(3��N��1,000, �ڿ���)�� �ǹ��ϰ�,
	//��° ���� N���� �Էµ����͵��� �־�����.
	
	//���
	//ù ��° �ٿ� �κ����������� �ִ� ���̸� ����Ѵ�.
	static int[] dy;
	
	public int solution(int[] arr) {
		int answer = 0;
		dy = new int[arr.length];
		dy[0] = 1;
		
		for(int i = 1; i < arr.length; i++) {
			int max = 0;
			
			for(int j = i-1; j > 0; j--) {
				if(arr[j] < arr[i] && dy[j] > max) max = dy[j];
			}
			dy[i] = max + 1;
			answer = Math.max(answer, dy[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex10_03_T T = new Ex10_03_T();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(arr));
	}
}
