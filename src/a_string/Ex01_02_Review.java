package a_string;

import java.util.Scanner;

class Ex01_02_Review {
	//����
	//�빮�ڿ� �ҹ��ڰ� ���� �����ϴ� ���ڿ��� �Է¹޾� �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
	
	//�Է�
	//ù �ٿ� ���ڿ��� �Էµȴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
	//���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
	
	//���
	//ù �ٿ� �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� ��ȯ�� ���ڿ��� ����մϴ�.
	public String solution(String str) {
		String answer = "";
		
		for(char x : str.toCharArray()) {
			if(Character.isUpperCase(x)) answer += Character.toLowerCase(x);
			else answer += Character.toUpperCase(x);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_02_Review T = new Ex01_02_Review();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.print(T.solution(str));
	}
}
