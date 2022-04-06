package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time03T implements Comparable<Time03T>{
	public int time; public char state;
	
	public Time03T(int time, char state) {
		this.time = time;
		this.state = state;
	}

	@Override
	public int compareTo(Time03T ob) {
		if(this.time == ob.time) return this.state - ob.state;
		else return this.time - ob.time;
	}
}

class Ex09_03_T {
	//����
	//������ ���� �޿� ��ȥ�� �մϴ�.
	//������ ��ȥ�� �Ƿο��� ��Ҹ� ���� 3�ϰ� ���� �ʰ� �Ϸ��� �մϴ�.
	//�Ƿο��� �����ϴ� ģ���� N���� �����ϴ� �ð������� ������ ģ���鿡�� �̸� �䱸�߽��ϴ�.
	//�� ģ������ �ڽ��� �� �ÿ� �����ؼ� �� �ÿ� ���� ������ �������� �˷��־����ϴ�.
	//������ �� ������ �������� �Ƿο� ��ҿ� ���ÿ� �����ϴ� �ִ� �ο����� ���Ͽ� �� �ο��� ������ �� �ִ� ��Ҹ� �������� �մϴ�. �������� ������ �����ּ���.
	//���� �� ģ���� ���� �ð� 13, ���� �ð� 15��� �� ģ���� 13�� ������ �Ƿο� �忡 �����ϴ� ���̰� 15�� �������� �������� �ʴ´ٰ� �����մϴ�.
	
	//�Է�
	//ù° �ٿ� �Ƿο��� ������ �ο��� N(5<=N<=100,000)�� �־����ϴ�.
	//�� ��° �ٺ��� N�ٿ� ���� �� �ο��� ���� �ð��� ���� �ð��� �־����ϴ�.
	//�ð��� ù�� 0�ø� 0���� �ؼ� �������� �� 12�ø� 72�� �ϴ� Ÿ�Ӷ������� ���� �ð��� ���� �ð��� ���� �ƴ� ������ ǥ���˴ϴ�.
	
	//���
	//ù° �ٿ� �Ƿο��忡 ���ÿ� �����ϴ� �ִ� �ο��� ����ϼ���.
	public int solution(ArrayList<Time03T> arr) {
		int answer = Integer.MIN_VALUE;
		Collections.sort(arr);
		int cnt = 0;
		
		for(Time03T ob : arr) {
			if(ob.state == 's') cnt++;
			else cnt--;
			answer = Math.max(answer, cnt);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex09_03_T T = new Ex09_03_T();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Time03T> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int sT = kb.nextInt();
			int eT = kb.nextInt();
			arr.add(new Time03T(sT, 's'));
			arr.add(new Time03T(eT, 'e'));
		}
		System.out.println(T.solution(arr));
	}
}
 