package c_pointers_n_window;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Ex03_03 {
	public int solution(int n1, int n2, int[] a) {
		int answer = Integer.MIN_VALUE;
		int count = 0;
		int start = 0;
		int end = n2;
		
		while(end < n1) {
			for(int i = start; i < end; i++) {
				count += a[i];
			}
			
			if(count >= answer) {
				answer = count;
			}
			
			count = 0;
			start++;
			end++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		Ex03_03 T = new Ex03_03();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		int[] a = new int[n1];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < n1; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(T.solution(n1, n2, a));
		br.close();
	}
}

