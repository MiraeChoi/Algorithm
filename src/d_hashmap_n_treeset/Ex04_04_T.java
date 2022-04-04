package d_hashmap_n_treeset;

import java.util.HashMap;
import java.util.Scanner;

class Ex04_04_T {
	//����
	//S���ڿ����� T���ڿ��� �Ƴ��׷��� �Ǵ� S�� �κй��ڿ��� ������ ���ϴ� ���α׷��� �ۼ��ϼ���.
	//�Ƴ��׷� �Ǻ��� ��ҹ��ڰ� ���е˴ϴ�. �κй��ڿ��� ���ӵ� ���ڿ��̾�� �մϴ�.
	
	//�Է�
	//ù �ٿ� ù ��° S���ڿ��� �Էµǰ�, �� ��° �ٿ� T���ڿ��� �Էµ˴ϴ�.
	//S���ڿ��� ���̴� 10,000�� ���� ������, T���ڿ��� S���ڿ����� ���̰� �۰ų� �����ϴ�.
	
	//���
	//S�ܾ T���ڿ��� �Ƴ��׷��� �Ǵ� �κй��ڿ��� ������ ����մϴ�.
	public int solution(String a, String b) {
		int answer = 0;
		HashMap<Character, Integer> am = new HashMap<>();
		HashMap<Character, Integer> bm = new HashMap<>();
		
		for(char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0)+1);
		
		int L = b.length() - 1;
		for(int i = 0; i < L; i++) am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0)+1);
		
		int lt = 0;
		for(int rt = L; rt < a.length(); rt++) {
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0)+1);
			
			if(am.equals(bm)) answer++;
			am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
			
			if(am.get(a.charAt(lt)) == 0) am.remove(a.charAt(lt));
			lt++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex04_04_T T = new Ex04_04_T();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		System.out.println(T.solution(a, b));
	}
}
