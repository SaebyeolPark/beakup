//***************************
// 파일명: DirectedGraph
// 작성자: 201814037 박새별
// 작성일: 2020.06.08
// 내용: dfs 인접리스트 and 위상정렬 함수
//***************************

package algorithmHW;

public class DirectedGraph {

	private Node[] list;
	private Node rList;
	private int numberOfVertices;
	private boolean[] isVisited;

	private class Node {
		int Vertex;
		Node link;

	}

	public DirectedGraph(int n) {
		list = new Node[n];
		numberOfVertices = n;
	}

	public void addEdge(int v1, int v2) {

		Node newNode = new Node();
		newNode.Vertex = v2;
		if (v1 < numberOfVertices && v2 < numberOfVertices) {
			if (v1 < 0 && v2 < 0) {
				if (v1 != v2) {
					if (list[v1] == null) {
						list[v1] = newNode;
					} else {
						Node temp;
						temp = list[v1];
						list[v1] = newNode;
						list[v1].link = temp;
					}
				} else
					System.out.println("간선 삽입 오류 - 잘못된 정점 번호입니다. <" + v1 + " , " + v2 + ">");
			} else
				System.out.println("간선 삽입 오류 - 잘못된 정점 번호입니다. <" + v1 + " , " + v2 + ">");
		} else
			System.out.println("간선 삽입 오류 - 잘못된 정점 번호입니다. <" + v1 + " , " + v2 + ">");
	}

	public void printAdjacencyList() {
		for (int i = 0; i < numberOfVertices; i++) {
			System.out.print("\n정점 " + (i) + "에 인접한 정점 = ");
			Node node = list[i];
			while (node != null) {
				System.out.print(node.Vertex + " ");
				node = node.link;
			}
		}
		System.out.print("\n위상정렬 결과: ");
		Node node = rList;
		while (node != null) {
			System.out.print(node.Vertex + " ");
			node = node.link;
		}

	}

	void DFSUtil(int v, boolean[] visited) {
		visited[v] = true;
		// 위상정렬을 하기 위해 리스트에 노드를 집어넣음
		Node newNode = new Node();
		newNode.Vertex = v;
		if (rList == null) {
			rList = newNode;
		} else {
			Node temp;
			temp = rList;
			rList = newNode;
			rList.link = temp;
		}
		while (true) {
			if (list[v] == null)
				break;
			else if (list[v].link == null)
				break;
			int n = list[v].link.Vertex;
			if (!visited[n])
				DFSUtil(n, visited);
			Node temp = list[v].link;
			Node check = temp.link;
			if (check == null)
				break;
		}
	}

	void DFS(int v) {
		boolean visited[] = new boolean[numberOfVertices];
		// v를 시작 노드로 DFSUtil 순환 호출
		DFSUtil(v, visited);
	}

	void DFS() {
		boolean visited[] = new boolean[numberOfVertices];
		// 비연결형 그래프의 경우, 모든 정점을 하나씩 방문
		for (int i = 0; i < numberOfVertices; i++) {
			if (visited[i] == false)
				DFSUtil(i, visited);
		}
	}
}
