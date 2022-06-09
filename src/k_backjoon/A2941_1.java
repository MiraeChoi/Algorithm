package k_backjoon;

import java.util.Scanner;

class A2941_1 {
	//입력 : dz=dz=dz=dz=
	//출력 : 9
	//정답 : 4
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String[] apb2 = {"c=", "c-", "d-", "lj", "nj", "s=", "z="};
		String apb3 = "dz=";
		String word = kb.next();
		int answer = word.length();
		
		if(word.contains(apb3)) answer -= 2;
		
		for(int i = 0; i < apb2.length; i++) {
			if(word.contains(apb2[i])) answer--;
		}
		System.out.println(answer);
	}
}
