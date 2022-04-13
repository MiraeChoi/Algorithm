package z_doit_java;

import java.util.Scanner;

class T02_13 {
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	static int dayOfYear(int y, int m, int d) {
		int days = d;
		
		for(int i = 1; i < m; i++) days += mdays[isLeap(y)][i-1];
		return days;
	}
	
	static int leftDayOfYear(int y, int m, int d) {
		int days;
		if(isLeap(y) == 1) days = mdays[1][m-1] - d;
		else days = mdays[0][m-1] - d;
		
		for(int i = 12 - 1; i >= m; i--) days += mdays[isLeap(y)][i-1];
		return days;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int retry = 0;
		
		System.out.println("그해 경과 일수를 구합니다.");
		
		do {
			System.out.print("년 : ");	int year = kb.nextInt();
			System.out.print("월 : ");	int month = kb.nextInt();
			System.out.print("일 : ");	int day = kb.nextInt();
			
			System.out.println("그해 " + dayOfYear(year, month, day) + "일째입니다.");
			System.out.println("내년까지 남은 일수는 " + leftDayOfYear(year, month, day) + "일입니다.");
			System.out.print("한 번 더 할까요? (1.예/0.아니오) : ");
			retry = kb.nextInt();
		} while(retry == 1);
	}
}
