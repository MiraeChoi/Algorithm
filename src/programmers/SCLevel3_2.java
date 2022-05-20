package programmers;

class SCLevel3_2 {
	public String solution(String phone_number) {
		String answer = "";	
		for(int i = 0; i < phone_number.length()-4; i++) answer += "*";
		return answer + phone_number.substring(phone_number.length()-4, phone_number.length());
	}
	
	public static void main(String[] args) {
		SCLevel3_2 T = new SCLevel3_2();
		String phone_number = "027778888";
		System.out.println(T.solution(phone_number));
	}
}
