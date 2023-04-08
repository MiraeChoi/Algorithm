package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class A26069 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Set<String> arr = new HashSet<>();
		arr.add("ChongChong");
		while(N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String p1 = st.nextToken();
			String p2 = st.nextToken();
			if(arr.contains(p1)) arr.add(p2);
			else if(arr.contains(p2)) arr.add(p1);
		}
		System.out.println(arr.size());
	}
}