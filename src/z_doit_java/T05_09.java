package z_doit_java;

class T05_09 {
	//8퀸 문제 : 퀸은 가로, 세로, 대각선방향으로 체스판 끝까지 움직일 수 있습니다.
	static int num = 4;
	static boolean[] flag_a = new boolean[num];
	static boolean[] flag_b = new boolean[num * 2 - 1];
	static boolean[] flag_c = new boolean[num * 2 - 1];
	static int[] pos = new int[num];
	
	static void print() {
		for(int i = 0; i < num; i++) System.out.printf("%2d", pos[i]);
		System.out.println();
	}
	
	static void set(int i) {
		for(int j = 0; j < num; j++) {
			if(!flag_a[j] && !flag_b[i+j] && !flag_c[i-j+(num-1)]) {
				pos[i] = j;
				
				if(i == num-1) print();
				else {
					flag_a[j] = flag_b[i+j] = flag_c[i-j+(num-1)] = true;
					set(i+1);
					flag_a[j] = flag_b[i+j] = flag_c[i-j+(num-1)] = false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		set(0);
	}
}
