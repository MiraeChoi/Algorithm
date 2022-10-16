package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class A1764_3 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Set<String> noHear = new HashSet<>();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		for(int i = 0; i < N; i++) noHear.add(br.readLine());
		StringBuilder sb = new StringBuilder();
		String[] noSee = new String[N];
		int idx = 0;
		for(int i = 0; i < M; i++) {
			String tmp = br.readLine();
			if(noHear.contains(tmp)) {
				noSee[idx] = tmp;
				idx++;
			}
		}
		String[] realNoSee = new String[idx];
		for(int i = 0; i < realNoSee.length; i++) realNoSee[i] = noSee[i];
		Arrays.sort(realNoSee);
		for(int i = 0; i < realNoSee.length; i++) sb.append(realNoSee[i]).append('\n');
		System.out.println(idx);
		System.out.println(sb);
	}
}