package a_string;

import java.util.ArrayList;
import java.util.Scanner;

class Ex01_08 {
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
		String answer = "";
		char[] array = str.toUpperCase().toCharArray();
		ArrayList<Character> tmp = new ArrayList<>();
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] >= 'A' && array[i] <= 'Z') {
				tmp.add(array[i]);
			}
		}
		
		str = "";
		
		for(int i = 0; i < tmp.size(); i++) {
			str += tmp.get(i);
		}
		
		if(str.equals(new StringBuilder(str).reverse().toString())) answer = "YES";
		else answer = "NO";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_08 T = new Ex01_08();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		
		System.out.print(T.solution(str));
	}
}
