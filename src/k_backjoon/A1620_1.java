package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1620_1 {
	//�ð� �ʰ�
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
		int[] nArr = new int[n];
		String[] sArr = new String[n];
		for(int i = 0; i < n; i++) {
			nArr[i] = i + 1;
			sArr[i] = br.readLine();
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
			String tmp = br.readLine();
			if(isInt(tmp)) {
				int idx = Integer.parseInt(tmp) - 1;
				sb.append(sArr[idx]).append('\n');
			} else {
				for(int j = 0; j < n; j++) {
					if(tmp.equals(sArr[j])) {
						sb.append(nArr[j]).append('\n');
						break;
					}
				}
			}
		}
		System.out.println(sb);
	}
}
