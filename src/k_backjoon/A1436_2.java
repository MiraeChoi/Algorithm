package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A1436_2 {
	// 666	 6664	11666	16665		100666		166600
	//1666	 6665	12666	16666		101666		166601
	//2666	 6666	13666	16667		102666		166602
	//3666	 6667	14666	16668		103666		166603
	//4666	 6668	15666	16669		104666		166604
	//5666	 6669	16660	17666	...	105666	...	   .
	//6660	 7666	16661	18666		106660		   .
	//6661	 8666	16662	19666		106661		   .
	//6662	 9666	16663	20666		106662
	//6663	10666	16664	21666		106663		166699
	//최대 수 10000 -> 2666799
	static int SSS = 666;
	static String S = "6";
	
	static int soluton(int n) {
		int answer = 0;
		String tmp = SSS + "";
		int j = 0;
		boolean isSix = false;
		for(int i = 0; i <= n; i++) {
			String len = i + "";
			//다시 구현
			if(isSix) {
				String front = len.substring(0, len.length() - 1);
				tmp = front + "" + SSS + j;
				j++;
				if(j > 9) {
					j = 0;
					isSix = false;
				}
			}
			if(len.substring(len.length() - 1, len.length()).equals(S)) {
				isSix = true;
			} else tmp = i + "" + SSS;
			System.out.println("tmp : " + tmp);
			answer = Integer.parseInt(tmp);
			if(answer == i) return answer;
		}
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(soluton(n));
	}
}
