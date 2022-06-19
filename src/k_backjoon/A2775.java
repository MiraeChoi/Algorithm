package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A2775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		int k, n;
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			k = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			
			if(n == 1) str.append("1\n");
			else if(n == 2) str.append((k + n) + "\n");
			else {
				
			}
		}
		System.out.print(str.toString());
	}
}
