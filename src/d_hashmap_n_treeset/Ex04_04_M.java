package d_hashmap_n_treeset;

import java.util.HashMap;
import java.util.Scanner;

class Ex04_04_M {
	//����
	//S���ڿ����� T���ڿ��� �Ƴ��׷��� �Ǵ� S�� �κй��ڿ��� ������ ���ϴ� ���α׷��� �ۼ��ϼ���.
	//�Ƴ��׷� �Ǻ��� ��ҹ��ڰ� ���е˴ϴ�. �κй��ڿ��� ���ӵ� ���ڿ��̾�� �մϴ�.
	
	//�Է�
	//ù �ٿ� ù ��° S���ڿ��� �Էµǰ�, �� ��° �ٿ� T���ڿ��� �Էµ˴ϴ�.
	//S���ڿ��� ���̴� 10,000�� ���� ������, T���ڿ��� S���ڿ����� ���̰� �۰ų� �����ϴ�.
	
	//���
	//S�ܾ T���ڿ��� �Ƴ��׷��� �Ǵ� �κй��ڿ��� ������ ����մϴ�.
	public int solution(String s, String t) {
		int answer = 0;
		HashMap<Character, Integer> am = new HashMap<>();
		HashMap<Character, Integer> bm = new HashMap<>();
		
		for(int i = 0; i < t.length(); i++) bm.put(t.charAt(i), bm.getOrDefault(t.charAt(i), 0)+1);
		for(int i = 0; i < t.length()-1; i++) am.put(s.charAt(i), am.getOrDefault(s.charAt(i), 0)+1);
		
		int lt = 0;
		
		for(int rt = t.length()-1; rt < s.length(); rt++) {
			am.put(s.charAt(rt), am.getOrDefault(s.charAt(rt), 0)+1);
			
			if(am.equals(bm)) answer++;
			am.put(s.charAt(lt), am.get(s.charAt(lt))-1);
			
			if(am.get(s.charAt(lt)) == 0) am.remove(s.charAt(lt));
			lt++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex04_04_M T = new Ex04_04_M();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		String t = kb.next();
		System.out.println(T.solution(s, t));
	}
}
