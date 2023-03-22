package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A14215_1 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int max = 0, mid = 0, min = 0, answer = 0;
		if(a > b && a > c) {
			max = a;
			if(b > c) { mid = b; min = c; }
			else { mid = c; min = b; }
		} else if(b > a && b > c) {
			max = b;
			if(a > c) { mid = a; min = c; }
			else { mid = c; min = a; }
		} else if(c > a && c > a) {
			max = c;
			if(a > b) { mid = a; min = b; }
			else { mid = b; min = a; }
		} else {
			max = a;
			mid = b;
			min = c;
		}
		while(mid + min <= max) max--;
		answer = max + mid + min;
		System.out.println(answer);
	}
}