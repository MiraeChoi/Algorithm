package h_dfs_n_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex08_10 {
	//설명
	//7*7 격자판 미로를 탈출하는 경로의 가지수를 출력하는 프로그램을 작성하세요.
	//출발점은 격자의 (1, 1) 좌표이고, 탈출 도착점은 (7, 7)좌표이다. 격자판의 1은 벽이고, 0은 통로이다.
	//격자판의 움직임은 상하좌우로만 움직인다. 미로가 다음과 같다면
	//출발 0 0 0 0 0  0
	// 0  1 1 1 1 1  0
	// 0  0 0 1 0 0  0
	// 1  1 0 1 0 1  1
	// 1  1 0 0 0 0  1
	// 1  1 0 1 1 0  0
	// 1  0 0 0 0 0 도착
	//위의 지도에서 출발점에서 도착점까지 갈 수 있는 방법의 수는 8가지이다.

	//입력
	//7*7 격자판의 정보가 주어집니다.

	//출력
	//첫 번째 줄에 경로의 가지수를 출력한다.
	static int answer = 0;
	static int[][] arr;
	Queue<Integer> Qlt = new LinkedList<>();
	Queue<Integer> Qrt = new LinkedList<>();
	
	public void DFS(int lt, int rt) {
		System.out.println("lt : " + lt + " / rt : " + rt);
		if(lt == 7 && rt == 7) {
			answer++;
			Qlt.clear();
			Qrt.clear();
		}
		if(lt > 7 || rt > 7) return;
		if(lt < 1 || rt < 1) return;
		
		Qlt.add(lt);
		Qrt.add(rt);
		if(!Qlt.contains(lt-1) && lt-1 > 0 && arr[lt-1][rt] == 0) DFS(lt-1, rt);
		if(!Qlt.contains(lt+1) && lt+1 <= 7 && arr[lt+1][rt] == 0) DFS(lt+1, rt);
		if(!Qrt.contains(rt-1) && rt-1 > 0 && arr[lt][rt-1] == 0) DFS(lt, rt-1);
		if(!Qrt.contains(rt+1) && rt+1 <= 7 && arr[lt][rt+1] == 0) DFS(lt, rt+1);
	}
	
	public static void main(String[] args) {
		Ex08_10 T = new Ex08_10();
		Scanner kb = new Scanner(System.in);
		arr = new int[7+1][7+1];
		for(int i = 1; i <= 7; i++) {
			for(int j = 1; j <= 7; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		T.DFS(1, 1);
	}
}
