package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class A1181_2 {
	//시간 초과
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String tmp = br.readLine();
			if(!arr.contains(tmp)) arr.add(tmp);
		}
		for(int i = 0; i < arr.size(); i++) {
			for(int j = i + 1; j < arr.size(); j++) {
				if(arr.get(i).length() > arr.get(j).length()) {
					String s = arr.get(i);
					arr.set(i, arr.get(j));
					arr.set(j, s);
				} else if(arr.get(i).length() == arr.get(j).length()) {
					int cpr = arr.get(i).compareTo(arr.get(j));
					if(cpr > 0) {
						String s = arr.get(i);
						arr.set(i, arr.get(j));
						arr.set(j, s);
					}
				}
			}
		}
		for(String x : arr) sb.append(x).append('\n');
		System.out.println(sb);
	}
}
