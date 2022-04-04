package f_sorting_n_searching;

import java.util.Arrays;
import java.util.Scanner;

class Ex06_01 {
	//����
	//N���� ���ڰ� �ԷµǸ� ������������ �����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
	//�����ϴ� ����� ���������Դϴ�.
	
	//�Է�
	//ù ��° �ٿ� �ڿ��� N(1<=N<=100)�� �־����ϴ�.
	//�� ��° �ٿ� N���� �ڿ����� ������ ���̿� �ΰ� �Էµ˴ϴ�. �� �ڿ����� ������ ���� �ȿ� �ֽ��ϴ�.
	
	//���
	//������������ ���ĵ� ������ ����մϴ�.
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		for(int i = 0; i < arr.length; i++) answer[i] = arr[i];
		Arrays.sort(answer);
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex06_01 T = new Ex06_01();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}
}
