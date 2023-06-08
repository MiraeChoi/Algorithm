package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A16139_2 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		int[][] sum = new int[S.length()][26];
		sum[0][S.charAt(0) - 'a']++;
		for(int i = 1; i < S.length(); i++) {
			int tmp = S.charAt(i) - 'a';
			for(int j = 0; j < 26; j++) sum[i][j] = sum[i - 1][j];
			sum[i][tmp]++;
		}
		int q = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while(q-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			char ch = st.nextToken().charAt(0);
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			if(l == 0) sb.append(sum[r][ch - 'a']).append('\n');
			else sb.append(sum[r][ch - 'a'] - sum[l - 1][ch - 'a']).append('\n');
		}
		System.out.print(sb);
	}
}