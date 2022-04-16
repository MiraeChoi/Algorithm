package z_doit_java;

import java.util.Scanner;

class T04_04P2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		T04_04P1 Q = new T04_04P1(3);
		
		while(true) {
			System.out.println("현재 데이터 수 : " + Q.size() + "/" + Q.capacity());
			System.out.print("1.맨앞에 인큐　 2.맨앞에서 디큐　 3.맨앞에서 피크\n" +
					 "4.맨끝에 인큐　 5.맨끝에서 디큐　 6.맨끝에서 피크\n" +
					 "7.덤프　 　　　 8.검색　　 　　　 0.종료 : ");
			int menu = kb.nextInt();
			if(menu == 0) break;
			
			int data;
			switch(menu) {
			case 1:	//앞에서 인큐
				System.out.print("데이터 : ");
				data = kb.nextInt();
				try {
					Q.enqueFront(data);
				} catch (T04_04P1.OverflowIntQueueException e) {
					System.out.println("큐가 가득 찼습니다.");
				}
				break;
			case 2: //앞에서 디큐
				try {
					data = Q.dequeFront();
					System.out.println("앞에서 디큐한 데이터는 " + data + "입니다.");
				} catch (T04_04P1.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;
			case 3: //앞에서 피크
				try {
					data = Q.peekFront();
					System.out.println("앞에서 피크한 데이터는 " + data + "입니다.");
				} catch (T04_04P1.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;
			case 4:	//뒤에서 인큐
				System.out.print("데이터 : ");
				data = kb.nextInt();
				try {
					Q.enqueRear(data);
				} catch (T04_04P1.OverflowIntQueueException e) {
					System.out.println("큐가 가득 찼습니다.");
				}
				break;
			case 5: //뒤에서 디큐
				try {
					data = Q.dequeRear();
					System.out.println("뒤에서 디큐한 데이터는 " + data + "입니다.");
				} catch (T04_04P1.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;
			case 6: //뒤에서 피크
				try {
					data = Q.peekRear();
					System.out.println("뒤에서 피크한 데이터는 " + data + "입니다.");
				} catch (T04_04P1.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;
			case 7: //덤프
				Q.dump();
				break;
			case 8: //검색
				System.out.print("데이터 : ");
				data = kb.nextInt();
				try {
					int result = Q.search(data);
					if(result == 0) System.out.println("큐에 해당하는 데이터가 없습니다.");
					else System.out.println("해당 데이터는 큐의 " + result + "번째에 있습니다.");
				} catch (T04_04P1.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;
			}
		}
	}
}
