package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A10250_2 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int h, w, n;
		
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());		//1st							2nd
			h = Integer.parseInt(st.nextToken());							//6								30
			w = Integer.parseInt(st.nextToken());							//12							50
			n = Integer.parseInt(st.nextToken());							//10							72
			
			if(n % h != 0) str.append(n % h);								//10 % 6 = 4 > str.append(4)	72 % 30 = 12 > str.append(12)
			else str.append(h);
			
			if(n / h < 9 || (n / h == 9) && (n % h == 0)) str.append(0);	//10 / 6 = 1 > str.append(0)	72 / 30 = 2 > str.append(0)
			if(n % h != 0) str.append(n / h + 1);							//10 % 6 = 4 > str.append(1+1)	72 % 30 = 12 > str.append(2+1)
			else str.append(n / h);
			str.append("\n");												//str.append("\n")				str.append("\n")
		}																	//1 : 402						2 : 1203
		System.out.print(str.toString());
	}
}
