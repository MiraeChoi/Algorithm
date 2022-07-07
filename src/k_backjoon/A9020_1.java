package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A9020_1 {
	//Æ²·È½À´Ï´Ù.
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
		
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			int lt = 0, rt = 1;
			int p1 = 0, p2 = 0;
			int min = Integer.MAX_VALUE;
			
			while(lt < np.length && np[lt] < n) {
				if(rt == np.length - 1) {
					lt++;
					rt = 0;
				}
				if(lt == np.length) break;
				if(np[lt] + np[rt] < n) {
					rt++;
					if(rt == len - 1) {
						rt = 0;
						lt++;
					}
				} else if(np[lt] + np[rt] > n) {
					rt = 0;
					lt++;
				} else {
					if(Math.abs(np[rt] - np[lt]) < min) {
						min = np[rt] - np[lt];
						p1 = np[lt];
						p2 = np[rt];
					}
					lt++;
					rt = 0;
				}
			}
			sb.append(p1 + " " + p2 + "\n");
		}
		System.out.println(sb);
		br.close();
	}
}