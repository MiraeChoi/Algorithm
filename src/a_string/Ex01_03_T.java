package a_string;

import java.util.Scanner;

public class Ex01_03_T {
	//����
	//�� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���.
	//���� ���� �� �ܾ�� �������� ���е˴ϴ�.
	
	//�Է�
	//ù �ٿ� ���̰� 100�� ���� �ʴ� �� ���� ������ �־����ϴ�. ������ ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
	
	//���
	//ù �ٿ� ���� �� �ܾ ����Ѵ�. ���� ���̰� �� �ܾ �������� ��� ����ӿ��� ���� ���ʿ� ��ġ�� �ܾ ������ �մϴ�.
	public String solution(String str) {
		//1��
		String answer = "";
		int m = Integer.MIN_VALUE;
		String[] s = str.split(" ");
		
		for(String x : s) {
			int len = x.length();
			
			if(len > m) {
				m = len;
				answer = x;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_03_T T = new Ex01_03_T();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		
		System.out.print(T.solution(str));
	}
}
