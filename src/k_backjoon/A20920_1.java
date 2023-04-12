package k_backjoon;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class A20920_1 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Map<String, Integer> map = new HashMap<>();
		while(N-- > 0) {
			String word = br.readLine();
			if(word.length() < M) continue;
			map.put(word, (map.get(word) == null ? 0 : map.get(word)) + 1);
		}
		List<String> list = map.keySet().stream().collect(Collectors.toList());
		list.sort((o1, o2) -> {
			int k1 = map.get(o1);
			int k2 = map.get(o2);
			if(k1 == k2) {
				if(o1.length() == o2.length()) return o1.compareTo(o2);
				return o2.length() - o1.length();
			}
			return k2 - k1;
		});
		StringBuilder sb = new StringBuilder();
		for(String x : list) sb.append(x).append('\n');
		System.out.println(sb);
	}
}