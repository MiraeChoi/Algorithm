package a_string;

import java.util.Scanner;

class Ex01_04_Review {
	//����
	//N���� �ܾ �־����� �� �ܾ ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
	
	//�Է�
	//ù �ٿ� �ڿ��� N(3<=N<=20)�� �־����ϴ�.
	//�� ��° �ٺ��� N���� �ܾ �� �ٿ� �ϳ��� �־����ϴ�. �ܾ�� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
	
	//���
	//N���� �ܾ �Էµ� ������� �� �ٿ� �ϳ��� ����� ����մϴ�.
	public String solution(String str) {
		String answer = "";
		
		for(int i = 0; i < str.length(); i++) {
//			answer = new StringBuilder(str).reverse().toString();
			
			char[] s = str.toCharArray();
			int lt = 0;
			int rt = str.length() - 1;
			
			while(lt < rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				
				lt++; rt--;
			}
			
			answer += s[i];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_04_Review T = new Ex01_04_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		
		for(int i = 0; i < n; i++) {
			str[i] = kb.next();
		}
		
		for(String x : str) {
			System.out.println(T.solution(x));
		}
	}
}

