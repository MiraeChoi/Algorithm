package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class A25192_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		int answer = 0;
		while(N-- > 0) {
			String nickname = br.readLine();
			if(nickname.equalsIgnoreCase("ENTER")) {
				answer += set.size();
				set.clear();
			} else set.add(nickname);
		}
		System.out.println(answer + set.size());
	}
}