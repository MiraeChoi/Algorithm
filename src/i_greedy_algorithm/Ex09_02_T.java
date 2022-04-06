package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time02T implements Comparable<Time02T>{
	public int s, e;
	
	public Time02T(int s, int e) {
		this.s = s;
		this.e = e;
	}

	@Override
	public int compareTo(Time02T o) {
		if(this.e == o.e) return this.s - o.s;
		else return this.e - o.e;
	}
}

class Ex09_02_T {
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
	public int solution(ArrayList<Time02T> arr, int n) {
		int cnt = 0;
		Collections.sort(arr);
		int et = 0;
		
		for(Time02T ob : arr) {
			if(ob.s >= et) {
				cnt++;
				et = ob.e;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Ex09_02_T T = new Ex09_02_T();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Time02T> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int x = kb.nextInt();
			int y = kb.nextInt();
			arr.add(new Time02T(x, y));
		}
		System.out.println(T.solution(arr, n));
	}
}
