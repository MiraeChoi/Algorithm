package a_string;

import java.util.Scanner;

class Ex01_07 {
	//����
	//�տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� ȸ�� ���ڿ��̶�� �մϴ�.
	//���ڿ��� �ԷµǸ� �ش� ���ڿ��� ȸ�� ���ڿ��̸� "YES", ȸ�� ���ڿ��� �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
	//�� ȸ���� �˻��� �� ��ҹ��ڸ� �������� �ʽ��ϴ�.
	
	//�Է�
	//ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.
	
	//���
	//ù ��° �ٿ� ȸ�� ���ڿ������� ����� YES �Ǵ� NO�� ����մϴ�.
	public String solution(String str) {
		String answer = "";
		char[] array = str.toUpperCase().toCharArray();
		int lt = 0, rt = array.length - 1;
		
		for(int i = 0; i < array.length; i++) {
			while(lt < rt) {
				char tmp = array[lt];
				array[lt] = array[rt];
				array[rt] = tmp;
				
				lt++; rt--;
			}
		}
		
		if(str.equalsIgnoreCase(String.valueOf(array))) answer = "YES";
		else answer = "NO";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_07 T = new Ex01_07();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.println(T.solution(str));
	}
}
