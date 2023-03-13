package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A2485_1 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] tree = new int[N - 1];
		int start = Integer.parseInt(br.readLine());
		for(int i = 0; i < tree.length; i++) {
			int cur = Integer.parseInt(br.readLine());
			tree[i] = cur - start;
			start = cur;
		}
		int gap = 0;
		out : for(int i = tree[0]; i >= 1; i--) {
			for(int j = 0; j < tree.length; j++) {
				if(tree[j] % i > 0) continue out;
			}
			gap = i;
			break;
		}
		int answer = 0;
		for(int i = 0; i < tree.length; i++) {
			answer += tree[i] / gap - 1;
		}
		System.out.println(answer);
	}
}