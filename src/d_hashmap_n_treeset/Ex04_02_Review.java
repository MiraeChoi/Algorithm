package d_hashmap_n_treeset;

import java.util.HashMap;
import java.util.Scanner;

class Ex04_02_Review {
	//����
	//Anagram�̶� �� ���ڿ��� ���ĺ��� ���� ������ �ٸ����� �� ������ ��ġ�ϸ� �� �ܾ�� �Ƴ��׷��̶�� �մϴ�.
	//���� ��� AbaAeCe�� baeeACA�� ���ĺ��� ���� ������ �ٸ����� �� ������ ���캸�� A(2), a(1), b(1), C(1), e(2)��
	//���ĺ��� �� ������ ��� ��ġ�մϴ�. �� ��� �� �ܾ �� �迭�ϸ� ����� �ܾ �� �� �ִ� ���� �Ƴ��׷��̶� �մϴ�.
	//���̰� ���� �� ���� �ܾ �־����� �� �ܾ �Ƴ��׷����� �Ǻ��ϴ� ���α׷��� �ۼ��ϼ���. �Ƴ��׷� �Ǻ��� ��ҹ��ڰ� ���е˴ϴ�.
	
	//�Է�
	//ù �ٿ� ù ��° �ܾ �Էµǰ�, �� ��° �ٿ� �� ��° �ܾ �Էµ˴ϴ�.
	//�ܾ��� ���̴� 100�� ���� �ʽ��ϴ�.
	
	//���
	//�� �ܾ �Ƴ��׷��̸� ��YES"�� ����ϰ�, �ƴϸ� ��NO"�� ����մϴ�.
	public String solution(String s1, String s2) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : s1.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		for(char x : s2.toCharArray()) {
			if(!map.containsKey(x) || map.get(x) <= 0) return "NO";
			else map.put(x, map.get(x)-1);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex04_02_Review T = new Ex04_02_Review();
		Scanner kb = new Scanner(System.in);
		String s1 = kb.nextLine();
		String s2 = kb.nextLine();
		System.out.println(T.solution(s1, s2));
	}
}
