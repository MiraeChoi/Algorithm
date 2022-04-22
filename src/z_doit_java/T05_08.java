package z_doit_java;

class T05_08 {
	//8퀸 문제 : 퀸은 가로, 세로, 대각선방향으로 체스판 끝까지 움직일 수 있습니다.
	//해당 풀이는 8룩 문제(가로, 세로만)
	static int num = 4;
	static boolean[] flag = new boolean[num];
	static int[] pos = new int[num];
	
	static void print() {
		for(int i = 0; i < num; i++) System.out.printf("%2d", pos[i]);
		System.out.println();
	}
	
	static void set(int i) {
		for(int j = 0; j < num; j++) {	//i=0, j=0		i=1, j=0	i=1, j=1		i=2, j=2		i=3, j=0		i=3, j=1 2 3			i=2, j=2			i=2, j=3		i=3, j=0 1 2
			if(flag[j] == false) {																					//flag[1]=[2]=[3]=true
				pos[i] = j;				//pos[0]=0					pos[1]=1		pos[2]=2		pos[3]=3													pos[2]=3		pos[3]=2
				if(i == num-1) print();																//syso(0 1 2 3)																syso(0 1 3 2)
				else {
					flag[j] = true;		//flag[0]=true				flag[1]=true	flag[2]=true																flag[2]=true
					set(i + 1);			//set(1)					set(2)			set(3)																		set(3)
					flag[j] = false;																										//flag[2]=false
				}
			}
		}
	}
	
	public static void main(String[] args) {
		set(0);
	}
}
