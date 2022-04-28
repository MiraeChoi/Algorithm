package z_doit_java;

import java.util.Scanner;

class T06_06 {
	static void shellSort(int[] arr, int n) {	//n=7, arr={22, 5, 11, 32, 120, 68, 70}																{5, 5, 11, ...}																	{22, 5, 11, 32, 68, 120, 70}
		int cnt = 0;
		for(int i = n/2; i > 0; i/=2) {						//i=3																	i=1
			for(int j = i; j < n; j++) {					//j=3				j=4				 j=5			 j=6				j=1								j=2								j=3				j=4				j=5								j=6
				int k;
				int tmp = arr[j];							//tmp=arr[3]=32		tmp=arr[4]=120	 tmp=arr[5]=68	 tmp=arr[6]=70		tmp=arr[1]=5					tmp=arr[2]=11					tmp=arr[3]=32	tmp=arr[4]=120	tmp=arr[5]=68					tmp=arr[6]=70
				
				for(k = j-i; k >= 0 && arr[k] > tmp; k-=i) {//k=0; arr[0]<32	k=1; arr[1]<120	 k=2; arr[2]<68	 k=3; arr[3]<70		k=0; arr[0]>5	k=-1; k < 0		k=1; arr[1]>11	k=0; arr[0]<11	k=2; arr[2]<32	k=3; arr[3]<120	k=4; arr[4]>68	k=3; arr[3]<68	k=5; arr[5]>70	k=4; arr[4]<70
					arr[k+i] = arr[k];																								//arr[0+1]=22					arr[1+1]=22														arr[4+1]=120					arr[5+1]=120
					cnt++;
					System.out.println("arr[k+1], arr[k] : " + arr[k+1] + "/" + arr[k]);
					System.out.println("★ijk : " + i + "/" + j + "/" + k);
				}
				arr[k+i] = tmp;								//arr[0+3]=32		arr[1+3]=120	 arr[2+3]=68	 arr[3+3]=70						arr[-1+1]=5						arr[0+1]=11														arr[3+1]=68						arr[4+1]=70
			}
			System.out.println(i + " : ");
			for(int j = 0; j < n; j++) System.out.print(arr[j] + " ");
			System.out.println();
		}
		System.out.println("cnt : " + cnt);
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("셀 정렬(버전 1)");
		System.out.print("요소 수 : ");
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("arr[%d] : ", i);
			arr[i] = kb.nextInt();
		}
		shellSort(arr, n);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i = 0; i < n; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
	}
}
