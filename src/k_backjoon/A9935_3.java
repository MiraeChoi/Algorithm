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
		char[] arr = new char[str.length];
		int lastIdx = bomb.length - 1;
		int j = 0, k = 0, q = 0;
		for(char c : str) {
			arr[j] = c;
			if(arr[j] == bomb[lastIdx] && j >= lastIdx) {
				k = lastIdx;
				q = j;
				System.out.println("★ k q : " + k + " " + q); //확인
				while(k >= 0 && arr[q] == bomb[k]) {
					System.out.println("arr[q] : " + arr[q] + " & bomb[k] : " + bomb[k]); //확인
					q--;
					k--;
				}
				if(k < 0) j = q;
			}
			System.out.println("j k q : " + j + " " + k + " " + q); //확인
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