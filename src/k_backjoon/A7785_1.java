package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

class A7785_1 {
	//시간 초과
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<String> arr = new ArrayList<>();
		while(n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String name = st.nextToken();
//			String enl = st.nextToken();
			if(arr.contains(name)) arr.remove(name);
			else arr.add(name);
		}
		StringBuilder sb = new StringBuilder();
		for(String x : arr) sb.append(x).append('\n');
		System.out.println(sb);
	}
}