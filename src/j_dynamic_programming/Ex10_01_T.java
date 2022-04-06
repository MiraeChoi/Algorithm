package j_dynamic_programming;

import java.util.Scanner;

class Ex10_01_T {
	//����
	//ö���� ����� ���� �� �� ���� �� ��� �Ǵ� �� ��ܾ� �ö󰣴�. ���� �� 4����� �����ٸ� �� ����� ����
	//1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2 �� 5�����̴�.
	//�׷��ٸ� �� N����� �� ö���� �ö� �� �ִ� ����� ���� �� �����ΰ�?
	//(�׸� 1)
	
	//�Է�
	//ù° ���� ����� ������ �ڿ��� N(3��N��35)�� �־����ϴ�.
	
	//���
	//ù ��° �ٿ� �ö󰡴� ����� ���� ����մϴ�.
	static int[] dy;
	
	public int solution(int n) {
		dy[1] = 1;
		dy[2] = 2;
		for(int i = 3; i <= n; i++) dy[i] = dy[i-2] + dy[i-1];
		return dy[n];
	}
	
	public static void main(String[] args) {
		Ex10_01_T T = new Ex10_01_T();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		dy = new int[n+1];
		System.out.println(T.solution(n));
	}
}
