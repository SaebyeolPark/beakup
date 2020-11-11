//***************************
// 파일명: FigureSortService
// 작성자: 박새별
// 작성일: 20200413
// 내용: 원과 삼각형 면적 구하기
//***************************
package algorithmHW;

public class FigureSortService {
	public static void mergeSort(Figure[] figureArray) {
		mergeSort(figureArray, 0, figureArray.length - 1);
	}

	public static void mergeSort(Figure[] figureArray, int start, int end) {
		if (start == end)
			return;
		int middle = (start + end) / 2;
		mergeSort(figureArray, start, middle);
		mergeSort(figureArray, middle + 1, end);
		merge(figureArray, start, middle, end);
	}

	public static void merge(Figure[] figureArray, int start, int middle, int end) {
		int length = end - start + 1;
		Figure[] temp = new Figure[length];
		int i = 0;
		int index1 = start;
		int index2 = middle + 1;

		while (index1 <= middle && index2 <= end) {
			if (figureArray[index1].getArea() < figureArray[index2].getArea())
				temp[i++] = figureArray[index1++];
			else
				temp[i++] = figureArray[index2++];
		}
		while (index1 <= middle)
			temp[i++] = figureArray[index1++];
		while (index2 <= end)
			temp[i++] = figureArray[index2++];
		for (i = 0; i < temp.length; ++i)
			figureArray[start + i] = temp[i];
	}

	static void swap(Figure[] figureArray, int i, int j) {

		Figure temp = figureArray[i];
		figureArray[i] = figureArray[j];
		figureArray[j] = temp;
	}

	static void buildHeap(Figure[] figureArray) {
		int end = figureArray.length - 1;
		for (int i = end / 2; i >= 0; --i)
			heapify(figureArray, i, end);
	}

	static void heapify(Figure[] figureArray, int k, int end) {
		int left = 2 * k + 1, right = 2 * k + 2;
		int smaller;
		if (right <= end)
			smaller = (figureArray[left].getArea() > figureArray[right].getArea()) ? left : right;
		else if (left <= end)
			smaller = left;
		else
			return;
		if (figureArray[smaller].getArea() > figureArray[k].getArea()) {
			swap(figureArray, smaller, k);
			heapify(figureArray, smaller, end);
		}
	}

	static void heapSort(Figure[] figureArray) {
		buildHeap(figureArray);
		for (int end = figureArray.length - 1; end >= 1; --end) {
			swap(figureArray, 0, end);
			heapify(figureArray, 0, end - 1);
		}
	}

}
