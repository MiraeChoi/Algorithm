package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A13909 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println((int)Math.floor(Math.sqrt(N)));
//		boolean[] arr = new boolean[N + 1];
//		int answer = 0;
//		for(int i = 1; i <= N; i++) {
//			for(int j = i; j <= N; j += i) {
//				if(arr[j]) arr[j] = false;
//				else arr[j] = true;
//			}
//			if(arr[i]) answer++; //창문이 열려 있음
//		}
//		System.out.println(answer);
	}
}