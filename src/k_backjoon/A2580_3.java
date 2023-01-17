package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Node2580_3 {
	int x, y;
	
	public Node2580_3(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class A2580_3 {
	static int N;
	static int[][] arr;
	static boolean[][] row, col, square;
	static ArrayList<Node2580_3> list = new ArrayList<>();
	
	private static boolean DFS(int n) {
		if(n == N) return true;
		Node2580_3 node = list.get(n);
		int r = node.x;
		int c = node.y;
		int s = 3 * (r / 3) + c / 3;
		//check
		System.out.println("r & c & s : " + r + " " + c + " " + s);
		for(int i = 1; i <= 9; i++) {
			if(!row[r][i] && !col[c][i] && !square[s][i]) {
				row[r][i] = col[c][i] = square[s][i] = true;
				arr[r][c] = i;
				if(DFS(n + 1)) return true;
				row[r][i] = col[c][i] = square[s][i] = false;
			}
		}
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		arr = new int[9][9];
		row = new boolean[9][10];
		col = new boolean[9][10];
		square = new boolean[9][10];
		
		for(int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 9; j++) {
				if((arr[i][j] = Integer.parseInt(st.nextToken())) == 0) list.add(new Node2580_3(i, j));
				else {
					row[i][arr[i][j]] = true;
					col[j][arr[i][j]] = true;
					square[3 * (i / 3) + j / 3][arr[i][j]] = true;	
				}
			}
		}
		N = list.size();
		DFS(0);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				sb.append(arr[i][j]).append(j >= 8 ? '\n' : ' ');
			}
		}
		System.out.print(sb);
	}
}