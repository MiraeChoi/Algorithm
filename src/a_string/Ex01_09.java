package a_string;

import java.util.Scanner;

class Ex01_09 {
	//����
	//���ڿ� ���ڰ� �����ִ� ���ڿ��� �־����� �� �� ���ڸ� �����Ͽ� �� ������� �ڿ����� ����ϴ�.
	//���� ��tge0a1h205er������ ���ڸ� �����ϸ� 0, 1, 2, 0, 5�̰� �̰��� �ڿ����� ����� 1205�� �˴ϴ�.
	//�����Ͽ� ��������� �ڿ����� 100,000,000�� ���� �ʽ��ϴ�.
	
	//�Է�
	//ù �ٿ� ���ڰ� ���� ���ڿ��� �־����ϴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
	
	//���
	//ù �ٿ� �ڿ����� ����մϴ�.
	public int solution(String str) {
		int answer = 0;
		answer = Integer.parseInt(str.replaceAll("[^0-9]", ""));
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_09 T = new Ex01_09();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.print(T.solution(str));
	}
}
