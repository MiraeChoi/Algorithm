package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class A9935_2 {
	//�¾ҽ��ϴ�!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String bomb = br.readLine();
		Stack<Character> stack = new Stack<>();
		int len = str.length();
		for(int i = 0; i < len; i++) {
			stack.add(str.charAt(i));
			if(stack.size() >= bomb.length()) {
				boolean tnf = true;
				for(int j = 0; j < bomb.length(); j++) {
					char c1 = stack.get(stack.size() - bomb.length() + j);
					char c2 = bomb.charAt(j);
					if(c1 != c2) {
						tnf = false;
						break;
					}
				}
				if(tnf) {
					for(int j = 0; j < bomb.length(); j++) stack.pop();
				}
			}
		}
		if(stack.size() == 0) System.out.println("FRULA");
		else {
			StringBuilder sb = new StringBuilder();
			for(char x : stack) sb.append(x);
			System.out.print(sb);
		}
	}
}