package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A1427_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int[] arr = new int[tmp.length()];
		for(int i = 0; i < tmp.length(); i++) {
			arr[i] = Integer.parseInt(tmp.charAt(i) + "");
		}
		int[] cnt = new int[10];
		for(int i = 0; i < tmp.length(); i++) cnt[arr[i]]++;
		for(int i = 1; i < cnt.length; i++) cnt[i] += cnt[i-1];
		int[] result = new int[tmp.length()];
		for(int i = tmp.length() - 1; i >= 0; i--) result[--cnt[arr[i]]] = arr[i];
		for(int i = tmp.length() - 1; i >= 0; i--) sb.append(result[i]);
		System.out.println(sb);
	}
}
