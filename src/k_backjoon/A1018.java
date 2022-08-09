package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1018 {
	//맞았습니다!!
	static int n, m;
	static String[][] arr;
	
	static String swap(String word) {
		if(word.equals("W")) return "B";
		else return "W";
	}
	
	static int solution(String word, int si, int sj) {
		int answer = 0;
		String tmp = "";
		for(int i = si; i < si + 8; i++) {
			if(word.equals("W")) {
				if(i % 2 == 0) tmp = "W";
				else tmp = "B";
			} else {
				if(i % 2 == 0) tmp = "B";
				else tmp = "W";
			}
			for(int j = sj; j < sj + 8; j++) {
				if(!arr[i][j].equals(tmp)) answer++;
				tmp = swap(tmp);
			}
		}
		System.out.println("answer/word/i/j : " + answer + " " + word + " " + si + " " + sj);
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new String[n][m];
		int answer = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String tmp = st.nextToken();
			for(int j = 0; j < m; j++) {
				arr[i][j] = tmp.substring(j, j+1);
			}
		}
		for(int i = 0; i <= n-8; i++) {
			for(int j = 0; j <= m-8; j++) {
				answer = Math.min(answer, solution("W", i, j));
				answer = Math.min(answer, solution("B", i, j));
			}
		}
		System.out.println(answer);
	}
}
