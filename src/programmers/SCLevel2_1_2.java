package programmers;

class SCLevel2_1_2 {
	//트리 형태로 연결된 n개의 송전탑 전선 중 하나를 끊어 전력망 네트워크를 2개로 분할하려 한다.
	//이때 두 전력망이 갖게 되는 송전탑의 개수를 최대한 비슷하게 맞추어 그 절대값을 return한다.
	
	//n : 2 이상 100 이하
	//wires : 길이가 n-1인 정수형 2차원 배열. {v1, v2} 2개의 자연수로 이루어져 있다.
	//1 <= v1 <= v2 <= n
	//전력망 네트워크가 하나의 트리 형태가 아닌 경우 입력으로 주어지지 않는다.
    public int solution(int n, int[][] wires) {
        int answer = -1;
        return answer;
    }
    
    public static void main(String[] args) {
		SCLevel2_1_2 T = new SCLevel2_1_2();
		//return 3
		int n = 9;
		int[][] wires = new int[n-1][2];
		wires[0][0] = 1;	wires[0][1] = 3;	//1 3
		wires[1][0] = 2;	wires[1][1] = 3;	//2 3
		wires[2][0] = 3;	wires[2][1] = 4;	//3 4
		wires[3][0] = 4;	wires[3][1] = 5;	//4 5
		wires[4][0] = 4;	wires[4][1] = 6;	//4 6
		wires[5][0] = 4;	wires[5][1] = 7;	//4 7
		wires[6][0] = 7;	wires[6][1] = 8;	//7 8
		wires[7][0] = 7;	wires[7][1] = 9;	//7 9
		
		//return 0
//		int n = 4;
//		int[][] wires = new int[n-1][2];
//		wires[0][0] = 1;	wires[0][1] = 2;	//1 2
//		wires[1][0] = 2;	wires[1][1] = 3;	//2 3
//		wires[2][0] = 3;	wires[2][1] = 4;	//3 4
		
		//return 1
//		int n = 7;
//		int[][] wires = new int[n-1][2];
//		wires[0][0] = 1;	wires[0][1] = 2;	//1 2
//		wires[1][0] = 2;	wires[1][1] = 7;	//2 7
//		wires[2][0] = 3;	wires[2][1] = 7;	//3 7
//		wires[3][0] = 3;	wires[3][1] = 4;	//3 4
//		wires[4][0] = 4;	wires[4][1] = 5;	//4 5
//		wires[5][0] = 6;	wires[5][1] = 7;	//6 7
		System.out.println(T.solution(n, wires));
    }
}
