package a_string;

import java.util.ArrayList;
import java.util.Scanner;

class Ex01_05 {
	//설명
	//영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
	//특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
	
	//입력
	//첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
	
	//출력
	//첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
	public String solution(String str) {
		String answer = "";
		char[] array = str.toCharArray();

		ArrayList<Integer> n = new ArrayList<Integer>();
		
		for(int i = 0; i < array.length; i++) {
			if((array[i] >= 'A' && array[i] <= 'Z') || (array[i] >= 'a' && array[i] <= 'z')) {
				n.add(i);
			}
		}
		
		int lt = 0;
		int rt = n.size() - 1;
		
		for(int i = 0; i < n.size(); i++) {
			while(lt < rt) {
				int temp = n.get(lt);
				n.set(lt, n.get(rt));
				n.set(rt, temp);
				
				lt++; rt--;
			}
		}
		
		lt = 0;
		
		for(int i = 0; i < array.length; i++) {
			char tmp;
			
			if((array[i] >= 'A' && array[i] <= 'Z') || (array[i] >= 'a' && array[i] <= 'z')) {
				tmp = array[n.get(lt)];
				lt++;
			} else {
				tmp = array[i];
			}
			
			answer += tmp;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01_05 T = new Ex01_05();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.println(T.solution(str));
	}
}
