package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

//Æ²·È½À´Ï´Ù
class Sort1181_2 implements Comparable<Sort1181_2>{
	String s;
	
	public Sort1181_2(String s) {
		this.s = s;
	}

	@Override
	public int compareTo(Sort1181_2 o) {
		if(this.s.length() == o.s.length()) return -1;
		else return this.s.length() - o.s.length();
	}
}

class A1181_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		ArrayList<Sort1181_2> arr = new ArrayList<>();
		out : for(int i = 0; i < n; i++) {
			String tmp = br.readLine();
			for(int j = 0; j < arr.size(); j++) {
				if(tmp.equals(arr.get(j).s)) continue out;
			}
			arr.add(new Sort1181_2(tmp));
		}
		for(Sort1181_2 x : arr) {
			System.out.println("arr1 : " + x.s);
		}
		Collections.sort(arr);
		for(Sort1181_2 x : arr) {
			System.out.println("arr2 : " + x.s);
		}
		for(Sort1181_2 x : arr) sb.append(x.s).append('\n');
		System.out.println(sb);
	}
}
