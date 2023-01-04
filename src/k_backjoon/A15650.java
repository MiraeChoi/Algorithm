package k_backjoon;

import java.io.IOException;

class A15650 {											//★				◆			●			♬				●			♬				◆			○			♬				◆			★			◎			▣			♪				◎			◈
	//맞았습니다!!
	static int N, M;									//N=4, M=3
	static int[] arr;									//arr={}		arr={1}		arr={1,2}	arr={1,2,3}		arr={1,2}	arr={1,2,4}		arr={1}		arr={1,3}	arr={1,3,4}		arr={1}		arr={}		arr={2}		arr={2,3}	arr={2,3,4}		arr={2}		arr={2,4}	arr={}		arr={3}
	static StringBuilder sb = new StringBuilder();
	
	private static void DFS(int idx, int L) {			//idx=0, L=0	idx=1, L=1	idx=2, L=2	idx=3, L=3		idx=2, L=2	idx=4, L=3		idx=1, L=1	idx=3, L=2	idx=4, L=3		idx=1, L=1	idx=0, L=0	idx=2, L=1	idx=3, L=2	idx=4, L=3		idx=2, L=1	idx=4, L=2	idx=0, L=0	idx=3, L=1
		if(L == M) {
			for(int x : arr) sb.append(x).append(' ');	//										append(1 2 3)				append(1 2 4)							append(1 3 4)													append(2 3 4)
			sb.append('\n');
		} else {
			for(int i = idx; i < N; i++) {				//i=0, i<4		i=1, i<4	i=2, i<4					i=3, i<4					i=2, i<4	i=3, i<4					i=3, i<4	i=1, i<4	i=2, i<4	i=3, i<4					i=3, i<4				i=2, i<4	...
				arr[L] = i + 1;							//arr[0]=1		arr[1]=2	arr[2]=3					arr[2]=4					arr[1]=3	arr[2]=4					arr[1]=4	arr[0]=2	arr[1]=3	arr[2]=4					arr[1]=4				arr[0]=3
				DFS(i + 1, L + 1);						//DFS(1, 1)		DFS(2, 2)	DFS(3, 3)					DFS(4, 3)					DFS(3, 2)	DFS(4, 3)					DFS(4, 2)	DFS(2, 1)	DFS(3, 2)	DFS(4, 3)					DFS(4, 2)				DFS(3, 1)
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		N = readInt();
		M = readInt();
		arr = new int[M];
		DFS(0, 0);
		System.out.println(sb);
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