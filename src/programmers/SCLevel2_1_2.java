package programmers;

class SCLevel2_1_2 {
	//Ʈ�� ���·� ����� n���� ����ž ���� �� �ϳ��� ���� ���¸� ��Ʈ��ũ�� 2���� �����Ϸ� �Ѵ�.
	//�̶� �� ���¸��� ���� �Ǵ� ����ž�� ������ �ִ��� ����ϰ� ���߾� �� ���밪�� return�Ѵ�.
	
	//n : 2 �̻� 100 ����
	//wires : ���̰� n-1�� ������ 2���� �迭. {v1, v2} 2���� �ڿ����� �̷���� �ִ�.
	//1 <= v1 <= v2 <= n
	//���¸� ��Ʈ��ũ�� �ϳ��� Ʈ�� ���°� �ƴ� ��� �Է����� �־����� �ʴ´�.
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
