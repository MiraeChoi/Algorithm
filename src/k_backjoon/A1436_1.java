package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A1436_1 {
	//메모리 초과
	// 666	 6664	11666	16665
	//1666	 6665	12666	16666
	//2666	 6666	13666	16667
	//3666	 6667	14666	16668
	//4666	 6668	15666	16669
	//5666	 6669	16660	17666
	//6660	 7666	16661	18666
	//6661	 8666	16662	19666
	//6662	 9666	16663	20666
	//6663	10666	16664	21666
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i = 666; i <= 2666799; i++) {
			String tmp = i + "";
			for(int j = 0; j < tmp.length() - 2; j++) {
				if(tmp.substring(j, j + 3).equals("666")) {
					cnt++;
					break;
				}
			}
			if(cnt == n) {
				System.out.println(i);
				break;
			}
		}
	}
}
