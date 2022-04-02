package a_string;

import java.util.Scanner;

class Ex01_10 {
	//����
	//�� ���� ���ڿ� s�� ���� t�� �־����� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �ּҰŸ��� ����ϴ� ���α׷��� �ۼ��ϼ���.
	
	//�Է�
	//ù ��° �ٿ� ���ڿ� s�� ���� t�� �־�����. ���ڿ��� ���ڴ� �ҹ��ڷθ� �־����ϴ�.
	//���ڿ��� ���̴� 100�� ���� �ʴ´�.
	
	//���
	//ù ��° �ٿ� �� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �Ÿ��� ������� ����Ѵ�.
	public String solution(String str) {
		String answer = "";
		String s = str.split(" ")[0];
		char t = str.split(" ")[1].charAt(0);
		int[] sArr = new int[s.length()];
		
		int n = 1000;

		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == t) {
				n = 0;
				sArr[i] = n;
			} else sArr[i] = ++n;
		}
		
		n = 0;
		
		for(int i = s.length()-1; i >= 0; i--) {
			if(sArr[i] == 0) n = 0;
			else {
				++n;
				
				if(n < sArr[i]) {
					sArr[i] = n;
				}
			}
		}
		
		for(int i = 0; i < s.length(); i++) answer += sArr[i] + " ";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_10 T = new Ex01_10();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		
		System.out.println(T.solution(str));
	}
}
