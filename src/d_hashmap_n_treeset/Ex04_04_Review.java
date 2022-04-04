package d_hashmap_n_treeset;

import java.util.HashMap;
import java.util.Scanner;

class Ex04_04_Review {
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
		HashMap<Character, Integer> sm = new HashMap<>();
		HashMap<Character, Integer> tm = new HashMap<>();
		
		for(char x : t.toCharArray()) tm.put(x, tm.getOrDefault(x, 0)+1);
		
		int leng = t.length()-1;
		for(int i = 0; i < leng; i++) sm.put(s.charAt(i), sm.getOrDefault(s.charAt(i), 0)+1);
		
		int lt = 0;
		for(int rt = leng; rt < s.length(); rt++) {
			sm.put(s.charAt(rt), sm.getOrDefault(s.charAt(rt), 0)+1);
			
			if(sm.equals(tm)) answer++;
			
			sm.put(s.charAt(lt), sm.get(s.charAt(lt))-1);
			if(sm.get(s.charAt(lt)) == 0) sm.remove(s.charAt(lt));
			lt++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex04_04_Review T = new Ex04_04_Review();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		String t = kb.next();
		System.out.println(T.solution(s, t));
	}
}
