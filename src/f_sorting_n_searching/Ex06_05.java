package f_sorting_n_searching;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex06_05 {
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
		Queue<Integer> q = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			if(q.contains(arr[i])) return "D";
			else q.offer(arr[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex06_05 T = new Ex06_05();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, arr));
	}
}
