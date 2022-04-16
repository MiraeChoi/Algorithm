package z_doit_java;

class T04_04P1 {
	//연습문제 Q7
	private int max;
	private int num;
	private int front;
	private int rear;
	private int[] deque;
	
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
			// TODO Auto-generated constructor stub
		}
	}
	
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {
			// TODO Auto-generated constructor stub
		}
	}
	
	public T04_04P1(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			deque = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int enqueFront(int x) throws OverflowIntQueueException {
		if(num >= max) throw new OverflowIntQueueException();
		num++;
		if(--front < 0) front = max - 1;
		deque[front] = x;
		return x;
	}
	
	public int enqueRear(int x) throws OverflowIntQueueException {
		if(num >= max) throw new OverflowIntQueueException();
		deque[rear++] = x;
		num++;
		if(rear >= max) rear = 0;
		return x;
	}
	
	public int dequeFront() throws EmptyIntQueueException {
		if(num <= 0) throw new EmptyIntQueueException();
		int x = deque[front++];
		num--;
		if(front == max) front = 0;
		return x;
	}
	
	public int dequeRear() throws EmptyIntQueueException {
		if(num <= 0) throw new EmptyIntQueueException();
		num--;
		if(--rear <= 0) rear = max - 1;
		return deque[rear];
	}
	
	public int peekFront() throws EmptyIntQueueException {
		if(num <= 0) throw new EmptyIntQueueException();
		return deque[front];
	}
	
	public int peekRear() throws EmptyIntQueueException {
		if(num <= 0) throw new EmptyIntQueueException();
		return deque[rear == 0 ? max - 1 : rear - 1];
	}
	
	public int indexOf(int x) {
		for(int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if(deque[idx] == x) return idx;
		}
		return -1;
	}
	
	public int search(int x) {
		for(int i = 0; i < num; i++) {
			if(deque[(i + front) % max] == x) return i + 1;
		}
		return 0;
	}
	
	public void clear() {
		front = rear = num = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return num;
	}
	
	public boolean isEmpty() {
		return num <= 0;
	}
	
	public boolean isFull() {
		return num >= max;
	}
	
	public void dump() {
		if(num <= 0) {
			System.out.println("큐가 비어 있습니다.");
		} else {
			for(int i = 0; i < num; i++) {
				System.out.print(deque[(i + front) % max] + " ");
			}
			System.out.println();
		}
	}
}
