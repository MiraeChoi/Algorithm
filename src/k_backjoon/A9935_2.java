package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class A9935_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String bomb = br.readLine();
		Stack<String> stack;
		while(true) {
			stack = new Stack<>();
			for(int i = 0; i <= str.length() - bomb.length(); i++) {
				String tmp = str.substring(i, i + bomb.length());
				if(!tmp.equals(bomb)) stack.add(tmp);
			}
			str = "";
			for(int i = 0; i < stack.size(); i++) str += stack.pop();
			System.out.println(str);
			if(!stack.contains(bomb)) break;
		}
		if(stack.size() == 0) System.out.println("FRULA");
		else System.out.println(str);
	}
}