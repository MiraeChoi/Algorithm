package a_string;

import java.util.ArrayList;
import java.util.Scanner;

class Ex01_05 {
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
