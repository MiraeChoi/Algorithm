package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

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

class A1181_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		ArrayList<Sort1181_2> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) arr.add(new Sort1181_2(br.readLine()));
		Collections.sort(arr);
		for(int i = 0; i < n-1; i++) {
			System.out.println(arr.get(i).s);
			if(arr.get(i).s.equals(arr.get(i+1).s)) {
				while(!arr.get(i).s.equals(arr.get(i+1).s)) i++;
			}
		}
		if(arr.get(n-1).s.equals(arr.get(n-2).s)) System.out.println(arr.get(n-1).s);
	}
}
