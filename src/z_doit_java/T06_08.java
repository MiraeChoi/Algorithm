package z_doit_java;

import java.util.Scanner;

class T06_08 {
	static void partition(int[] arr, int n) {//arr={1, 8, 7, 4, 5, 2, 6, 3, 9}, n=9
		int pl = 0;
		int pr = n-1;
		int pivot = arr[n/2];				//arr[4]=5
		
		do {
			while(arr[pl] < pivot) pl++;	//arr[0]=1<5, pl=1	arr[1]=8>5
			while(arr[pr] > pivot) pr--;	//arr[8]=9>5, pr=7	arr[7]=3<5
			System.out.println("pl & pr(1) : " + pl + "/" + pr);
			if(pl <= pr) {					//1<7
				int tmp = arr[pl];			//tmp=arr[1]=8
				arr[pl] = arr[pr];			//arr[1]=arr[7]
				arr[pr] = tmp;				//arr[7]=arr[1]
				pl++; pr--;					//pl=2, pr=6
			}
		} while(pl <= pr);
		
		System.out.println("pl & pr(2) : " + pl + "/" + pr);
		
		System.out.printf("피벗의 값은 %d입니다.\n", pivot);
		System.out.println("피벗 이하의 그룹");
		for(int i = 0; i <= pl-1; i++) System.out.print(arr[i] + " ");
		System.out.println();
		
		if(pl > pr+1) {
			System.out.println("피벗과 일치하는 그룹");
			for(int i = pr+1; i <= pl-1; i++) System.out.print(arr[i] + " ");
			System.out.println();
		}
		
		System.out.println("피벗 이상의 그룹");
		for(int i = pr+1; i < n; i++) System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("배열을 나눕니다.");
		System.out.print("요소 수 : ");
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("arr[%d] : ", i);
			arr[i] = kb.nextInt();
		}
		partition(arr, n);
	}
}
