package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A3009 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a1 = Integer.parseInt(st.nextToken());
		int a2 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int b1 = Integer.parseInt(st.nextToken());
		int b2 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int c1 = Integer.parseInt(st.nextToken());
		int c2 = Integer.parseInt(st.nextToken());
		
		int answer1 = 0, answer2 = 0;
		if(a1 == b1) answer1 = c1;
		else if(b1 == c1) answer1 = a1;
		else answer1 = b1;
		if(a2 == b2) answer2 = c2;
		else if(b2 == c2) answer2 = a2;
		else answer2 = b2;
		System.out.println(answer1 + " " + answer2);
	}
}