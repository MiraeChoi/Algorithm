package e_stack_n_queue;

import java.util.Scanner;
import java.util.Stack;

class Ex05_04_M {
	//설명
	//후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
	//만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
	
	//입력
	//첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.
	//식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.
	
	//출력
	//연산한 결과를 출력합니다.
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
