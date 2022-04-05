package g_recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex07_08_Review {
	//����
	//������ �۾����� �Ҿ���ȴ�. ������ �۾������� ��ġ�����Ⱑ �޷� �ִ�.
	//������ ��ġ�� �۾����� ��ġ�� ���������� ��ǥ ������ �־����� ������ ���� ��ġ���� �۾����� ��ġ���� ������ ���� ������� �̵��Ѵ�.
	//�۾����� �������� �ʰ� ���ڸ��� �ִ�.
	//������ ��ī�� ������ Ÿ�� ���µ� �� ���� ������ ������ 1, �ڷ� 1, ������ 5�� �̵��� �� �ִ�.
	//�ּ� �� ���� ������ ������ �۾����� ��ġ���� �� �� �ִ��� ���ϴ� ���α׷��� �ۼ��ϼ���.

	//�Է�
	//ù ��° �ٿ� ������ ��ġ S�� �۾����� ��ġ E�� �־�����. ������ ��ǥ ���� 1���� 10,000�����̴�.

	//���
	//������ �ּ�Ƚ���� ���Ѵ�. ���� 1�̻��̸� �ݵ�� �����մϴ�.
	public int solution(int s, int e) {					//s = 5, e = 14
		int L = 0;
		int[] dis = {1, -1, 5};
		int[] ch = new int[10001];
		Queue<Integer> Q = new LinkedList<>();
		Q.offer(s);
		ch[s] = 1;
		
		while(!Q.isEmpty()) {
			int len = Q.size();							//len = 1								| len = 3
			
			for(int i = 0; i < len; i++) {
				int x = Q.poll();						//x = 5									| x = 6								x = 4						x = 10
				
				for(int j = 0; j < dis.length; j++) {
					int nx = x + dis[j];				//nx = 6	 nx = 4      nx = 10        | nx = 7, 5, 11						nx = 5, 3, 9				nx = 11, 9, 15
					if(nx == e) return L+1;
					if(nx > 0 && nx < 10000 && ch[nx] == 0) {
						Q.offer(nx);					//Q = {6}	 Q = {6, 4}  Q = {6, 4, 10} | Q = {4, 10, 7, 5, 11}             Q = {10, 7, 5, 11, 3, 9}	Q = {7, 5, 11, 3, 9, 15}
						ch[nx] = 1;						//ch[6] = 1  ch[4] = 1   ch[10] = 1     | ch[7] = 1, ch[5] = 1, ch[11] = 1  ch[3] = 1, ch[9] = 1		ch[15] = 1
					}
				}
			}
			L++;										//L = 1									|																L = 2
		}
		return L;
	}
	
	public static void main(String[] args) {
		Ex07_08_Review T = new Ex07_08_Review();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int e = kb.nextInt();
		System.out.println(T.solution(s, e));
	}
}
