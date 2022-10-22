package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A2477_2 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] pointer = new int[6+5];
		int[] length = new int[6+5];
		
		for(int i = 0; i < 6; i++) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			pointer[i] = p;
			length[i] = l;
		}
		for(int i = 0; i < 6; i++) {
			if(pointer[i] == pointer[i+2] && pointer[i+1] == pointer[i+3]) {
				break;
			} else {
				pointer[i+6] = pointer[i];
				pointer[i] = 0;
				length[i+6] = length[i];
				length[i] = 0;
			}
		}
		for(int i = 0; i < pointer.length; i++) {
			if(pointer[i] != 0 && length[i] != 0) {
				System.out.println((length[i+4] * length[i+5] - length[i+1] * length[i+2]) * K);
				break;
			}
		}
	}
}