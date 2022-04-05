package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_13_Review {
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
	static int n, answer = 0;
	static int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1};
	static int[] dy = {0, 1, 0, -1, 1, -1, 1, -1};
	static int[][] board;
	
	public void DFS(int x, int y) {		//x = 0, y = 0
		for(int i = 0; i < 8; i++) {	//i = 0					i = 1
			int nx = x + dx[i];			//nx = 0 + (-1) = -1	nx = 0 + 0 = 0
			int ny = y + dy[i];			//ny = 0 + 0 = 0		ny = 0 + 1 = 1
			
			if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
				board[nx][ny] = 0;								//board[0][1] = 0
				DFS(nx, ny);									//DFS(0, 1)
			}
		}
	}
	
	public void solution() {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(board[i][j] == 1) {	//board[0][0] = 1
					answer++;			//answer = 1
					DFS(i, j);			//DFS(0, 0)
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_13_Review T = new Ex08_13_Review();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		board = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		T.solution();
		System.out.println(answer);
	}
}
