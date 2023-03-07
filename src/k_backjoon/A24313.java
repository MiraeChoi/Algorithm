package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A24313 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a1 = Integer.parseInt(st.nextToken());
		int a0 = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		int n0 = Integer.parseInt(br.readLine());
		if(c - a1 > 0) {
			if(a0 / (c - a1) <= n0) System.out.println(1);
			else System.out.println(0);
		} else if(c - a1 < 0) {
			System.out.println(0);
		} else {
			if(a0 <= 0) System.out.println(1);
			else System.out.println(0);
		}
	}
}