package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A2447_2 {
	static StringBuilder[] sb;
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String s = String.format("%" + N + "s", ' ').replace(' ', '*');
		sb = new StringBuilder[N];
		
		for(int i = 0; i < N; i++) sb[i] = new StringBuilder(s);
		star(0, 0, N, false);
		for(int i = 0; i < N; i++) System.out.println(sb[i]);
	}
 
	static void star(int x, int y, int N, boolean blank) {	//x=0, y=0, N=9, false	x=0, y=0, N=3, false																							x=1, y=1, N=1, true																													x=3, y=3, N=3, true
		if(blank) {
			for(int i = x; i < x + N; i++) {				//																																		i = 1; i < 2; i++																													i = 3; i < 6; i++
				for(int j = y; j < y + N; j++) sb[i].setCharAt(j, ' ');	//																															j = 1; j < 2; j++																													j = 3; j < 6; j++
			}												//																																		sb[1].charAt(1, ' ');																												sb[3~5].charAt(3~5, ' ');	
			return;
		}
		// 더이상 쪼갤 수 없는 블록일 때
		if(N == 1) return;
		
		/*
		   N=27 일 경우 한 블록의 사이즈는 9이고, 
		   N=9 일 경우 한 블록의 사이즈는 3이듯
		   해당 블록의 한 칸을 담을 변수를 의미 size
           
		   count는 별 출력 누적을 의미
		 */
 
		int size = N / 3;									//size = 9/3 = 3		size = 3/3 = 1					size = 3/3 = 1																						size = 9/3 = 3							size = 9/3 = 3				size = 9/3 = 3				size = 9/3 = 3									size = 9/3 = 3
		int count = 0;
		for(int i = x; i < x + N; i += size) {				//i = 0, i < 9; i += 3	i = 0, i < 3; i += 1											i = 1, i < 3			i = 1, i < 3								i = 0, i < 9; i += 3					i = 0, i < 9; i += 3		i = 3, i < 9; i += 3		i = 3, i < 9; i += 3							i = 3, i < 9; i += 3
			for(int j = y; j < y + N; j += size) {			//j = 0, j < 9; j += 3	j = 0, j < 3; j += 1			j = 1, j < 3	j = 2, j < 3	j = 0, j < 3; j += 1	j = 1, j < 3; j += 1						j = 3, j < 9; j += 3					j = 6, j < 9; j += 3		j = 0, j < 9; j += 3		j = 3, j < 9; j += 3							j = 6, j < 9; j += 3
				count++;									//cnt = 1				cnt = 1							cnt = 2			cnt = 3			cnt = 4					cnt = 5										cnt = 2									cnt = 3						cnt = 4						cnt = 5											cnt = 6
				//공백 칸일 경우
				if(count == 5) star(i, j, size, true);		//																												star(1, 1, 1, true)														↗아닐수도있으니다시해보자													star(3, 3, 3, true)
				else star(i, j, size, false);				//star(0, 0, 3, false)	star(0, 0, 1, false) -> return	0 1 1 f > r		0 2 1 f > r		1 0 1 f > r															star(0, 3, 3, false) -> 어차피 다 return	star(0, 6, 3, false) > r	star(3, 0, 3, false) > r													star(3, 6, 3, false)
			}
		}
	}
}
