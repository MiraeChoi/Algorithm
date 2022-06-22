package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int answer = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		outer : for(int i = 0; i < num; i++) {
			int n = Integer.parseInt(st.nextToken());
			if(n == 2) answer++;
			if(n == 1 || n % 2 == 0) continue;
			
			for(int j = 3; j < n; j += 2) {
				if(n % j == 0) continue outer;
			}
			answer++;
		}
		System.out.println(answer);
	}
}