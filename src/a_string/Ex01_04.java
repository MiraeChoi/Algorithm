package a_string;

import java.util.Scanner;

class Ex01_04 {
	//����
	//N���� �ܾ �־����� �� �ܾ ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
	
	//�Է�
	//ù �ٿ� �ڿ��� N(3<=N<=20)�� �־����ϴ�.
	//�� ��° �ٺ��� N���� �ܾ �� �ٿ� �ϳ��� �־����ϴ�. �ܾ�� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
	
	//���
	//N���� �ܾ �Էµ� ������� �� �ٿ� �ϳ��� ����� ����մϴ�.
	public String solution(String str) {
		String answer = "";
		
		for(int i = str.length() - 1; i >= 0; i--) {
			answer += str.charAt(i);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_04 T = new Ex01_04();
		Scanner kb = new Scanner(System.in);
		int count = kb.nextInt();
		String[] array = new String[count];
		
		for(int i = 0; i < count; i++) {
			String str = kb.next();
			array[i] = str;
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(T.solution(array[i]));
		}
	}
	
}
