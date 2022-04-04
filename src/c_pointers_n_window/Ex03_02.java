package c_pointers_n_window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Ex03_02 {
	//����
	//A, B �� ���� ������ �־����� �� ������ ���� ���Ҹ� �����Ͽ� ������������ ����ϴ� ���α׷��� �ۼ��ϼ���.
	
	//�Է�
	//ù ��° �ٿ� ���� A�� ũ�� N(1<=N<=30,000)�� �־����ϴ�.
	//�� ��° �ٿ� N���� ���Ұ� �־����ϴ�. ���Ұ� �ߺ��Ǿ� �־����� �ʽ��ϴ�.
	//�� ��° �ٿ� ���� B�� ũ�� M(1<=M<=30,000)�� �־����ϴ�.
	//�� ��° �ٿ� M���� ���Ұ� �־����ϴ�. ���Ұ� �ߺ��Ǿ� �־����� �ʽ��ϴ�.
	//�� ������ ���Ҵ� 1,000,000,000������ �ڿ����Դϴ�.
	
	//���
	//�� ������ ������Ҹ� �������� �����Ͽ� ����մϴ�.
	public int[] solution(int n, int[] a, int m, int[] b) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(a[i] == b[j]) {
					arr.add(a[i]);
					break;
				}
			}
		}
		
		int[] answer = new int[arr.size()];
		
		for(int i = 0; i < arr.size(); i++) {
			answer[i] = arr.get(i);
		}
		
		Arrays.sort(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		Ex03_02 T = new Ex03_02();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = kb.nextInt();
		
		int m = kb.nextInt();
		int[] b = new int[m];
		for(int i = 0; i < m; i++) b[i] = kb.nextInt();
		
		for(int x : T.solution(n, a, m, b)) System.out.print(x + " ");
	}
}

