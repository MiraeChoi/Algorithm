package z_doit_java;

import java.util.Comparator;

class T10_01_P1P2<K, V> {
	static class Node<K, V> {
		private K key;				//Ű��
		private V data;				//������
		private Node<K, V> left;	//���� �ڽ� ���
		private Node<K, V> right;	//������ �ڽ� ���
		
		Node(K key, V data, Node<K, V> left, Node<K, V> right) {
			this.key = key;
			this.data = data;
			this.left = left;
			this.right = right;
		}
		
		K getKey() {return key;}	//Ű�� ��ȯ
		V getValue() {return data;}	//������ ��ȯ
		void print() {System.out.println(data);}
	}
	private Node<K, V> root;							//��Ʈ
	private Comparator<? super K> comparator = null;	//����
	
	public T10_01_P1P2() {root = null;}						//�ڿ� ������ ���� Ű�� ��
	public T10_01_P1P2(Comparator<? super K> c) {			//���ڷ� Ű�� ��
		this();
		comparator = c;
	}
	
	//�� Ű�� ��
	private int comp(K key1, K key2) {
		return comparator == null ? ((Comparable<K>)key1).compareTo(key2) : comparator.compare(key1, key2);
	}
	
	//Ű������ �˻�
	public V search(K key) {
		Node<K, V> p = root;
		
		while(true) {
			if(p == null) return null;			//�˻� ����
			int con = comp(key, p.getKey());	//key�� ��� p�� Ű�� ��
			if(con == 0) return p.getValue();	//�˻� ����
			else if(con < 0) p = p.left;		//key�� �� ������ ���� ���� Ʈ������ �˻�
			else p = p.right;					//key�� �� ũ�� ������ ���� Ʈ������ �˻�
		}
	}
	
	//��带 ��Ʈ�� �ϴ� ���� Ʈ���� ��� <K, V>�� ����
	private void addNode(Node<K, V> node, K key, V data) {
		int con = comp(key, node.getKey());			//�����˻�Ʈ���� key�� �̹� ����
		if(con == 0) return;
		else if(con < 0) {
			if(node.left == null) node.left = new Node<K, V>(key, data, null, null);
			else addNode(node.left, key, data);		//���� ���� Ʈ���� �ָ�
		} else {
			if(node.right == null) node.right = new Node<K, V>(key, data, null, null);
			else addNode(node.right, key, data);	//������ ���� Ʈ���� �ָ�
		}
	}
	
	//��� ����
	public void add(K key, V data) {
		if(root == null) root = new Node<K, V>(key, data, null, null);
		else addNode(root, key, data);
	}
	
	//Ű���� key�� ��� ����
	public boolean remove(K key) {
		Node<K, V> p = root;
		Node<K, V> parent = null;
		boolean isLeftChild = true;
		
		while(true) {
			if(p == null) return false;					//Ű���� ����
			int con = comp(key, p.getKey());			//key�� ��� p�� Ű�� ��
			if(con == 0) break;							//������ �˻� ����
			else {
				parent = p;								//������ �������� ���� �θ� ����
				if(con < 0) {							//key�� �� ������
					isLeftChild = true;					//���� �ڽ����� ������
					p = p.left;							//���� ���� Ʈ������ �˻�
				} else {								//key�� �� ũ��
					isLeftChild = false;				//������ �ڽ����� ������
					p = p.right;						//������ ���� Ʈ������ �˻�
				}
			}
		}
		
		if(p.left == null) {							//p�� ���� �ڽ��� ����
			if(p == root) root = p.right;
			else if(isLeftChild) parent.left = p.right;
			else parent.right = p.right;
		} else if(p.right == null) {					//p�� ������ �ڽ��� ����
			if(p == root) root = p.left;
			else if(isLeftChild) parent.left = p.left;
			else parent.right = p.right;
		} else {										//p�� �ڽ� ��尡 2��
			parent = p;
			Node<K, V> left = p.left;					//���� Ʈ�� �� ���� ū ���
			isLeftChild = true;
			
			while(left.right != null) {					//���� ū ��� left �˻�
				parent = left;
				left = left.right;
				isLeftChild = false;
			}
			p.key = left.key;							//left�� Ű���� p�� �ű�
			p.data = left.data;							//left�� �����͸� p�� �ű�
			if(isLeftChild) parent.left = left.left;	//left ����
			else parent.right = left.left;				//left ����
		}
		return true;
	}
	
	//��带 ��Ʈ�� �ϴ� ���� Ʈ���� ��带 Ű���� ������������ ���
	private void printSubTree(Node node) {
		if(node != null) {
			printSubTree(node.left);						//���� ���� Ʈ���� Ű���� ������������ ���
			System.out.println(node.key + " " + node.data);	//��� ���
			printSubTree(node.right);						//������ ���� Ʈ���� Ű���� ������������ ���
		}
	}
	
	//��� ��带 Ű���� ������������ ���
	public void print() {
		printSubTree(root);
	}
	
	
	//--------------P1
	//��带 ��Ʈ�� �ϴ� ���� Ʈ���� ��带 Ű���� ������������ ���
	private void printSubTreeRev(Node node) {
		if (node != null) {
			printSubTreeRev(node.right);					//������ ���� Ʈ���� Ű���� ������������ ���
			System.out.println(node.key + " " + node.data);	//��� ���
			printSubTreeRev(node.left); 					//���� ���� Ʈ���� Ű���� ������������ ���
		}
	}

	//��� ��带 Ű���� ������������ ���
	public void printReverse() {
		printSubTreeRev(root);
	}
	
	
	//--------------P2
	//���� ���� Ű���� ���� ��� ��ȯ
	private Node<K, V> getMinNode() {
		if (root == null) return null;
		else {
			Node<K, V> p = root;
			while (p.left != null) p = p.left;
			return p;
		}
	}

	//���� ū Ű���� ���� ��� ��ȯ
	private Node<K, V> getMaxNode() {
		if (root == null) return null;
		else {
			Node<K, V> p = root;
			while (p.right != null) p = p.right;
			return p;
		}
	}

	//���� ���� Ű�� ��ȯ
	public K getMinKey() {
		Node<K, V> minNode = getMinNode();
		return minNode == null ? null : minNode.getKey();
	}

	//���� ���� Ű���� ���� ����� ������ ��ȯ
	public V getDataWithMinKey() {
		Node<K, V> minNode = getMinNode();
		return minNode == null ? null : minNode.getValue();
	}

	//���� ū Ű�� ��ȯ
	public K getMaxKey() {
		Node<K, V> maxNode = getMaxNode();
		return maxNode == null ? null : maxNode.getKey();
	}

	//���� ū Ű���� ���� ����� ������ ��ȯ
	public V getDataWithMaxKey() {
		Node<K, V> maxNode = getMaxNode();
		return maxNode == null ? null : maxNode.getValue();
	}
}
