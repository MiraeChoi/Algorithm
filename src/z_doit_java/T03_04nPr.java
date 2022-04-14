package z_doit_java;

import java.util.Scanner;

class T03_04nPr {
	static int binSearch(int[] x, int key) {	//x = {15, 27, 39, 77, 92, 108, 121}, key = 39
		int pl = 0;
		int pr = x.length - 1;
		
		do {
			int pc = (pl + pr) / 2;				//pc = (0+6)/2 = 3		pc = (0+2)/2 = 1	pc = (2+2)/2 = 2
			if(x[pc] == key) return pc;			//x[3] = 77 != 39		x[1] = 27			x[2] = 39 > return 2;
			else if(x[pc] < key) pl = pc + 1;	//						pl = 1 + 1 = 2
			else pr = pc - 1;					//pr = 3 - 1 = 2;
		} while(pl <= pr);						//pl = 0, pr = 2		pl = 2, pr = 2
		
		return -1;
	}
	
	static int searchIdx(int[] x, int key, int[] idx) {
		System.out.print("   |");
		for(int i = 0; i < x.length; i++) System.out.printf("%3s%d", "", i);
		System.out.print("\n---+");
		for(int i = 0; i < x.length; i++) System.out.printf("----");
		System.out.println("---");
		
		int pl = 0, pr = x.length - 1;
		int i = 0;
		do {
			int pc = (pl + pr) / 2;
			System.out.print("　　| <-");
			for(int j = 0; j < pc; j++) System.out.printf("%3s", "");
			System.out.print("+");
			for(int j = 0; j < pc; j++) System.out.printf("%3s", "");
			System.out.println("->");
			System.out.print(" " + pc + " |");
			for(int j = 0; j < x.length; j++) System.out.printf("　%d　", x[j]);
			System.out.println();
			
			if(x[pc] == key) {
				idx[i] = pc;
				//i++;
				break;
			} else if(x[pc] < key) {
				pl = pc + 1;
			} else pr = pc - 1;
		} while(pl <= pr);
		
		for(int j = idx.length-1; j >= 0; j--) {
			if(idx[j] != 0) return j + 1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int n = kb.nextInt();
		int[] x = new int[n];
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0] : ");
		x[0] = kb.nextInt();
		for(int i = 1; i < x.length; i++) {
			do {
				System.out.printf("x[%d] : ", i);
				x[i] = kb.nextInt();
			} while(x[i] < x[i-1]);
		}	
			
		System.out.print("검색할 값 : ");
		int key = kb.nextInt();
		int idx = binSearch(x, key);
		int[] tmp = new int[n];
		int answer = searchIdx(x, key, tmp);
		
		if(idx == -1) System.out.println("그 값의 요소가 없습니다.");
		else System.out.printf("%d(은)는 x[%d]에 있습니다.\n", key, idx);
		
		System.out.println("answer : " + answer);
	}
}
