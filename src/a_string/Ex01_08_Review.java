package a_string;

import java.util.Scanner;

class Ex01_08_Review {
	//����
	//�տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� �Ӹ�����̶�� �մϴ�.
	//���ڿ��� �ԷµǸ� �ش� ���ڿ��� �Ӹ�����̸� "YES", �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
	//�� ȸ���� �˻��� �� ���ĺ��� ������ ȸ���� �˻��ϸ�, ��ҹ��ڸ� �������� �ʽ��ϴ�.
	//���ĺ� �̿��� ���ڵ��� �����մϴ�.
	
	//�Է�
	//ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.
	
	//���
	//ù ��° �ٿ� �Ӹ���������� ����� YES �Ǵ� NO�� ����մϴ�.
	public String solution(String str) {
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String rev = new StringBuilder(str).reverse().toString();
		
		if(str.equals(rev)) return "YES";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_08_Review T = new Ex01_08_Review();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		
		System.out.print(T.solution(str));
	}
}
