package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2869_2 {
	//Æ²·È½À´Ï´Ù
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		if(a == v) System.out.println(1);
		else {
			String str = "" + a;
			double tmp = Math.round((float)(v-a) / (float)(a-b) / Math.pow(10, str.length()-1)) * Math.pow(10, str.length()-1);
			System.out.println(Math.round((tmp < 1 ? 1 : tmp) + 1));
		}
	}
}
