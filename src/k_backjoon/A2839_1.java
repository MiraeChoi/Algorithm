package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2839_1 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int V5 = n / 5, V3 = 0;
		int total = n % 5;
		int min = V5 + V3;
		int answer = Integer.MAX_VALUE;
		
		if(total == 0) System.out.println(V5);
		else {
			while(V5 >= 0 && V3 <= n/3) {
				System.out.println("total & V5 & V3 : " + total + "/" + V5 + "/" + V3);
				if(total % 3 == 0) {
					V3 = total / 3;
					min = V5 + V3;
					answer = Math.min(answer, min);
				}
				V5--;
				total += 5;
			}
			if(answer == Integer.MAX_VALUE) System.out.println(-1);
			else System.out.println(answer);
		}
	}
}
