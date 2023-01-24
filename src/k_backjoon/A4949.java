package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A4949 {
	//Æ²·È½À´Ï´Ù
	private static boolean check(String str) {
		int bCnt = 0, sCnt = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') bCnt++;
			else if(str.charAt(i) == ')') bCnt--;
			else if(str.charAt(i) == '[') sCnt++;
			else if(str.charAt(i) == ']') sCnt--;
			//Help( I[m being held prisoner in a fortune cookie factory)].
			if(bCnt < 0 || sCnt < 0) return false;
		}
		if(bCnt != 0 || sCnt != 0) return false;
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String str = br.readLine();
			if(str.equals(".")) break;
			else {
				if(check(str)) sb.append("yes").append("\n");
				else sb.append("no").append("\n");
			}
		}
		System.out.println(sb);
	}
}