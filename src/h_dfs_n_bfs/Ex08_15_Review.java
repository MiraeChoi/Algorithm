package h_dfs_n_bfs;

import java.util.ArrayList;
import java.util.Scanner;

class Point15R {
	int x, y;
	
	public Point15R(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Ex08_15_Review {
	//����
	//N��N ũ���� ���������� �ֽ��ϴ�. ���������� 1��1ũ���� ����ĭ���� �̷���� �ֽ��ϴ�.
	//�� ����ĭ���� 0�� ��ĭ, 1�� ��, 2�� ���������� ǥ���˴ϴ�. �� ����ĭ�� ��ǥ(���ȣ, �� ��ȣ)�� ǥ���˴ϴ�.
	//���ȣ�� 1������ N�������̰�, �� ��ȣ�� 1���� N�����Դϴ�.
	//���ÿ��� �� ������ "���ڹ�ްŸ�"�� �Ҵµ� �� ���� ���ڹ�ްŸ��� �ش� ���� ������ �����ϴ�
	//����������� �Ÿ� �� �ּҰ��� �ش� ���� "���ڹ�ްŸ�"��� �Ѵ�.
	//���� �������� ���ڹ�ްŸ��� |x1-x2|+|y1-y2| �̴�.
	//���� ���, ������ ������ �Ʒ��� ���ٸ�
	//0 1 0 0
	//0 0 2 1
	//0 0 1 0
	//1 2 0 2
	//(1, 2)�� �ִ� ���� (2, 3)�� �ִ� ���������� ���� ��� �Ÿ��� |1-2| + |2-3| = 2�� �ȴ�.
	//�ֱ� ���ð� �Ұ�⿡ ������ �����׼� ����� ���������� �Ļ��ϰ� �ֽ��ϴ�.
	//���� ������ ���ÿ� �ִ� ������ �� M���� �츮�� �������� �������� �ְ� �����Ű���� �մϴ�.
	//������ �츮���� �ϴ� ������ M���� �����ϴ� �������� ������ ���ڹ�ްŸ��� �ּҰ� �Ǵ� M���� �������� �����Ϸ��� �մϴ�.
	//������ ���� ��� �Ÿ��� �� ������ ���� ��� �Ÿ��� ���� ���� ���մϴ�.
	
	//�Է�
	//ù° �ٿ� N(2 �� N �� 50)�� M(1 �� M �� 12)�� �־�����.
	//��° �ٺ��� ���� ������ �Էµȴ�.
	
	//���
	//ù° �ٿ� M���� �������� ���õǾ��� �� ������ �ּ� ���ڹ�ްŸ��� ����Ѵ�.
	static int n, m, len, answer = Integer.MAX_VALUE;
	static int[] combi;
	static ArrayList<Point15R> hs, pz;
	
	public void DFS(int L, int s) {			//L=0, s=0		L=1, s=1		L=2, s=1      ... L=6, s=1
		if(L == m) {
			int sum = 0;
			for(Point15R cur : hs) {
				int dis = Integer.MAX_VALUE;
				for(int i : combi) {
					dis = Math.min(dis, Math.abs(cur.x - pz.get(i).x) + Math.abs(cur.y - pz.get(i).y));
				}
				sum += dis;
			}
			answer = Math.min(answer, sum);
		} else {
			for(int i = s; i < len; i++) { //i=0, i<6		i=0, i<6		i=0, i<6
				combi[L] = i;			   //combi[0] = 0	combi[1] = 0	combi[2] = 0
				DFS(L+1, i+1);			   //DFS(0+1, 0+1)	DFS(1+1, 0+1)	DFS(2+1, 0+1)
			}
		}
	}
	
	public static void main(String[] args) {
		Ex08_15_Review T = new Ex08_15_Review();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		hs = new ArrayList<>();
		pz = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				int tmp = kb.nextInt();
				if(tmp == 1) hs.add(new Point15R(i, j));
				else if(tmp == 2) pz.add(new Point15R(i, j));
			}
		}
		combi = new int[m];
		len = pz.size();
		T.DFS(0, 0);
		System.out.println(answer);
	}
}
