package f_sorting_n_searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Ex06_06_T {
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
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		int[] tmp = arr.clone();
		Arrays.sort(tmp);
		
		for(int i = 0; i < n; i++) if(arr[i] != tmp[i]) answer.add(i+1);
		return answer;
	}
	
	public static void main(String[] args) {
		Ex06_06_T T = new Ex06_06_T();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}
}
