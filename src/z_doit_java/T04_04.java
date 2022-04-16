package z_doit_java;

import java.util.Scanner;

class T04_04 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		T04_03 Q = new T04_03(3);
		
		while(true) {
			System.out.println("현재 데이터 수 : " + Q.size() + "/" + Q.capacity());
			System.out.print("1.인큐  2.디큐  3.피크  4.덤프  5.검색  0.종료 : ");
			int menu = kb.nextInt();
			if(menu == 0) break;
			
			int data;
			switch(menu) {
			case 1:
				System.out.print("데이터 : ");
				data = kb.nextInt();
				try {
					Q.enque(data);
				} catch (T04_03.OverflowIntQueueException e) {
					System.out.println("큐가 가득 찼습니다.");
				}
				break;
			case 2:
				try {
					data = Q.deque();
					System.out.println("디큐한 데이터는 " + data + "입니다.");
				} catch (T04_03.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;
			case 3:
				try {
					data = Q.peek();
					System.out.println("피크한 데이터는 " + data + "입니다.");
				} catch (T04_03.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;
			case 4:
				Q.dump();
				break;
			case 5:
				System.out.print("데이터 : ");
				data = kb.nextInt();
				try {
					int result = Q.search(data);
					if(result == 0) System.out.println("큐에 해당하는 데이터가 없습니다.");
					else System.out.println("해당 데이터는 큐의 " + result + "번째에 있습니다.");
				} catch (T04_03.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;
			}
		}
	}
}
