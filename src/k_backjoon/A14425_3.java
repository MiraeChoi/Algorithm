package k_backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

class A14425_3 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		
		HashSet<String> set = new HashSet<>();
		for(int i = 0; i < n; i++) set.add(br.readLine());
		
		int answer = 0;
		for(int i = 0; i < m; i++) {
			if(set.contains(br.readLine())) answer++;
		}
		System.out.println(answer);
	}
}