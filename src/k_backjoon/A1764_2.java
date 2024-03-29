package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class A1764_2 {
	//�ð� �ʰ�
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		ArrayList<String> noHear = new ArrayList<>();
		for(int i = 0; i < n; i++) noHear.add(br.readLine());
		int size = noHear.size();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
			String noSee = br.readLine();
			if(noHear.contains(noSee)) {
				sb.append(noSee).append('\n');
				noHear.remove(noSee);
			}
		}
		System.out.println(size - noHear.size());
		System.out.println(sb);
	}
}