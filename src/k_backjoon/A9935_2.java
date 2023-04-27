package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class A9935_2 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String bomb = br.readLine();
		Stack<Character> stack = new Stack<>();
		int len = str.length();
		for(int i = 0; i < len; i++) {
			stack.add(str.charAt(i));
			System.out.println(stack); //확인
			if(stack.size() >= bomb.length()) {
				boolean tnf = true;
				for(int j = 0; j < bomb.length(); j++) {
					char c1 = stack.get(stack.size() - bomb.length() + j);
					char c2 = bomb.charAt(j);
					System.out.println("c1 & c2 : " + c1 + " " + c2); //확인
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