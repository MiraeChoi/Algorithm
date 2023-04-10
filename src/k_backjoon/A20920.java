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
	//4/9���� Ŀ��Ǫ�� �Ϸ�... 4/10�� �� Ǯ��
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
			//1 ���� ������ �ܾ��ϼ��� �տ� ��ġ�Ѵ�.
			//2 �ش� �ܾ��� ���̰� ����� �տ� ��ġ�Ѵ�.
			//3 ���ĺ� ���� ������ �տ� �ִ� �ܾ��ϼ��� �տ� ��ġ�Ѵ�.
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