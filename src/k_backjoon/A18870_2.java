package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

class A18870_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		int[] sort = new int[n];
		for(int i = 0; i < n; i++) sort[i] = arr[i];
		Arrays.sort(sort);
		HashMap<Integer, Integer> map = new HashMap<>();
		int val = 0;
		for(int i = 0; i < n; i++) {
			if(map.get(sort[i]) == null) map.put(sort[i], val++);
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) sb.append(map.get(arr[i])).append(' ');
		System.out.println(sb);
	}
}
