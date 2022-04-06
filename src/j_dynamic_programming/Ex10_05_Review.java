package j_dynamic_programming;

import java.util.Arrays;
import java.util.Scanner;

class Ex10_05_Review {
	//����
	//������ ���� ���� ������ �������� �־��� ������ �Ž������� ���� ���� ���� �������� ��ȯ�� �ַ��� ��� �ָ� �Ǵ°�?
	//�� ������ ������ ������ �� �� �ִ�.
	
	//�Է�
	//ù ��° �ٿ��� ������ �������� N(1<=N<=50)�� �־�����.
	//�� ��° �ٿ��� N���� ������ ������ �־�����, �� �����ٿ� �Ž��� �� �ݾ� M(1<=M<=500)�� �־�����.
	//�� ������ ������ 100���� ���� �ʴ´�.
	
	//���
	//ù ��° �ٿ� �Ž��� �� ������ �ּҰ����� ����Ѵ�.
	static int[] dy;
	
	public int solution(int n, int m, int[] coin) {
		dy[0] = 0;
		for(int i = 0; i < n; i++) {						 //i = 0																i = 1
			for(int j = coin[i]; j <= m; j++) {				 //j = coin[0] = 1					j = 2	...15						j = coin[1] = 2
				dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);//dy[1] = dy[1-1]+1 = 1 or Max = 1	dy[2] = dy[2-1]+1 = 2 or Max = 2	dy[2] = dy[2-2]+1 = 1 or 2 = 1
			}
			System.out.println("dy[m] : " + dy[m]);
		}
		return dy[m];		//i = 2, j = 15 >	dy[15] = dy[15-coin[2]] + 1 = dy[10] + 1 = 2 + 1 = 3 or 8 = 3
	}
	
	public static void main(String[] args) {
		Ex10_05_Review T = new Ex10_05_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] coin = new int[n];
		for(int i = 0; i < n; i++) coin[i] = kb.nextInt();
		int m = kb.nextInt();
		dy = new int[m+1];
		Arrays.fill(dy, Integer.MAX_VALUE);
		System.out.println(T.solution(n, m, coin));
		for(int i = 1; i < dy.length; i++) System.out.print(dy[i] + " ");
	}
}
