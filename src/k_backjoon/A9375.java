package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Wear9375 implements Comparable<Wear9375> {
	String name, type;
	
	public Wear9375(String name, String type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public int compareTo(Wear9375 o) {
		return 0;
	}
}

class A9375 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < testcase; i++) {
			int n = Integer.parseInt(br.readLine());
			ArrayList<Wear9375> arr = new ArrayList<>();
			int answer = 0;
			for(int j = 0; j < n; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				String name = st.nextToken();
				String type = st.nextToken();
				int cnt = 1;
				for(int k = 0; k < arr.size(); k++) {
					if(type.equals(arr.get(k).type)) cnt++;
				}
//				arr.add(new Wear9375(cnt, type));
			}
			sb.append(answer).append('\n');
		}
		System.out.println(sb);
	}
}