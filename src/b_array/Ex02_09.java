package b_array;

import java.util.ArrayList;
import java.util.Scanner;

class Ex02_09 {
	//����
	//5*5 �����ǿ� �Ʒ��� ���� ���ڰ� ���� �ֽ��ϴ�.
	//(�׸� 1)
	//N*N�� �������� �־����� �� ���� ��, �� ���� ��, �� �밢���� �� �� �� �� ū ���� ����մϴ�.
	
	//�Է�
	//ù �ٿ� �ڿ��� N�� �־�����.(2<=N<=50)
	//�� ��° �ٺ��� N�ٿ� ���� �� �ٿ� N���� �ڿ����� �־�����. �� �ڿ����� 100�� ���� �ʴ´�.
	
	//���
	//�ִ����� ����մϴ�.
	public int solution(int n, int[][] arr) {
		int answer = 0;
		ArrayList<Integer> tmp = new ArrayList<>();
		
		int hl = 0; //����
		int vl = 0; //����
		int dl = 0; //�밢��
		int dl2 = 0; //���밢��
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j) {
					dl += arr[i][j];
				}
				if(i+j == n-1) {
					dl2 += arr[i][j];
				}
				
				hl += arr[i][j];
				vl += arr[j][i];
			}
			
			if(hl > 0) tmp.add(hl);
			if(vl > 0) tmp.add(vl);
			hl = 0;
			vl = 0;
		}
		
		if(dl > 0) tmp.add(dl);
		if(dl2 > 0) tmp.add(dl2);
		
		answer = tmp.get(0);
		
		for(int i = 0; i < tmp.size(); i++) {
			if(tmp.get(i) > answer) answer = tmp.get(i);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_09 T = new Ex02_09();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		
		System.out.print(T.solution(n, arr));
	}
}
