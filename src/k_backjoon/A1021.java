package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class A1021 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		Queue<Integer> Q = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) Q.offer(Integer.parseInt(st.nextToken()));
		
	}
}