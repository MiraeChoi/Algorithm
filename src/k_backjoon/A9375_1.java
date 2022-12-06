package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class A9375_1 {
	//Æ²·È½À´Ï´Ù
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		HashMap<String, Integer> map = null;
		for(int i = 0; i < testcase; i++) {
			map = new HashMap<>();
			int n = Integer.parseInt(br.readLine());
			int answer = 0;
			if(n > 0) {
				for(int j = 0; j < n; j++) {
					StringTokenizer st = new StringTokenizer(br.readLine(), " ");
					String name = st.nextToken();
					String type = st.nextToken();
					map.put(type, map.containsKey(type) ? map.get(type) + 1 : 1);
				}
				int[] arr = new int[map.size()];
				int idx = 0;
				for(String type : map.keySet()) {
					arr[idx++] = map.get(type);
					answer += map.get(type);
				}
				if(map.size() > 1) {
					for(int j = 2; j <= arr.length; j++) {
						int cnt = 0;
						for(int k = 0; k < j; k++) {
							for(int h = k + 1; h < j; h++) {
								cnt *= arr[h];
							}
						}
						System.out.println("cnt : " + cnt);
						answer += cnt;
					}
				}
			}
			sb.append(answer).append('\n');
		}
		System.out.println(sb);
	}
}