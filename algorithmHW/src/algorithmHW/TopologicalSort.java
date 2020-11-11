//***************************
// 파일명: TopologicalSort
// 작성자: 201814037 박새별
// 작성일: 2020.06.08
// 내용: dfs 위상정렬
//***************************
package algorithmHW;

import java.util.Scanner;

public class TopologicalSort {

	public static void main(String args[]) {
		System.out.println("hw10_2:박새별");
		Scanner sc=new Scanner(System.in);

		System.out.println("위상 정렬을 수행합니다. DAG를 입력하세요.");
		System.out.print("정점 수 입력: ");
		int n=sc.nextInt();
		DirectedGraph graph=new DirectedGraph(n);

		System.out.print("간선 수 입력: ");
		int e=sc.nextInt();

		System.out.println(e+"개의 간선 입력");

		for(int i=1; i<e+1; i++) {
			System.out.print("간선"+i+" 입력: ");
			int v1=sc.nextInt();
			int v2=sc.nextInt();

			graph.addEdge(v1, v2);
		}

		graph.DFS();
		graph.printAdjacencyList();
	}
}
