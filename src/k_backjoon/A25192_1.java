package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class A25192_1 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		int answer = 0;
		while(N-- > 0) {
			String nickname = br.readLine();
			if(nickname.equalsIgnoreCase("ENTER")) set.clear();
			else if(!set.contains(nickname)) {
				set.add(nickname);
				answer++;
			}
		}
		System.out.println(answer);
	}
}