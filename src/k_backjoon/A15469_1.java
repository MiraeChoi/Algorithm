package k_backjoon;

import java.io.IOException;

class A15469_1 {
	//�¾ҽ��ϴ�!!
	static int N, M;
	static int[] arr, ch;
	
	static void DFS(int L) {
		if(L == M) {
			for(int x : arr) System.out.print(x + " ");
			System.out.println();
		} else {
			for(int i = 0; i < N; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					arr[L] = i + 1;
					DFS(L+1);
					ch[i] = 0;
				}
			}
		}
	}
	
	static int readInt() throws IOException {
		int n = 0;
		while(true) {
			int input = System.in.read();
			if(input <= 32) return n;
			else n = (n << 3) + (n << 1) + (input & 15);
		}
	}
	
	public static void main(String[] args) throws IOException {
		N = readInt();
		M = readInt();
		//��� ��츦 Ž���ϴ� ��Ʈ��ŷ �˰��� �Թ� ����
		ch = new int[N];
		arr = new int[M];
		DFS(0);
	}
}