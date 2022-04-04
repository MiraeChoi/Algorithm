package f_sorting_n_searching;

import java.util.Arrays;
import java.util.Scanner;

class Ex06_05_T {
	//����
	//������ �ݿ��� N���� �л����� �ֽ��ϴ�.
	//�������� �� �л��鿡�� 1���� 10,000,000������ �ڿ��� �߿��� ���ڰ� �����ϴ� ���� �ϳ� ���� ����� �߽��ϴ�.
	//���� N���� �л����� ��� ���� �� �ߺ��� ���ڰ� �����ϸ� D(duplication)�� ����ϰ�,
	//N���� ��� ���� �ٸ� ���ڸ� ����´ٸ� U(unique)�� ����ϴ� ���α׷��� �ۼ��ϼ���.
	
	//�Է�
	//ù ��° �ٿ� �ڿ��� N(5<=N<=100,000)�� �־�����.
	//�� ��° �ٿ� �л����� ���� �� N���� �ڿ����� �Էµȴ�.
	
	//���
	//ù ��° �ٿ� D �Ǵ� U�� ����Ѵ�.
	public String solution(int n, int[] arr) {
		String answer = "U";
		Arrays.sort(arr);
		
		for(int i = 0; i < n-1; i++) if(arr[i] == arr[i+1]) return "D";
		return answer;
	}
	
	public static void main(String[] args) {
		Ex06_05_T T = new Ex06_05_T();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, arr));
	}
}
