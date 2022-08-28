package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class xy11650 implements Comparable<xy11650>{
	int x, y;
	
	public xy11650(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(xy11650 o) {
		if(this.x == o.x) return this.y - o.y;
		else return this.x - o.x;
	}
}

class A11650 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<xy11650> arr = new ArrayList<>();
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr.add(new xy11650(x, y));
		}
		Collections.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) sb.append(arr.get(i).x).append(' ').append(arr.get(i).y).append('\n');
		System.out.println(sb);
	}
}
