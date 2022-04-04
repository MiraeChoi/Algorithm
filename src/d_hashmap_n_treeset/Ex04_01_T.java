package d_hashmap_n_treeset;

import java.util.HashMap;
import java.util.Scanner;

class Ex04_01_T {
	//����
	//�б� ȸ���� �̴µ� �ĺ��� ��ȣ A, B, C, D, E �ĺ��� ����� �߽��ϴ�.
	//��ǥ�������� �� �л����� �ڱⰡ ������ �ĺ��� ��ȣ(���ĺ�)�� ������ ������ �������� �� ��ȣ�� ��ǥ�ϰ� �ֽ��ϴ�.
	//�������� ��ǥ�� ���� �� � ��ȣ�� �ĺ��� �б� ȸ���� �Ǿ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
	//�ݵ�� �� ���� �б�ȸ���� ����ǵ��� ��ǥ����� ���Դٰ� �����մϴ�.
	
	//�Է�
	//ù �ٿ��� �� �л��� N(5<=N<=50)�� �־����ϴ�.
	//�� ��° �ٿ� N���� ��ǥ������ ������ �ִ� �� �ĺ��� ��ȣ�� �������� ��ǥ�� ������� ���ڿ��� �Էµ˴ϴ�.
	
	//���
	//�б� ȸ������ ���õ� ��ȣ�� ����մϴ�.
	public char solution(int n, String s) {
		char answer = 'A';
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		System.out.println(map.containsKey('A'));
		System.out.println(map.remove('A'));
		System.out.println(map.size());
		
		int max = Integer.MIN_VALUE;
		
		for(char key : map.keySet()) {
//			System.out.println(key + "/" + map.get(key));
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex04_01_T T = new Ex04_01_T();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String s = kb.next();
		System.out.println(T.solution(n, s));
	}
}
