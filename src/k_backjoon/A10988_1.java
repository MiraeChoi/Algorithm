package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A10988_1 {
	//�¾ҽ��ϴ�!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		if(str.length() > 1) {
			for(int i = 0; i < str.length() / 2; i++) {
				if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
					System.out.println(0);
					return;
				}
			}
		}
		System.out.println(1);
	}
}