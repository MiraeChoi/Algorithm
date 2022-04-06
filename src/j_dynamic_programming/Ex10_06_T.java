package j_dynamic_programming;

import java.util.Scanner;

class Ex10_06_T {
	//����
	//�̹� �����ø��ǾƵ��ȸ���� ���� ������ ���� ���Ͽ� ������ �������� �ֽ� N���� ������ Ǯ���� �մϴ�.
	//�� ������ �װ��� Ǯ���� �� ��� ������ Ǫ�µ� �ɸ��� �ð��� �־����� �˴ϴ�.
	//���� �ð� M�ȿ� N���� ���� �� �ִ� ������ ���� �� �ֵ��� �ؾ� �մϴ�.
	//(�ش� ������ �ش� �ð��� �ɸ��� Ǫ�� �ɷ� �����Ѵ�, �� ������ �� ���� Ǯ �� �ֽ��ϴ�.)
	
	//�Է�
	//ù ��° �ٿ� ������ ���� N(1<=N<=50)�� ���� �ð� M(10<=M<=300)�� �־����ϴ�.
	//�� ��° �ٺ��� N�ٿ� ���� ������ Ǯ���� ���� ������ Ǫ�� �� �ɸ��� �ð��� �־����ϴ�.
	
	//���
	//ù ��° �ٿ� ���� �ð��ȿ� ���� �� �ִ� �ִ� ������ ����մϴ�.
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] dy = new int[m+1];
		for(int i = 0; i < n; i++) {
			int ps = kb.nextInt();
			int pt = kb.nextInt();
			for(int j = m; j >= pt; j--) {
				dy[j] = Math.max(dy[j], dy[j-pt] + ps);
			}
		}
		System.out.println(dy[m]);
	}
}
