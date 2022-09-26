package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class A1620_2 {
	//맞았습니다!!
	public static boolean isInt(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Map<String, Integer> mS = new HashMap<>();
		Map<Integer, String> mI = new HashMap<>();
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			mS.put(str, i + 1);
			mI.put(i + 1, str);
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
			String tmp = br.readLine();
			boolean bl = isInt(tmp);
			if(bl) sb.append(mI.get(Integer.parseInt(tmp))).append('\n');
			else sb.append(mS.get(tmp)).append('\n');
		}
		System.out.println(sb);
	}
}
