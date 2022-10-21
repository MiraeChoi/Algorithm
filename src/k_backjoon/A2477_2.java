package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Arr2447_2 {
	int pointer, length;
	
	public Arr2447_2(int pointer, int length) {
		this.pointer = pointer;
		this.length = length;
	}
}

class A2477_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Queue<Arr2447_2> Q = new LinkedList<>();
		int[] idxCheck = new int[4+1];
		
		for(int i = 0; i < 6; i++) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			Q.offer(new Arr2447_2(p, l));
			if(idxCheck[p] > 0) {
				
			}
			else idxCheck[p]++;
		}
		System.out.println();
	}
}