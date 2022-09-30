package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1764_1 {
	//시간 초과
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String[] noHear = new String[n];
		for(int i = 0; i < n; i++) noHear[i] = br.readLine();
		
		int cnt = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
			String noSee = br.readLine();
			for(int j = 0; j < n; j++) {
				if(noSee.equals(noHear[j])) {
					cnt++;
					sb.append(noSee).append('\n');
					break;
				}
			}
		}
		System.out.println(cnt);
		System.out.println(sb);
	}
}