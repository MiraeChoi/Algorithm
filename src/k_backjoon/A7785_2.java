package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

class A7785_2 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		int idx = 0;
		while(n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String name = st.nextToken();
			if(map.containsKey(name)) map.remove(name);
			else map.put(name, idx++);
		}
		StringBuilder sb = new StringBuilder();
		List<String> list = new ArrayList<>(map.keySet());
		list.sort((s1, s2) -> s2.compareTo(s1));
		for(String x : list) sb.append(x).append('\n');
		System.out.println(sb);
	}
}