package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A19532_3 {
	//¿ªÇà·Ä
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[7];
		for(int i = 1; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int x = (arr[5] * arr[3] - arr[2] * arr[6]) / (arr[1] * arr[5] - arr[2] * arr[4]);
		int y = -(arr[4] * arr[3] - arr[1] * arr[6]) / (arr[1] * arr[5] - arr[2] * arr[4]);
		System.out.println(x + " " + y);
	}
}