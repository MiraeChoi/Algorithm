package j_dynamic_programming;

import java.util.Scanner;

class Ex10_01 {
	//����
	//ö���� ����� ���� �� �� ���� �� ��� �Ǵ� �� ��ܾ� �ö󰣴�. ���� �� 4����� �����ٸ� �� ����� ����
	//1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2 �� 5�����̴�.
	//�׷��ٸ� �� N����� �� ö���� �ö� �� �ִ� ����� ���� �� �����ΰ�?
	//(�׸� 1)
	
	//�Է�
	//ù° ���� ����� ������ �ڿ��� N(3��N��35)�� �־����ϴ�.
	
	//���
	//ù ��° �ٿ� �ö󰡴� ����� ���� ����մϴ�.
	static int n, answer = 0;
	
	public void DFS(int sum) {
		if(sum == n) {
			System.out.println("answer : " + answer);
			answer++;
		}
		else {
			if(sum + 1 <= n) {
				sum += 1;
				System.out.println("��sum : " + sum);
				DFS(sum);
				sum -= 1;
			}
			if(sum + 2 <= n) {
				sum += 2;
				System.out.println("��sum : " + sum);
				DFS(sum);
				sum -= 2;
			}
		}
	}
	
	public static void main(String[] args) {
		Ex10_01 T = new Ex10_01();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		T.DFS(0);
		System.out.println(answer);
	}
}
