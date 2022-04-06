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
	
	public void DFS(int L, int s) {			//L=0, s=0		L=1, s=1		L=2, s=2      			  ... L=4, s=4
		if(L == m) {
			int sum = 0;
			for(Point15R cur : hs) {																	//cur.x=0, cur.y=1													cur.x=1, cur.y=0
				int dis = Integer.MAX_VALUE;
				for(int i : combi) {																	//i=combi[0] = 0	i=combi[1] = 1				... i=combi[4]		i=combi[0] = 0
					System.out.print(i + " ");
					dis = Math.min(dis, Math.abs(cur.x - pz.get(i).x) + Math.abs(cur.y - pz.get(i).y));//dis=|0-0|+|1-2|=1	dis=|0-1|+|1-2|=2 vs 1 = 1		dis = 1			dis=|1-0|+|0-2|=3
				}
				System.out.println();
				sum += dis;																																	//sum = 1
			}
			answer = Math.min(answer, sum);
		} else {
			for(int i = s; i < len; i++) { //i=0, i<6		i=1, i<6		i=2, i<6
				combi[L] = i;			   //combi[0] = 0	combi[1] = 1	combi[2] = 2
				DFS(L+1, i+1);			   //DFS(0+1, 0+1)	DFS(1+1, 1+1)	DFS(2+1, 2+1)
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
