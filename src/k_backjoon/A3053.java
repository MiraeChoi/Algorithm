package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A3053 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int R = Integer.parseInt(br.readLine());
		System.out.println(R * R * 3.141593);
		System.out.println(String.format("%.6f", (float)((R * 2) * (R * 2) / 2)));
	}
}