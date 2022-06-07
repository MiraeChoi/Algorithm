package k_backjoon;

import java.io.IOException;

public class A1152_3 {
	public static void main(String[] args) throws IOException {
		int pre = 32;
		int cur;
		int answer = 0;
		
		while(true) {
			cur = System.in.read();
			
			if(cur == ' ' && pre != ' ') answer++;
			else if(cur == '\n') {
				if(pre != ' ') answer++;
				break;
			}
			pre = cur;
		}
		System.out.println(answer);
	}
}
