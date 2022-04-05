package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_10_T {
	//����
	//7*7 ������ �̷θ� Ż���ϴ� ����� �������� ����ϴ� ���α׷��� �ۼ��ϼ���.
	//������� ������ (1, 1) ��ǥ�̰�, Ż�� �������� (7, 7)��ǥ�̴�. �������� 1�� ���̰�, 0�� ����̴�.
	//�������� �������� �����¿�θ� �����δ�. �̷ΰ� ������ ���ٸ�
	//��� 0 0 0 0 0  0
	// 0  1 1 1 1 1  0
	// 0  0 0 1 0 0  0
	// 1  1 0 1 0 1  1
	// 1  1 0 0 0 0  1
	// 1  1 0 1 1 0  0
	// 1  0 0 0 0 0 ����
	//���� �������� ��������� ���������� �� �� �ִ� ����� ���� 8�����̴�.

	//�Է�
	//7*7 �������� ������ �־����ϴ�.

	//���
	//ù ��° �ٿ� ����� �������� ����Ѵ�.
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] board;
	static int answer = 0;
	
	public void DFS(int x, int y) {
		if(x == 7 && y == 7) answer++;
		else {
			for(int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					DFS(nx, ny);
					board[nx][ny] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_10_T T = new Ex08_10_T();
		Scanner kb = new Scanner(System.in);
		board = new int[7+1][7+1];
		for(int i = 1; i <= 7; i++) {
			for(int j = 1; j <= 7; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		board[1][1] = 1;
		T.DFS(1, 1);
		System.out.println(answer);
	}
}
