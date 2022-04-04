package f_sorting_n_searching;

import java.util.Arrays;
import java.util.Scanner;

class Ex06_06 {
	//����
	//�� �бⰡ ���۵Ǿ����ϴ�. ö���� �� ¦���� ���� �ʹ� ���� �����ϴ�.
	//ö���� �ݿ��� N���� �л����� �ֽ��ϴ�.
	//�������� �� �л��鿡�� �� ��ȣ�� ���� �ֱ� ���� ��忡 �� �л����� Ű�� ���� ���� �л����� �Ϸķ� Ű������ �������ϴ�.
	//���� �տ� ���� ���� �л����� �� ��ȣ�� 1������ N������ �ο��մϴ�. ö���� ¦�Ẹ�� Ű�� Ů�ϴ�.
	//�׷��� ö���� �� ��ȣ�� �ް� �;� ¦��� �ڸ��� �ٲ���ϴ�.
	//�������� �� ����� �𸣰� �л��鿡�� ���ִ� ������� ��ȣ�� �ο��߽��ϴ�.
	//ö���� ¦���� �ڸ��� �ٲ� �� �л����� �Ϸķ� ���ִ� Ű ������ �־��� �� ö���� ���� ��ȣ�� ö�� ¦���� ���� ��ȣ��
	//���ʷ� ����ϴ� ���α׷��� �ۼ��ϼ���.
	
	//�Է�
	//ù ��° �ٿ� �ڿ��� N(5<=N<=100)�� �־�����.
	//�� ��° �ٿ� ���� �տ����� �Ϸķ� ���ִ� �л����� Ű�� �־�����.
	//Ű(����) �� H�� (120<=H<=180)�� �ڿ����Դϴ�.
	
	//���
	//ù ��° �ٿ� ö���� �� ��ȣ�� ¦���� �� ��ȣ�� ���ʷ� ����մϴ�.
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[2];
		int[] sort = new int[n];
		for(int i = 0; i < n; i++) sort[i] = arr[i];
		Arrays.sort(sort);
		
		int idx = 0;
		
		for(int i = 0; i < n; i++) {
			if(arr[i] != sort[i]) {
				answer[idx] = i+1;
				idx++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex06_06 T = new Ex06_06();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}
}
