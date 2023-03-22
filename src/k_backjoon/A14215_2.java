package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A14215_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int max = 0, n1 = 0, n2 = 0, answer = 0;
		if(a > b && a > c) 		{ max = a; n1 = b; n2 = c; }
		else if(b > a && b > c) { max = b; n1 = a; n2 = c; }
		else 					{ max = c; n1 = a; n2 = b; }
		while(n1 + n2 <= max) max--;
		answer = max + n1 + n2;
		System.out.println(answer);
	}
}