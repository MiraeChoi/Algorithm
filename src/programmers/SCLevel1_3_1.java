package programmers;

class SCLevel1_3_1 {
	public double solution(int[] arr) {
		double answer = 0;
		for(int i = 0; i < arr.length; i++) answer += arr[i];
		
		return answer / arr.length;
	}
	
	public static void main(String[] args) {
		SCLevel1_3_1 T = new SCLevel1_3_1();
		int[] arr = {1, 2, 3, 4};
		System.out.println(T.solution(arr));
	}
}
