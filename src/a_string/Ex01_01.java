package a_string;

import java.util.Scanner;

class Ex01_01 {
	//����
	//�� ���� ���ڿ��� �Է¹ް�, Ư�� ���ڸ� �Է¹޾� �ش� Ư�����ڰ� �Է¹��� ���ڿ��� �� �� �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
	//��ҹ��ڸ� �������� �ʽ��ϴ�.���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
	
	//�Է�
	//ù �ٿ� ���ڿ��� �־�����, �� ��° �ٿ� ���ڰ� �־�����.
	//���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
	
	//���
	//ù �ٿ� �ش� ������ ������ ����Ѵ�.
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		
//		for(int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == t) answer++;
//		}
		for(char x : str.toCharArray()) {
			if(x == t) answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_01 T = new Ex01_01();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		
		System.out.print(T.solution(str, c));
	}
}

