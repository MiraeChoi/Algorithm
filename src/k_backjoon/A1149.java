package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class A1149 {
	//ex) N=3, ������ ������ ��1 26 40 83 / ��2 49 60 57 / ��3 13 89 99
	//������ ������ �ʻ��� ���Ļ� �Ļ��� ���ʻ�
	//���ʻ� ���Ļ�(V) �ʻ��� ������ �Ļ��� ������
	//��1 26 + ��2 57 + ��3 13 = 96
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] house = new int[N][3];
		StringTokenizer st;
		for(int i = 0; i < house.length; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < house[i].length; j++) {
				house[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int answer = 0;
		for(int i = 0; i < house.length; i++) {
			for(int j = 0; j < house[i].length; j++) {
				
			}
		}
		System.out.println(answer);
	}
}