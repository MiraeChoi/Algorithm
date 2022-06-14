package k_backjoon;

import java.util.Scanner;

class A2941_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int answer = 0;
		
		for(int i = 0; i < word.length(); i++) {
			System.out.println("i : " + i);
			if(i < word.length()-1) {
				String tmp = word.charAt(i) + "" + word.charAt(i+1);
				
				if(tmp.equals("dz")) {
					if(i < word.length()-2) tmp += word.charAt(i+2);
					else {
						answer += 2;
						break;
					}
					if(tmp.equals("dz=")) i += 2;
					else {
						answer++;
						i++;
					}
				} else if(tmp.equals("c=") || tmp.equals("c-") || tmp.equals("d-") || tmp.equals("lj")
						|| tmp.equals("nj") || tmp.equals("s=") || tmp.equals("z=")) {
					i += 1;
				}
			}
			answer++;
		}
		System.out.println(answer);
	}
}
