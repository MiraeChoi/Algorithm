package z_doit_java;

class T05_07 {
	//8퀸 문제 : 퀸은 가로, 세로, 대각선방향으로 체스판 끝까지 움직일 수 있습니다.
	//해당 풀이는 모든 경우의 수
	static int[] pos = new int[8];
	
	static void print() {
		for(int i = 0; i < 8; i++) System.out.printf("%2d", pos[i]);
		System.out.println();
	}
	
	static void set(int i) {
		for(int j = 0; j < 8; j++) {
			pos[i] = j;
			if(i == 7) print();
			else set(i + 1);
		}
	}
	
	public static void main(String[] args) {
		set(0);
	}
}
