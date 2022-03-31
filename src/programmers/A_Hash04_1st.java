package programmers;

class A_Hash04_1st {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        return answer;
    }
    
    public static void main(String[] args) {
		A_Hash04_1st T = new A_Hash04_1st();
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		for(int x : T.solution(genres, plays)) System.out.print(x + ", ");
	}
}
