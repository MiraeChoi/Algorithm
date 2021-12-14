package h_dfs_n_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex08_10 {
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
