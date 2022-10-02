package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class A1764_2 {
	//시간 초과
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		ArrayList<String> noHear = new ArrayList<>();
		for(int i = 0; i < n; i++) noHear.add(br.readLine());
		int cnt = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
			String noSee = br.readLine();
			if(noHear.contains(noSee)) {
				cnt++;
				sb.append(noSee).append('\n');
			}
		}
		System.out.println(cnt);
		System.out.println(sb);
	}
}