package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A3053 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double R = Double.parseDouble(br.readLine());
//		System.out.println(String.format("%.6f", Math.PI * (R * R)));
//		System.out.println(String.format("%.6f", (double)((R * 2) * (R * 2) / 2)));
		System.out.println(R * R * Math.PI);
		System.out.println(R * R * 2);
	}
}