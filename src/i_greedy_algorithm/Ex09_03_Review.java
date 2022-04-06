package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Sort03R implements Comparable<Sort03R>{
	int t; char s;
	
	public Sort03R(int t, char s) {
		this.t = t;
		this.s = s;
	}
	
	@Override
	public int compareTo(Sort03R o) {
		if(this.t == o.t) return this.s - o.s;
		else return this.t - o.t;
	}
}

class Ex09_03_Review {
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
	public int solution(ArrayList<Sort03R> arr) {
		int answer = 0;
		Collections.sort(arr);
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i).s + "/" + arr.get(i).t);
		}
		int cnt = 0;
		
		for(Sort03R ob : arr) {
			if(ob.s == 's') cnt++;
			else cnt--;
			answer = Math.max(answer, cnt);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex09_03_Review T = new Ex09_03_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Sort03R> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			arr.add(new Sort03R(kb.nextInt(), 's'));
			arr.add(new Sort03R(kb.nextInt(), 'e'));
		}
		System.out.println(T.solution(arr));
	}
}
