package z_doit_java;

class T04_01 {
	private int max;
	private int ptr;
	private int[] stk;
	
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
			// TODO Auto-generated constructor stub
		}
	}
	
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
			// TODO Auto-generated constructor stub
		}
	}
	
	public T04_01(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];
		} catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int push(int x) throws OverflowIntStackException {
		if(ptr >= max) throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	public int pop() throws EmptyIntStackException {
		if(ptr <= 0) throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	public int peek() throws EmptyIntStackException {
		if(ptr <= 0) throw new EmptyIntStackException();
		return stk[ptr - 1];
	}
	
	public int indexOf(int x) {
		for(int i = ptr - 1; i >= 0; i--) {
			if(stk[i] == x) return i;
		}
		return -1;
	}
	
	public void clear() {
		ptr = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return ptr;
	}
	
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	public boolean isFull() {
		return ptr >= max;
	}
	
	public void dump() {
		if(ptr <= 0) System.out.println("스택이 비어 있습니다.");
		else {
			for(int i = 0; i < ptr; i++) System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
}
