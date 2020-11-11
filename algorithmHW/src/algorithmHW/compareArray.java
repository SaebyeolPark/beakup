package algorithmHW;

import java.util.Scanner;

public class compareArray {

	// 비교 메소드 1
	static int compare1(int arr1[], int arr2[]) {

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					break;
				}
				if (j == arr2.length - 1) {
					if (arr1[i] != arr2[j])
						return -1;
				}
			}
		}
		return 0;
	}

	// 비교 메소드2
	static int compare2(int arr1[], int arr2[]) {

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr2[i] == arr1[j]) {
					break;
				}
				if (j == arr1.length - 1) {
					if (arr2[i] != arr1[j])
						return -1;
				}
			}
		}
		return 0;
	}

	public static void main(String args[]) {
		int arr1[] = new int[100];
		int arr2[] = new int[100];

		Scanner sc = new Scanner(System.in);

		System.out.println("hw0_2 : 박새별");
		System.out.println("양의 정수 집합을 비교하는 프로그램입니다.");

		// 첫번째 집합
		System.out.print("첫번째 집합을 입력하세요. 집합 입력을 마치려면 양이 아닌 정수를 입력하세요 : ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
			if (arr1[i] < 1) {
				arr1[i] = arr1[i + 1];
				break;
			}
		}

		// 두번쨰 집합
		System.out.print("두번째 집합을 입력하세요. 집합 입력을 마치려면 양이 아닌 정수를 입력하세요 : ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
			if (arr2[i] < 1) {
				arr2[i] = arr2[i + 1];
				break;
			}
		}

		if (compare1(arr1, arr2) == 0 && compare2(arr1, arr2) == 0) {
			System.out.println("두 집합은 같습니다.");
		} else {
			System.out.println("두 집합은 서로 다릅니다.");
		}

		sc.close();

	}
}
