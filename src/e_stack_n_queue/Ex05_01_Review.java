package e_stack_n_queue;

import java.util.Scanner;
import java.util.Stack;

class Ex05_01_Review {
	//����
	//��ȣ�� �ԷµǸ� �ùٸ� ��ȣ�̸� ��YES", �ùٸ��� ������ ��NO"�� ����մϴ�.
	//(())() �̰��� ��ȣ�� ���� �ùٸ��� ��ġ�ϴ� ������, (()()))�� �ùٸ� ��ȣ�� �ƴϴ�.
	
	//�Է�
	//ù ��° �ٿ� ��ȣ ���ڿ��� �Էµ˴ϴ�. ���ڿ��� �ִ� ���̴� 30�̴�.
	
	//���
	//ù ��° �ٿ� YES, NO�� ����Ѵ�.
	public String solution(String str) {
		String answer = "NO";
		Stack<Character> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(x == '(') stack.push(x);
			else {
				if(stack.isEmpty()) return answer;
				stack.pop();
			}
		}
		
		if(!stack.isEmpty()) return answer;
		
		answer = "YES";
		return answer;
	}
	
	public static void main(String[] args) {
		Ex05_01_Review T = new Ex05_01_Review();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
