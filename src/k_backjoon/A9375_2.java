package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class A9375_2 {
	//�¾ҽ��ϴ�!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		HashMap<String, Integer> map = null;
		for(int i = 0; i < testcase; i++) {
			map = new HashMap<>();
			int n = Integer.parseInt(br.readLine());
			int answer = 1;
			if(n > 0) {
				for(int j = 0; j < n; j++) {
					StringTokenizer st = new StringTokenizer(br.readLine(), " ");
					String name = st.nextToken();
					String type = st.nextToken();
					map.put(type, map.containsKey(type) ? map.get(type) + 1 : 1);
				}
			}
			//NULL(���� �� ��)�� �������� �־ ���
			for(String type : map.keySet()) answer *= map.get(type) + 1;
			//��� ���� NULL�� ��츦 ����(-1)
			sb.append(--answer).append('\n');
		}
		System.out.println(sb);
	}
}