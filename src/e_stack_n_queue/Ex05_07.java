package e_stack_n_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex05_07 {
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
	public String solution(String s1, String s2) {
		String answer = "";
		Queue<Character> q1 = new LinkedList<>();
		Queue<Character> q2 = new LinkedList<>();
		
		for(int i = 0; i < s1.length(); i++) q1.offer(s1.charAt(i));
		for(int i = 0; i < s2.length(); i++) q2.offer(s2.charAt(i));
		
		while(q2.size() > 0) {
			if(q1.peek() == q2.peek()) {
				answer += q2.poll();
				q1.poll();
			} else {
				q2.poll();
			}
		}
		
		if(answer.equals(s1)) answer = "YES";
		else answer = "NO";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex05_07 T = new Ex05_07();
		Scanner kb = new Scanner(System.in);
		String s1 = kb.next();
		String s2 = kb.next();
		System.out.println(T.solution(s1, s2));
	}
}
