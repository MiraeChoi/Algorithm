package g_recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;

class Node79 {
	int data;
	Node79 lt, rt;
	
	public Node79(int n) {
		data = n;
		lt = rt = null;
	}
}

class Ex07_09 {
	//설명
	//아래 그림과 같은 이진트리에서 루트 노드 1에서 말단 노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성하세요.
	//각 경로의 길이는 루트 노드에서 말단 노드까지 가는데 이동하는 횟수, 즉 간선(에지)의 개수를 길이로 하겠습니다.
	//         1
	//     2       3
	//   4   5
	//가장 짧은 길이는 3번 노드까지의 길이인 1이다.
	static Node79 node;
	int L = 0;
	int min = Integer.MAX_VALUE;
	
	public void DFS(Node79 root) {
		Queue<Node79> Q = new LinkedList<>();
		Q.offer(root);
		
		while(!Q.isEmpty()) {
			int len = Q.size();
			
			for(int i = 0; i < len; i++) {
				Node79 cur = Q.poll();
				
				if(cur.lt != null) Q.offer(cur.lt);
				if(cur.rt != null) Q.offer(cur.rt);
				if(cur.lt == null && cur.rt == null) {
					L++;
					if(L < min) {
						min = L;
						L = 0;
					}
				}
			}
		}
		System.out.println(min);
	}
	
	public static void main(String[] args) {
		Ex07_09 T = new Ex07_09();
		node = new Node79(1);
		node.lt = new Node79(2);
		node.rt = new Node79(3);
		node.lt.lt = new Node79(4);
		node.lt.rt = new Node79(5);
		T.DFS(node);
	}
}