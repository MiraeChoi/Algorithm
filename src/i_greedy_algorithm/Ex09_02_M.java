package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Sort02M implements Comparable<Sort02M> {
	int s, e;
	
	public Sort02M(int s, int e) {
		this.s = s;
		this.e = e;
	}

	@Override
	public int compareTo(Sort02M o) {
		if(o.e == this.e) return this.s - o.s;
		else return this.e - o.e;
	}
}

class Ex09_02_M {
	//����
	//�� ���� ȸ�ǽ��� �ִµ� �̸� ����ϰ��� �ϴ� n���� ȸ�ǵ鿡 ���Ͽ� ȸ�ǽ� ���ǥ�� ������� �Ѵ�.
	//�� ȸ�ǿ� ���� ���۽ð��� ������ �ð��� �־��� �ְ�, �� ȸ�ǰ� ��ġ�� �ʰ� �ϸ鼭 ȸ�ǽ��� ����� �� �ִ� �ִ���� ȸ�Ǹ� ã�ƶ�.
	//��, ȸ�Ǵ� �ѹ� �����ϸ� �߰��� �ߴܵ� �� ������ �� ȸ�ǰ� ������ �Ͱ� ���ÿ� ���� ȸ�ǰ� ���۵� �� �ִ�.
	
	//�Է�
	//ù° �ٿ� ȸ���� �� n(1<=n<=100,000)�� �־�����. ��° �ٺ��� n+1 �ٱ��� �� ȸ���� ������ �־����µ�
	//�̰��� ������ ���̿� �ΰ� ȸ���� ���۽ð��� ������ �ð��� �־�����. ȸ�ǽð��� 0�ú��� �����Ѵ�.
	//ȸ���� ���۽ð��� ������ �ð��� ������ (���۽ð� <= ������ �ð�)�Դϴ�.
	
	//���
	//ù° �ٿ� �ִ� ����� �� �ִ� ȸ�� ���� ����Ͽ���.
	public int solution(int n, ArrayList<Sort02M> arr) {
		int answer = Integer.MIN_VALUE;
		Collections.sort(arr);
		
		for(int i = 0; i < n; i++) {
			int cnt = 1;
			int tmpi = i;
			
			for(int j = i+1; j < n; j++) {
				if(arr.get(i).e <= arr.get(j).s) {
					cnt++;
					i = j;
				}
			}
			
			answer = Math.max(answer, cnt);
			i = tmpi;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex09_02_M T = new Ex09_02_M();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Sort02M> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			arr.add(new Sort02M(kb.nextInt(), kb.nextInt()));
		}
		System.out.println(T.solution(n, arr));
	}
}
