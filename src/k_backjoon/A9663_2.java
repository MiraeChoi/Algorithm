package k_backjoon;

import java.io.IOException;

class A9663_2 {
	//맞았습니다!!
	static int N, answer = 0;						//N=4
	static int[] chess;								//				{0}					{0,0}			{0,1}		{0,2}		{0,2,0}		{0,2,1}		{0,2,2}		{0,2,3}
	
	private static void queen(int num) {			//num=0			num=1				num=1			num=1		num=2		num=2		num=2		num=2		num=1
		if(num == N) {
			answer++;
			return;
		} else {
			for(int i = 0; i < N; i++) {			//i=0			i=0					i=1				i=2			i=0			i=1			i=2			i=3			i=3
				chess[num] = i;						//chess[0]=0	chess[1]=0			chess[1]=1		chess[1]=2	chess[2]=0	chess[2]=1	chess[2]=2	chess[2]=3	chess[1]=3
				if(possibility(num)) queen(num + 1);//queen(1)		false1				false2			queen(2)	false1		false2		false1		false2		queen(2)
			}
		}
	}
	
	private static boolean possibility(int col) {
		for(int i = 0; i < col; i++) {
			if(chess[col] == chess[i]) return false;//				chess[1]=chess[0]
			else if(Math.abs(col - i) == Math.abs(chess[col] - chess[i])) return false;	//0==0
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		N = readInt();
		chess = new int[N];
		queen(0);
		System.out.println(answer);
	}
	
	private static int readInt() throws IOException {
		int n = 0;
		while(true) {
			int input = System.in.read();
			if(input <= 32) return n;
			else n = (n << 3) + (n << 1) + (input & 15);
		}
	}
}