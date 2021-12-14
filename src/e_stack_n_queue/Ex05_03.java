package e_stack_n_queue;

import java.util.Scanner;
import java.util.Stack;

class Ex05_03 {
	public int solution(int n, int[][] board, int m, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		int preN = 0;
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(board[j][moves[i]-1] != 0) {
					stack.push(board[j][moves[i]-1]);
					
					if(board[j][moves[i]-1] == preN) {
						stack.pop(); stack.pop();
						answer += 2;
					}
					
					preN = stack.lastElement();
					board[j][moves[i]-1] = 0;
					break;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex05_03 T = new Ex05_03();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] board = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		int m = kb.nextInt();
		int[] moves = new int[m];
		for(int i = 0; i < moves.length; i++) moves[i] = kb.nextInt();
		
		System.out.println(T.solution(n, board, m, moves));
	}
}
