package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

class A20920 {
	//4/9까지 커밋푸시 완료... 4/10에 다 풀자
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Map<String, Integer> map = new HashMap<>();
		while(N-- > 0) {
			String word = br.readLine();
			if(word.length() < M) continue;
			map.put(word, map.get(word) == null ? 1 : map.get(word) + 1);
		}
		List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
		list.sort(new Comparator<Map.Entry<String, Integer>>() {
			//1 자주 나오는 단어일수록 앞에 배치한다.
			//2 해당 단어의 길이가 길수록 앞에 배치한다.
			//3 알파벳 사전 순으로 앞에 있는 단어일수록 앞에 배치한다.
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//				if(o1.getValue() == o2.getValue()) return o1.getKey() - o2.getKey();
				return o2.getValue() - o1.getValue();
			}
		});
		StringBuilder sb = new StringBuilder();
		for(Map.Entry<String, Integer> entry : list) {
			sb.append(entry.getKey()).append(" : ").append(entry.getValue()).append('\n');
		}
		System.out.println(sb);
	}
}