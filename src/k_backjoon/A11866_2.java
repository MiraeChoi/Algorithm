package k_backjoon;

import java.io.IOException;
import java.util.ArrayList;

class A11866_2 {
	public static void main(String[] args) throws IOException {
		int N = read();									//7 3
		int K = read();
		int idx = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i <= N; i++) list.add(i);
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		for(int i = 0; i < N - 1; i++) {				//i=0, size<6		i=1				i=2				i=3				i=4				i=5
			idx = (idx + K - 1) % list.size();			//idx=(0+3-1)%7=2	idx=(2+3-1)%6=4	idx=(4+3-1)%5=1	idx=(1+3-1)%4=3	idx=(3+3-1)%3=2	idx=(2+3-1)%2=0
			sb.append(list.remove(idx)).append(", ");	//list=1 2 4 5 6 7	list=1 2 4 5 7	list=1 4 5 7	list=1 4 5		list=1 4		list=4
		}												//	   0 1 2 3 4 5		 0 1 2 3 4		 0 1 2 3		 0 1 2			 0 1			 0
		sb.append(list.remove(0)).append('>');			//list={}
		System.out.print(sb);
	}
	
	private static int read() throws IOException {
    	int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
	}
}