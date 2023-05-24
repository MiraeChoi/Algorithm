package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A1463 {
	//맞았습니다!!
	private static int solution(int n, int cnt) {
		if(n < 2) return cnt;
		return Math.min(solution(n / 2, cnt + 1 + (n % 2)), solution(n / 3, cnt + 1 + (n % 3)));
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(solution(N, 0));
	}
}