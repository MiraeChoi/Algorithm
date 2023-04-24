package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A9935_1 {
	//메모리 초과
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String bomb = br.readLine();
		int len = bomb.length();
		while(true) {
			int cnt = 0;
			for(int i = 0; i <= str.length() - len; i++) {
				String tmp = str.substring(i, i + len);
				System.out.println("tmp : " + tmp);
				if(tmp.equals(bomb)) {
					cnt++;
					str = str.substring(0, i) + str.substring(i + len, str.length());
					System.out.println("★str : " + str + " / cnt : " + cnt);
					break;
				}
			}
			if(cnt == 0) break;
		}
		if(str.length() == 0) System.out.println("FRULA");
		else System.out.println(str);
	}
}