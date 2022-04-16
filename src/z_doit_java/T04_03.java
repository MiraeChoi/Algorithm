package z_doit_java;

class T04_03 {
	private int max;	//ť�� �뷮
	private int front;	//ù ��° ��� Ŀ��
	private int rear;	//������ ��� Ŀ��
	private int num;	//���� ������ ��
	private int[] que;	//ť ��ü
	
	//���� �� ���� : ť�� ��� ����
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
			// TODO Auto-generated constructor stub
		}
	}
	
	//���� �� ���� : ť�� ���� ��
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {
			// TODO Auto-generated constructor stub
		}
	}
	
	public T04_03(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];			//ť ��ü�� �迭 ����
		} catch (OutOfMemoryError e) {	//������ �� ����
			max = 0;
		}
	}
	
	//ť�� �����͸� ��ť
	public int enque(int x) throws OverflowIntQueueException {
		if(num >= max) throw new OverflowIntQueueException();
		que[rear++] = x;
		num++;
		if(rear == max) rear = 0;
		return x;
	}
	
	//ť���� �����͸� ��ť
	public int deque() throws EmptyIntQueueException {
		if(num <= 0) throw new EmptyIntQueueException();
		int x = que[front++];
		num--;
		if(front == max) front = 0;
		return x;
	}
	
	//ť���� �����͸� ��ũ
	public int peek() throws EmptyIntQueueException {
		if(num <= 0) throw new EmptyIntQueueException();
		return que[front];
	}
	
	//ť���� x�� �˻��Ͽ� �ε���(ã�� ���ϸ� -1)�� ��ȯ
	public int indexOf(int x) {				//front = 7, max = 10
		for(int i = 0; i < num; i++) {		//i = 0				i = 1		i = 2		i = 3				i = 4
			int idx = (i + front) % max;	//idx = 7 % 10 = 7	idx = 8		idx = 9		idx = 10 % 10 = 0	idx = 11 % 10 = 1
			if(que[idx] == x) return idx;
		}
		return -1;
	}
	
	//ť�� ���
	public void clear() {
		num = front = rear = 0;
	}
	
	//ť�� �뷮�� ��ȯ
	public int capacity() {
		return max;
	}
	
	//ť�� �׿� �ִ� ������ ���� ��ȯ
	public int size() {
		return num;
	}
	
	//ť�� ��� �ֳ���?
	public boolean isEmpty() {
		return num <= 0;
	}
	
	//ť�� ���� á����?
	public boolean isFull() {
		return num >= max;
	}
	
	//ť ���� ��� �����͸� ����Ʈ -> ���� ������ ���
	public void dump() {
		if(num <= 0) System.out.println("ť�� ��� �ֽ��ϴ�.");
		else {
			for(int i = 0; i < num; i++) System.out.printf("%d ", que[(i+front) % max]);
			System.out.println();
		}
	}
	
	//ť ���� ������ �˻�
	public int search(int x) {
		if(num <= 0) System.out.println("ť�� ��� �ֽ��ϴ�.");
		else {
			for(int i = 0; i < num; i++) {
				if(que[(i + front) % max] == x) return i+1;
			}
		}
		return 0;
	}
}
