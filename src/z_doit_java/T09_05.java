package z_doit_java;

import java.util.Comparator;

class T09_05<E> {
	class Node<E> {
		private E data;			//데이터
		private Node<E> prev;	//앞쪽 포인터(다음 노드에 대한 참조)
		private Node<E> next;	//뒤쪽 포인터(다음 노드에 대한 참조)
		
		Node() {
			data = null;
			prev = next = this;
		}
		
		Node(E obj, Node<E> prev, Node<E> next) {
			data = obj;
			this.prev = prev;
			this.next = next;
		}
	}
	
	private Node<E> head;		//머리 노드(더미 노드)
	private Node<E> crnt;		//선택 노드
	
	public T09_05() {
		head = crnt = new Node<E>();	//더미 노드 생성
	}
	
	public boolean isEmpty() {
		return head.next == head;
	}
	
	//노드 검색
	public E search(E obj, Comparator<? super E> c) {
		Node<E> ptr = head.next;
		
		while(ptr != head) {
			if(c.compare(obj, ptr.data) == 0) {
				crnt = ptr;
				return ptr.data;	//검색 성공
			}
			ptr = ptr.next;			//다음 노드 선택
		}
		return null;				//검색 실패
	}
	
	//선택 노드 출력
	public void printCurrentNode() {
		if(isEmpty()) System.out.println("선택 노드가 없습니다.");
		else System.out.println(crnt.data);
	}
	
	//모든 노드 출력
	public void dump() {
		Node<E> ptr = head.next;
		
		while(ptr != head) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}
	
	//모든 노드를 거꾸로 출력
	public void dumpReverse() {
		Node<E> ptr = head.prev;
		
		while(ptr != head) {
			System.out.println(ptr.data);
			ptr = ptr.prev;
		}
	}
	
	//선택 노드를 하나 뒤쪽으로 이동
	public boolean next() {
		if(isEmpty() || crnt.next == head) return false;	//이동 불가
		crnt = crnt.next;
		return true;
	}
	
	//선택 노드를 하나 앞쪽으로 이동
	public boolean prev() {
		if(isEmpty() || crnt.prev == head) return false;	//이동 불가
		crnt = crnt.prev;
		return true;
	}
	
	//선택 노드의 바로 뒤에 노드 삽입
	public void add(E obj) {
		Node<E> node = new Node<E>(obj, crnt, crnt.next);
		crnt.next = crnt.next.prev = node;
		crnt = node;
	}
	
	//머리에 노드 삽입
	public void addFirst(E obj) {
		crnt = head;
		add(obj);
	}
	
	//꼬리에 노드 삽입
	public void addLast(E obj) {
		crnt = head.prev;
		add(obj);
	}
	
	//선택 노드 삭제
	public void removeCurrentNode() {
		if(!isEmpty()) {
			crnt.prev.next = crnt.next;
			crnt.next.prev = crnt.prev;
			crnt = crnt.prev;
			if(crnt == head) crnt = head.next;
		}
	}
	
	//노드 p 삭제
	public void remove(Node p) {
		Node<E> ptr = head.next;
		
		while(ptr != head) {
			if(ptr == p) {	//p를 찾음
				crnt = p;
				removeCurrentNode();
				break;
			}
			ptr = ptr.next;
		}
	}
	
	//머리 노드 삭제
	public void removeFirst() {
		crnt = head.next;	//머리 노드 head.next 삭제
		removeCurrentNode();
	}
	
	//꼬리 노드 삭제
	public void removeLast() {
		crnt = head.prev;	//꼬리 노드 head.prev 삭제
		removeCurrentNode();
	}
	
	//모든 노드 삭제
	public void clear() {
		while(!isEmpty()) removeFirst(); //텅 빌 때까지 머리 노드 삭제
	}
}
