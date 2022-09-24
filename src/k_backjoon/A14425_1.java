package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A14425_1 {
	//시간 초과
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String[] arr = new String[n];
		for(int i = 0; i < n; i++) arr[i] = br.readLine();
		int answer = 0;
		out : for(int i = 0; i < m; i++) {
			String tmp = br.readLine();
			for(int j = 0; j < n; j++) {
				if(tmp.equalsIgnoreCase(arr[j])) {
					answer++;
					continue out;
				}
			}
		}
		System.out.println(answer);
	}
}