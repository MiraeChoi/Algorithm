package k_backjoon;

import java.io.IOException;

public class A1152_2 {
	public static void main(String[] args) throws IOException {
		int c, answer = 0;
		boolean blank = true;
		int word = System.in.read();
		
		while((c = System.in.read()) != 13) {	//13 = Enter
			if(c == ' ') blank = true;			//32 = Space
			else {
				if(blank) answer++;
				blank = false;
				System.out.println("c : " + c);
			}
		}
		System.out.println(answer);
	}
}
