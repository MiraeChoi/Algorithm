package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class A17298_2 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Stack<Integer> stack = new Stack<>();
		int[] arr = new int[N];
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		for(int i = 0; i < N; i++) {
			while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				System.out.println(arr[stack.peek()] + " / " + arr[i]);
				arr[stack.pop()] = arr[i];
			}
			stack.push(i);
			System.out.println("stack : " + stack);
			System.out.print("arr   : ");
			for(int j = 0; j < N; j++) System.out.print(arr[j] + " ");
			System.out.println();
		}
		while(!stack.isEmpty()) arr[stack.pop()] = -1;
		for(int i = 0; i < N; i++) sb.append(arr[i]).append(' ');
		System.out.print(sb);
	}
}