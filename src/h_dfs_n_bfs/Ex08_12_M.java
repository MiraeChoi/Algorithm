package h_dfs_n_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class PointM {
	int x, y;
	
	public PointM(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Ex08_12_M {
	//����
	//������ �丶�� ���忡���� �丶�並 �����ϴ� ū â�� ������ �ִ�.
	//�丶��� �Ʒ��� �׸��� ���� ���� ��� ������ ĭ�� �ϳ��� �־ â�� �����Ѵ�.
	//����������
	//���������� N
	//����������
	//  M
	//â�� �����Ǵ� �丶��� �߿��� �� ���� �͵� ������, ���� ���� ���� �丶��鵵 ���� �� �ִ�. ���� �� �Ϸ簡 ������,
	//���� �丶����� ������ ���� �ִ� ���� ���� �丶����� ���� �丶���� ������ �޾� �Ͱ� �ȴ�.
	//�ϳ��� �丶���� ������ ���� ����, ������, ��, �� �� ���⿡ �ִ� �丶�並 �ǹ��Ѵ�. �밢�� ���⿡ �ִ� �丶��鿡�Դ� ������ ���� ���ϸ�,
	//�丶�䰡 ȥ�� ������ �ʹ� ���� ���ٰ� �����Ѵ�. ������ â�� ������ �丶����� ��ĥ�� ������ �� �Ͱ� �Ǵ���, �� �ּ� �ϼ��� �˰� �;� �Ѵ�.
	//�丶�並 â�� �����ϴ� ���ڸ���� ���ڵ��� ũ��� ���� �丶���� ���� ���� �丶����� ������ �־����� ��,
	//��ĥ�� ������ �丶����� ��� �ʹ���, �� �ּ� �ϼ��� ���ϴ� ���α׷��� �ۼ��϶�. ��, ������ �Ϻ� ĭ���� �丶�䰡 ������� ���� ���� �ִ�.

	//�Է�
	//ù �ٿ��� ������ ũ�⸦ ��Ÿ���� �� ���� M, N�� �־�����. M�� ������ ���� ĭ�� ��,
	//N�� ������ ���� ĭ�� ���� ��Ÿ����. ��, 2 �� M, N �� 1,000 �̴�.
	//��° �ٺ��ʹ� �ϳ��� ���ڿ� ����� �丶����� ������ �־�����.
	//��, ��° �ٺ��� N���� �ٿ��� ���ڿ� ��� �丶���� ������ �־�����.
	//�ϳ��� �ٿ��� ���� �����ٿ� ����ִ� �丶���� ���°� M���� ������ �־�����.
	//���� 1�� ���� �丶��, ���� 0�� ���� ���� �丶��, ���� -1�� �丶�䰡 ������� ���� ĭ�� ��Ÿ����.

	//���
	//�������� �丶�䰡 ��� ���� �������� �ּ� ��¥�� ����ؾ� �Ѵ�.
	//����, ����� ������ ��� �丶�䰡 �;��ִ� �����̸� 0�� ����ؾ� �ϰ�,
	//�丶�䰡 ��� ������ ���ϴ� ��Ȳ�̸� -1�� ����ؾ� �Ѵ�.
	static int m, n;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] board, dis;
	
	public void BFS() {
		Queue<PointM> Q = new LinkedList<>();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(board[i][j] == 1) Q.offer(new PointM(i, j));
			}
		}
		while(!Q.isEmpty()) {
			PointM tmp = Q.poll();
			for(int i = 0; i < 4; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					Q.offer(new PointM(nx, ny));
					dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_12_M T = new Ex08_12_M();
		Scanner kb = new Scanner(System.in);
		m = kb.nextInt();
		n = kb.nextInt();
		int cnt = 0;
		board = new int[n][m];
		dis = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				board[i][j] = kb.nextInt();
				if(board[i][j] == 0) cnt++;
			}
		}
		if(cnt == 0) System.out.println(0);
		else T.BFS();
		
		int answer = -1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(board[i][j] == 0) {
					System.out.println(-1);
					return;
				}
				if(dis[i][j] > answer) answer = dis[i][j];
			}
		}
		System.out.println(answer);
	}
}
