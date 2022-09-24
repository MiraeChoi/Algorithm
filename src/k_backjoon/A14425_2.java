package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class A14425_2 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++) map.put(br.readLine(), 0);
		int answer = 0;
		for(int i = 0; i < m; i++) {
			String str = br.readLine();
			if(map.containsKey(str)) answer++;
		}
		System.out.println(answer);
	}
}