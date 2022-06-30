package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1929_1 {
	//�ð� �ʰ�
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		out : for(int i = m; i <= n; i++) {
			if(i == 1) continue;
			if(i == 2) System.out.println(2);
			if(i % 2 == 0) continue;
			for(int j = 3; j < i; j += 2) {
				if(i % j == 0) continue out;
			}
			System.out.println(i);
		}
		br.close();
	}
}
