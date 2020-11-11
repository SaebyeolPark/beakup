//***************************
// 파일명: FigureArrayTest
// 작성자: 박새별
// 작성일: 20200411
// 내용: 원과 반지름 구하기 메인클래스
//***************************
package algorithmHW;

import java.util.Scanner;

public class FigureArrayTest {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("hw4_4 : 박새별");

		System.out.print("원 개수 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("삼각형 개수 입력 : ");
		int n2 = sc.nextInt();

		int length = n1 + n2;
		Figure[] figureArray = new Figure[length];

		System.out.print(n1 + "개의 원 정보(반지름)를 입력하세요: ");

		for (int i = 0; i < n1; i++) {
			Circle c = new Circle(); // Circle() 객체 생성
			c.setradius(sc.nextDouble());
			figureArray[i] = c;
		}

		System.out.print(n2 + "개의 삼각형 정보(밑변과 높이)를 입력하세요: ");

		for (int i = 0; i < n2; i++) {
			Triangle t = new Triangle(); // Triangle() 객체 생성
			t.setWidth(sc.nextDouble());
			t.setHeight(sc.nextDouble());
			figureArray[n1 + i] = t;
		}

		FigureSortService.mergeSort(figureArray);

		System.out.println("병합 정렬 결과 " + length + "개의 도형 정보와 면적 =");
		for (int i = 0; i < figureArray.length; i++) {
			System.out.println(figureArray[i]);
		}
	}
}
