package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1541 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sub = new StringTokenizer(br.readLine(), "-");
		int sum = Integer.MAX_VALUE;
		while(sub.hasMoreTokens()) {
			int tmp = 0;
			StringTokenizer add = new StringTokenizer(sub.nextToken(), "+");
			while(add.hasMoreTokens()) tmp += Integer.parseInt(add.nextToken());
			if(sum == Integer.MAX_VALUE) sum = tmp;
			else sum -= tmp;
		}
		System.out.println(sum);
	}
}