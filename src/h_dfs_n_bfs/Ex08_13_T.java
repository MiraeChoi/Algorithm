package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_13_T {
	//����
	//N*N�� ������ ���Ϸ����� ������ �������� ������ �־����ϴ�.
	//�� ���� 1�� ǥ�õǾ� �����¿�� �밢������ ����Ǿ� ������, 0�� �ٴ��Դϴ�.
	//������ ���Ϸ��忡 �� ���� ���� �ִ��� ���ϴ� ���α׷��� �ۼ��ϼ���.
	//1 1 0 0 0 1 0
	//0 1 1 0 1 1 0
	//0 1 0 0 0 0 0
	//0 0 0 1 0 1 1
	//1 1 0 1 1 0 0
	//1 0 0 0 1 0 0
	//1 0 1 0 1 0 0
	//���� ���� ���ٸ� ���� ������ 5���Դϴ�.
	
	//�Է�
	//ù ��° �ٿ� �ڿ��� N(3<=N<=20)�� �־����ϴ�.
	//�� ��° �ٺ��� ������ ������ �־�����.
	
	//���
	//ù ��° �ٿ� ���� ������ ����Ѵ�.
	static int answer = 0, n;
	static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
	
	public void DFS(int x, int y, int[][] board) {
		for(int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
				board[nx][ny] = 0;
				DFS(nx, ny, board);
			}
		}
	}
	
	public void solution(int[][] board) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(board[i][j] == 1) {
					answer++;
					DFS(i, j, board);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_13_T T = new Ex08_13_T();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		T.solution(arr);
		System.out.println(answer);
	}
}
