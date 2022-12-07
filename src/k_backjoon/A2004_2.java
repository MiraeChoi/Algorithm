package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A2004_2 {
	//맞았습니다!!
	private static int power5(int n) {
		int cnt = 0;
		while(n >= 5) cnt += n /= 5;
		return cnt;
	}
	private static int power2(int n) {
		int cnt = 0;
		while(n >= 2) cnt += n /= 2;
		return cnt;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int cnt5 = power5(n) - power5(n-m) - power5(m);
		int cnt2 = power2(n) - power2(n-m) - power2(m);
//		System.out.println("cnt5 : " + power5(n) + " & " + power5(n-m) + " & " + power5(m));
//		System.out.println("cnt2 : " + power2(n) + " & " + power2(n-m) + " & " + power2(m));
		System.out.println(Math.min(cnt5, cnt2));
	}
}