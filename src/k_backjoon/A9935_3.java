package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class A9935_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray();
		char[] bomb = br.readLine().toCharArray();
		char[] arr = new char[1000010];
		int lastIdx = bomb.length - 1;
		int j = 0, k, q;
		for(char c : str) {
			arr[j] = c;
			if(arr[j] == bomb[lastIdx] && j >= lastIdx) {
				k = lastIdx;
				q = j;
				while(k >= 0 && arr[q] == bomb[k]) {
					q--;
					k--;
				}
				if(k < 0) j = q;
			}
			j++;
		}
		arr[j] = 0;
		if(j == 0) System.out.print("FRULA");
		else {
			char[] answer = Arrays.copyOfRange(arr, 0, j);
			System.out.print(answer);
		}
	}
}