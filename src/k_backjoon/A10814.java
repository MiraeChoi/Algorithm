package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Online10814 implements Comparable<Online10814>{
	int age; String name;
	
	public Online10814(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Online10814 o) {
		if(o.age != this.age) return this.age - o.age;
		else return 0;
	}
}

class A10814 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Online10814> arr = new ArrayList<>();
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr.add(new Online10814(Integer.parseInt(st.nextToken()), st.nextToken()));
		}
		Collections.sort(arr);
		StringBuilder sb = new StringBuilder();
		for(Online10814 x : arr) {
			sb.append(x.age).append(' ').append(x.name).append('\n');
		}
		System.out.println(sb);
	}
}
