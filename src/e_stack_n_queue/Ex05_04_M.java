package e_stack_n_queue;

import java.util.Scanner;
import java.util.Stack;

class Ex05_04_M {
	//����
	//����������� �־����� ������ ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
	//���� 3*(5+2)-9 �� ������������� ǥ���ϸ� 352+*9- �� ǥ���Ǹ� �� ����� 12�Դϴ�.
	
	//�Է�
	//ù �ٿ� ����������� �־����ϴ�. ������� ���̴� 50�� ���� �ʽ��ϴ�.
	//���� 1~9�� ���ڿ� +, -, *, / �����ڷθ� �̷������.
	
	//���
	//������ ����� ����մϴ�.
	public int solution(String str) {
		int answer = 0;
		Stack<String> stack = new Stack<>();
		
		for(int i = 0; i < str.length(); i++) {
			String x = str.charAt(i) + "";
			
			if(x.equals("+") || x.equals("-") || x.equals("*") || x.equals("/")) {
				int rt = Integer.parseInt(stack.pop());
				int lt = Integer.parseInt(stack.pop());
				
				if(x.equals("+")) stack.push(lt + rt + "");
				if(x.equals("-")) stack.push(lt - rt + "");
				if(x.equals("*")) stack.push(lt * rt + "");
				if(x.equals("/")) stack.push(lt / rt + "");
			} else {
				stack.push(x);
			}
		}
		
		answer = Integer.parseInt(stack.get(0));
		return answer;
	}
	
	public static void main(String[] args) {
		Ex05_04_M T = new Ex05_04_M();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
