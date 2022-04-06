package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Sort03M implements Comparable<Sort03M>{
	int time; char state;
	
	public Sort03M(int time, char state) {
		this.time = time;
		this.state = state;
	}

	@Override
	public int compareTo(Sort03M o) {
		if(this.time == o.time) return this.state - o.state;
		else return this.time - o.time;
	}
}

class Ex09_03_M {
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
	public int solution(int n, ArrayList<Sort03M> arr) {
		int answer = 0;
		Collections.sort(arr);
		int cnt = 0;
		int time = 0;
		
		for(Sort03M ob : arr) {
			if(ob.time >= time && ob.state == 'e') cnt--;
			if(ob.time >= time && ob.state == 's') cnt++;
			answer = Math.max(answer, cnt);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex09_03_M T = new Ex09_03_M();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Sort03M> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			arr.add(new Sort03M(kb.nextInt(), 's'));
			arr.add(new Sort03M(kb.nextInt(), 'e'));
		}
		System.out.println(T.solution(n, arr));
	}
}
