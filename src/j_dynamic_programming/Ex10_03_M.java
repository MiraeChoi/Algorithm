package j_dynamic_programming;

import java.util.Arrays;
import java.util.Scanner;

class Ex10_03_M {
	//����
	//N���� �ڿ����� �̷���� ������ �־����� ��, �� �߿��� ���� ��� �����ϴ�(���� ������ ū ����) ���ҵ��� ������ ã�� ���α׷��� �ۼ��϶�.
	//���� ���, ���Ұ� 2, 7, 5, 8, 6, 4, 7, 12, 3 �̸� ���� ��� �����ϵ��� ���ҵ��� ���ʴ�� �̾Ƴ��� 2, 5, 6, 7, 12�� �̾Ƴ���
	//���̰� 5�� �ִ� �κ� ���������� ���� �� �ִ�.
	
	//�Է�
	//ù° ���� �ԷµǴ� �������� �� N(3��N��1,000, �ڿ���)�� �ǹ��ϰ�,
	//��° ���� N���� �Էµ����͵��� �־�����.
	
	//���
	//ù ��° �ٿ� �κ����������� �ִ� ���̸� ����Ѵ�.
	static int[] arr, dy;
	
	public int solution(int n) {
		int answer = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = i-1; j >= 0; j--) {
				if(arr[i] > arr[j]) {
					if(dy[j] + 1 > dy[i]) dy[i] = dy[j] + 1;
				}
			}
			answer = Math.max(answer, dy[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex10_03_M T = new Ex10_03_M();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		arr = new int[n];
		dy = new int[n];
		Arrays.fill(dy, 1);
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n));
	}
}
 