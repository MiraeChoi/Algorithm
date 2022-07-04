package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A9020_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		boolean[] prime = new boolean[10001];
		int len = 0;
		
		for(int i = 2; i < prime.length; i++) {
			if(!prime[i]) {
				len++;
				for(int j = i + i; j < prime.length; j += i) prime[j] = true;
			}
		}
		int[] np = new int[len];
		int idx = 0;
		for(int i = 2; i < prime.length; i++) {
			if(!prime[i]) {
				np[idx] = i;
				idx++;
			}
		}
		//for(int i = 0; i < len; i++) System.out.println(i + " : " + np[i]);
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			int lt = 0, rt = 1;
			if(np[lt] + np[rt] < n) {
				rt++;
				if(rt == len - 1) {
					rt = 1;
					lt++;
				}
			} else if(np[lt] + np[rt] > n) {
				rt = 1;
				lt++;
			} else {
				sb.append(lt + " " + rt + "\n");
			}
			System.out.println("lt & rt : " + np[lt] + " / " + np[rt]);
		}
		System.out.println(sb);
		br.close();
	}
}
