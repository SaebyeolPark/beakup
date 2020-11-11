//***************************
// 파일명: BubbleSort
// 작성자: 201814037 박새별
// 작성일: 2020.03.30
// 내용: 성적 내림차순 정렬
//***************************

package algorithmHW;

import java.util.Scanner;

class Student3 {
	private String name;
	private int id;
	private double grade;

	// getter,setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	// string->double 형변환
	public void changeToDouble(String str) {
		grade = Double.parseDouble(str); // string->double
	}

	// 우수학생 선발
	public void maxName(String str) {
		name = str;
	}
}

public class BubbleSort {
	public static void main(String args[]) {

		System.out.println("hw3_3: 박새별 ");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		System.out.print("학생 수 입력: ");
		int n = sc.nextInt();
		System.out.println();

		String information[][] = new String[n][3];
		double sum = 0;
		double max = 0;

		System.out.println(n + "명의 학생 정보를 입력하세요 : ");

		// 학생정보 입력
		for (int i = 0; i < information.length; i++) {
			for (int j = 0; j < information[i].length; j++) {
				information[i][j] = sc.next();
			}
		}

		String temp; // 빈 string
		for (int i = 0; i < information.length; i++) {
			for (int j = 0; j < information.length - i - 1; j++) {
				if (information[j][2].compareTo(information[j + 1][2]) < 0) {
					for (int k = 0; k < information[i].length; k++) {
						temp = information[j][k];
						information[j][k] = information[j + 1][k];
						information[j + 1][k] = temp;
					}
				}
			}
		}

		// 내림차순 정렬 출력
		System.out.println();
		System.out.println("성적 내림차순 정렬 결과 =");

		for (int i = 0; i < information.length; i++) {
			for (int j = 0; j < information[i].length; j++) {
				System.out.print(information[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
