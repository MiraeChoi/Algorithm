package a_string;

import java.util.Scanner;

class Ex01_09_Review {
	//����
	//���ڿ� ���ڰ� �����ִ� ���ڿ��� �־����� �� �� ���ڸ� �����Ͽ� �� ������� �ڿ����� ����ϴ�.
	//���� ��tge0a1h205er������ ���ڸ� �����ϸ� 0, 1, 2, 0, 5�̰� �̰��� �ڿ����� ����� 1205�� �˴ϴ�.
	//�����Ͽ� ��������� �ڿ����� 100,000,000�� ���� �ʽ��ϴ�.
	
	//�Է�
	//ù �ٿ� ���ڰ� ���� ���ڿ��� �־����ϴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
	
	//���
	//ù �ٿ� �ڿ����� ����մϴ�.
	public int solution(String str) {
//		int answer = 0;
//		String answer = "";
//		
//		for(char x : str.toCharArray()) {
//			if(x >= '0' && x <= '9') answer = answer * 10 + (x - 48);
//			if(Character.isDigit(x)) answer += x;
//		}
//		
//		return Integer.parseInt(answer);
		
		return Integer.parseInt(str.replaceAll("[^0-9]", ""));
	}
	
	public static void main(String[] args) {
		Ex01_09_Review T = new Ex01_09_Review();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.print(T.solution(str));
	}
}

