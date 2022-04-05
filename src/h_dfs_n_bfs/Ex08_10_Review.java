package h_dfs_n_bfs;

import java.util.Scanner;

class Ex08_10_Review {
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
	
	public void DFS(int x, int y) {			//x = 1, y = 1								x = 1, y = 2
		if(x == 7 && y == 7) answer++;
		else {
			for(int i = 0; i < 4; i++) {	//i = 0					i = 1				i = 0				i = 1
				int nx = x + dx[i];			//nx = 1 + (-1) = 0		nx = 1 + 0 = 1		nx = 1 + (-1) = 0	nx = 1 + 0 = 1
				int ny = y + dy[i];			//ny = 1 + 0 = 1		ny = 1 + 1 = 2		ny = 2 + 0 = 2		ny = 2 + 1 = 3
				
				if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
					board[nx][ny] = 1;								//board[1][2] = 1						board[1][3] = 0
					DFS(nx, ny);									//DFS(1, 2)								DFS(1, 3)
					board[nx][ny] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_10_Review T = new Ex08_10_Review();
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
