package j_dynamic_programming;

import java.util.Scanner;

class Ex10_02_Review {
	//����
	//ö���� �б��� ���µ� ������ �������ϴ�. ������ N���� ���� �ٸ��� ����� ���ҽ��ϴ�.
	//ö���� �� �ٸ��� �ǳ� �� �� ���� �� ĭ �Ǵ� �� ĭ�� �ǳʶٸ鼭 ���ٸ��� �ǳ� �� �ֽ��ϴ�.
	//ö���� ������ �ǳʴ� ����� �� �����ϱ��?
	//(�׸� 1)
	
	//�Է�
	//ù° ���� ���� ������ �ڿ��� N(3��N��35)�� �־����ϴ�.
	
	//���
	//ù ��° �ٿ� ������ �ǳʴ� ����� ���� ����մϴ�.
	static int[] dy;
	
	public int solution(int n) {
		dy[0] = 1;
		dy[1] = 2;
		for(int i = 2; i <= n; i++) dy[i] = dy[i-2] + dy[i-1];
		return dy[n];
	}
	
	public static void main(String[] args) {
		Ex10_02_Review T = new Ex10_02_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		dy = new int[n+1];
		System.out.println(T.solution(n));
	}
}
