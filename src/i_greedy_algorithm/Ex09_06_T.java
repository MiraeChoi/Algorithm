package i_greedy_algorithm;

import java.util.Scanner;

class Ex09_06_T {
	//����
	//������ �� �б� ���ο� �ݿ��� ó�� �����ϴ� ���̴�. ������ �� �л��� N���̴�. ������ �� �л����� ģ�����踦 �˰� �ʹ�.
	//��� �л��� 1���� N���� ��ȣ�� �ο��Ǿ� �ְ�, �������Դ� ���� �� ���� �л��� ģ�� ���谡 ��ȣ�� ǥ���� ���ڽ��� �־�����.
	//���� (1, 2), (2, 3), (3, 4)�� ���ڽ��� �־����� 1�� �л��� 2�� �л��� ģ���̰�, 2�� �л��� 3�� �л��� ģ��, 3�� �л��� 4�� �л��� ģ���̴�.
	//�׸��� 1�� �л��� 4�� �л��� 2���� 3���� ���ؼ� ģ�����谡 �ȴ�.
	//�л��� ģ�����踦 ��Ÿ���� ���ڽ��� �־����� Ư�� �� ���� ģ�������� �Ǻ��ϴ� ���α׷��� �ۼ��ϼ���.
	//�� �л��� ģ���̸� "YES"�̰�, �ƴϸ� "NO"�� ����Ѵ�.

	//�Է�
	//ù ��° �ٿ� �� �л����� �ڿ��� N(1<=N<=1,000)�� ���ڽ��� ������ M(1<=M<=3,000)�� �־�����,
	//���� M���� �ٿ� ���� ���ڽ��� �־�����.
	//������ �ٿ��� �� �л��� ģ������ Ȯ���ϴ� ���ڽ��� �־�����.

	//���
	//ù ��° �ٿ� "YES" �Ǵ� "NO"�� ����Ѵ�.
	static int[] unf;
	
	public static int Find(int v) {
		if(v == unf[v]) return v;
		else return unf[v] = Find(unf[v]);
	}
	
	public static void Union(int a, int b) {
		int fa = Find(a);
		int fb = Find(b);
		if(fa != fb) unf[fa] = fb;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		unf = new int[n+1];
		for(int i = 1; i <= n; i++) unf[i] = i;
		for(int i = 1; i <= m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			Union(a, b);
		}
		int a = kb.nextInt();
		int b = kb.nextInt();
		int fa = Find(a);
		int fb = Find(b);
		if(fa == fb) System.out.println("YES");
		else System.out.println("NO");
	}
}
