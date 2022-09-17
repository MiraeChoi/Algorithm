package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A1181_3 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		for(int i = 0; i < n; i++) arr[i] = br.readLine();
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(arr[i].equals(arr[j])) arr[j] = "";
				else if(arr[i].length() > arr[j].length()) {
					String s = arr[i];
					arr[i] = arr[j];
					arr[j] = s;
				}
				else if(arr[i].length() == arr[j].length()) {
					int cpr = arr[i].compareTo(arr[j]);
					if(cpr > 0) {
						String s = arr[i];
						arr[i] = arr[j];
						arr[j] = s;
					}
				}
			}
		}
		for(String x : arr) {
			if(!x.equals("")) sb.append(x).append('\n');
		}
		System.out.println(sb);
	}
}
