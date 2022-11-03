package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A2609_1 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		int min = Math.min(n1, n2);
		int gcd = 1;
		
		for(int i = 2; i <= min; i++) {
			if(n1 % i == 0 && n2 % i == 0) gcd = i;
		}
		System.out.println(gcd + "\n" + (n1 * n2 / gcd));
	}
}