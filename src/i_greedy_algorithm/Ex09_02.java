package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Sort02 implements Comparable<Sort02> {
	int s, e;
	
	public Sort02(int s, int e) {
		this.s = s;
		this.e = e;
	}

	@Override
	public int compareTo(Sort02 o) {
		return this.s - o.s;
	}
}

class Ex09_02 {
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
	public int solution(int n, ArrayList<Sort02> arr) {
		int answer = Integer.MIN_VALUE;
		Collections.sort(arr);
		
		for(int i = 0; i < n; i++) {
			int cnt = 1;
			int tmp_i = i;
			
			for(int j = i+1; j < n; j++) {
				if(arr.get(i).e <= arr.get(j).s) {
					cnt++;
					i = j;
				}
			}
			answer = Math.max(answer, cnt);
			i = tmp_i;
		}		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex09_02 T = new Ex09_02();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Sort02> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			arr.add(new Sort02(kb.nextInt(), kb.nextInt()));
		}
		System.out.println(T.solution(n, arr));
	}
}
