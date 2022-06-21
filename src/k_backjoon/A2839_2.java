package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2839_2 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int answer = 0;
		while(n % 5 != 0) {		//18 % 5 = 3
			n -= 3;				//n = 15
			answer++;			//answer = 1
		}
		if(n < 0) System.out.println(-1);
		else {
			answer += n / 5;	//answer = 1 + (15 / 5) = 4
			System.out.println(answer);
		}
        br.close();
	}
}