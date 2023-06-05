package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A16139_1 {
	//50Á¡...?
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		int q = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while(q-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			String ch = st.nextToken();
			char a = ch.charAt(0);
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			int answer = 0;
			for(int i = l; i <= r; i++) {
				if(S.charAt(i) == a) answer++;
			}
			sb.append(answer).append('\n');
		}
		System.out.print(sb);
	}
}