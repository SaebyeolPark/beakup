//***************************
// 파일명: MatrixTest
// 작성자: 박새별
// 작성일: 20200519
// 내용: 행렬 최대 점수 경로 구하기
//***************************
package algorithmHW;

import java.util.Scanner;

public class MatrixTest {

	private static int[][] matrix;
	private static int[][] temp;

	static int matrixPath(int n) {
		temp = new int[n + 1][n + 1];
		for (int i = 0; i < temp.length; i++) {
			temp[i][0] = 0; // 가장자리를 0으로 만듬
		}
		for (int j = 0; j < temp.length; j++) {
			temp[0][j] = 0; // 가장자리를 0으로 만듬
		}
		for (int i = 1; i < temp.length; i++) {
			for (int j = 1; j < temp[i].length; j++) {
				temp[i][j] = matrix[i - 1][j - 1] + max(temp[i - 1][j], temp[i][j - 1]);
			}
		}
		return temp[n][n];
	}

	static void matrixRoute(int n) {

		int i = 1, j = 1;
		System.out.print("(" + i + "," + j + ") ");

		while (true) {
			if (i + 1 > n || j + 1 > n)
				break;
			if (temp[i + 1][j] > temp[i][j + 1]) {
				i = i + 1;
				System.out.print("(" + i + "," + j + ") ");
			} else {
				j = j + 1;
				System.out.print("(" + i + "," + j + ") ");
			}
		}

		System.out.print("(" + n + "," + n + ")");
	}

	static int max(int x, int y) {
		return x > y ? x : y;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("hw8_1:박새별");

		System.out.print("행의 크기 입력: ");
		int n = sc.nextInt();
		matrix = new int[n][n];

		System.out.println(n + " x " + n + " 크기의 행렬 원소 입력: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("\n최대 점수 = " + matrixPath(n));
		System.out.print("최대 점수 경로 = ");
		matrixRoute(n);
	}
}
