package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class A20920_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		PriorityQueue<Entry<String, Integer>> pQ = new PriorityQueue<>(new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				if(o1.getValue() < o2.getValue()) 					 return 1;
				else if(o1.getValue() > o2.getValue()) 				 return -1;
				else if(o1.getKey().length() < o2.getKey().length()) return 1;
				else if(o1.getKey().length() > o2.getKey().length()) return -1;
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < N; i++) {
			String word = br.readLine();
			if(word.length() >= M) map.put(word, (map.get(word) == null ? 0 : map.get(word)) + 1);
		}
		for(Entry<String, Integer> set : map.entrySet()) pQ.offer(set);
		while(!pQ.isEmpty()) sb.append(pQ.poll().getKey()).append('\n');
		System.out.println(sb);
	}
}