package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A2477 {
	//틀렸습니다
//	반례 :
//	8
//	4 20
//	2 60
//	3 40
//	1 100
//	4 20
//	2 40
//	정답 : 25600 / 현재 답 : 22400
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] arr = new int[4+1];
		int s12 = 0, s34 = 0, t12 = 0, t34 = 0;
		for(int i = 0; i < 6; i++) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			if(arr[p] == 0) {
				arr[p] = l;
			} else {
				if(p >= 3) {
					s12 = arr[p-2];
					s34 = l;
					if(p % 2 == 0) { t12 = p-3; t34 = p-1; }
					else { t12 = p-1; t34 = p+1; }
					arr[p-2] = 0;
				} else {
					s12 = l;
					s34 = arr[p+2];
					if(p % 2 == 0) { t12 = p-1; t34 = p+1; }
					else { t12 = p+1; t34 = p+3; }
					arr[p+2] = 0;
				}
			}
		}
		System.out.println(t12 + "/" + t34);
		t12 = arr[t12];
		t34 = arr[t34];
		System.out.println((t12 * t34 - s12 * s34) * K);
		System.out.println(s12 + "/" + s34);
		System.out.println(t12 + "/" + t34);
	}
}