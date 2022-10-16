package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

class A1764_4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		String[] noHear = new String[N];
		for(int i = 0; i < N; i++) noHear[i] = br.readLine();
		Arrays.sort(noHear);
		ArrayList<String> noSee = new ArrayList<>();
		String name = "";
		for(int i = 0; i < M; i++) {
			name = br.readLine();
			if(Arrays.binarySearch(noHear, name) >= 0) noSee.add(name);
		}
		StringBuilder sb = new StringBuilder();
		Collections.sort(noSee);
		sb.append(noSee.size()).append('\n');
		for(String s : noSee) sb.append(s).append('\n');
		System.out.println(sb);
	}
}