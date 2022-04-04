package e_stack_n_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex05_07_Review {
	//����
	//������ 1�� ������ ������ȹ�� ¥�� �մϴ�.
	//�����߿��� �ʼ������� �ֽ��ϴ�. �� �ʼ������� �ݵ�� �̼��ؾ� �ϸ�, �� ������ ������ �ֽ��ϴ�.
	//���� �� ������ A, B, C, D, E, F, G�� �ְ�, ���⼭ �ʼ������� CBA�� �־����� �ʼ������� C, B, A�����̸� �� ������� �� ������ȹ�� ¥�� �մϴ�.
	//���⼭ ������ B������ C������ �̼��� �Ŀ� ���� �ϰ�, A������ C�� B�� �̼��� �Ŀ� ���� �Ѵٴ� ���Դϴ�.
	//������ C, B, D, A, G, E�� ������ȹ�� ¥�� ����� �� ����������
	//C, G, E, A, D, B ������ ®�ٸ� �� �� ����� ������ȹ�� �˴ϴ�.
	//������ȹ�� �� ������� �տ� ������ �̼��Ǹ� ���� ������ �����ϴٴ� ������ �ؼ��մϴ�.
	//������ȹ������ �� ������ ������ �̼��ȴٰ� �����մϴ�.
	//�ʼ���������� �־����� ������ § N���� �������谡 �ߵ� ���̸� "YES", �߸��� ���̸� "NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
	
	//�Է�
	//ù �ٿ� �� �ٿ� �ʼ������� ������ �־����ϴ�. ��� ������ ���� �빮���Դϴ�.
	//�� ��° �ٺ��� ������ § �������谡 �־����ϴ�.(���������� ���̴� 30 �����̴�)
	
	//���
	//ù �ٿ� �������谡 �ߵ� ���̸� "YES", �߸��� ���̸� "NO"�� ����մϴ�.
	public String solution(String need, String plan) {
		String answer = "YES";
		Queue<Character> q = new LinkedList<>();
		
		for(char x : need.toCharArray()) q.offer(x);
		for(char x : plan.toCharArray()) {
			if(q.contains(x)) {
				if(x != q.poll()) return "NO";
			}
		}
		
		if(!q.isEmpty()) return "NO";
		return answer;
	}
	
	public static void main(String[] args) {
		Ex05_07_Review T = new Ex05_07_Review();
		Scanner kb = new Scanner(System.in);
		String s1 = kb.next();
		String s2 = kb.next();
		System.out.println(T.solution(s1, s2));
	}
}
