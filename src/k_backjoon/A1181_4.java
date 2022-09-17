package k_backjoon;

import java.io.*;
import java.util.*;

public class A1181_4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		List<Set<String>> list = new ArrayList<>(51);
		for(int i = 0; i < 51; i++) list.add(new TreeSet<>());

		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			list.get(s.length()).add(s);
		}
		StringBuilder sb = new StringBuilder();
		for(Set<String> strings : list) {
			for(String s : strings) sb.append(s).append('\n');	
		} 
		bw.write(sb.toString());
		bw.flush();
    }
}
