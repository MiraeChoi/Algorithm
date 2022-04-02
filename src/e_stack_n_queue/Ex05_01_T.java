package e_stack_n_queue;

import java.util.Scanner;
import java.util.Stack;

class Ex05_01_T {
	//����
	//��ȣ�� �ԷµǸ� �ùٸ� ��ȣ�̸� ��YES", �ùٸ��� ������ ��NO"�� ����մϴ�.
	//(())() �̰��� ��ȣ�� ���� �ùٸ��� ��ġ�ϴ� ������, (()()))�� �ùٸ� ��ȣ�� �ƴϴ�.
	
	//�Է�
	//ù ��° �ٿ� ��ȣ ���ڿ��� �Էµ˴ϴ�. ���ڿ��� �ִ� ���̴� 30�̴�.
	
	//���
	//ù ��° �ٿ� YES, NO�� ����Ѵ�.
	public String solution(String str) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(x == '(') stack.push(x);
			else {
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		
		if(!stack.isEmpty()) return "NO";
		return answer;
	}
	
	public static void main(String[] args) {
		Ex05_01_T T = new Ex05_01_T();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
