package k_backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class A11478_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int len = str.length();
		String[] arr = new String[len];
		int lcp = 0;
		for(int i = 0; i < len; i++) arr[i] = str.substring(len - 1 - i);
		Arrays.sort(arr);
		for(int i = 0; i < len; i++) System.out.println(arr[i]);
		for(int i = 1; i < len; i++) {
			for(int j = 0; j < arr[i - 1].length(); j++) {
				if(arr[i-1].charAt(j) == arr[i].charAt(j)) lcp++;
				else break;
			}
		}
		int answer = (len * (len + 1) / 2 - lcp);
		bw.write(answer + "");
		bw.flush();
	}
}