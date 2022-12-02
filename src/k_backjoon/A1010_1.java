package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

class A1010_1 {
	//맞았습니다!!
	private static int solution(int n, int m) {
		BigInteger nu = new BigInteger("1");
		BigInteger de = new BigInteger("1");
		for(int i = m; i > n; i--) nu = nu.multiply(new BigInteger(i + ""));
		for(int i = m - n; i >= 2; i--) de = de.multiply(new BigInteger(i + ""));
		System.out.println(nu + " / " + de);
		BigInteger answer = nu.divide(de);
		return answer.intValue();
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			if(N == M) sb.append(1).append('\n');
			else if(N == 1) sb.append(M).append('\n');
			else if(M == 1) sb.append(N).append('\n');
			else sb.append(solution(N, M)).append('\n');
		}
		System.out.println(sb);
	}
}