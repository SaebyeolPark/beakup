package algorithmHW;

import java.util.Scanner;

public class SelectionMain {
    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static int partition(int[] a, int start, int end) {
        int value = a[end];
        int i = start - 1;
        for (int j = start; j <= end - 1; ++j)
            if (a[j] < value)
                swap(a, ++i, j);
        swap(a, i + 1, end);
        return i + 1;
    }

    // a 배열의 start~end 에서 nth 번째 작은 값을 리턴한다.
    static int select(int[] a, int start, int end, int nth) {
        if (start >= end) return a[start];
        int middle = partition(a, start, end);
        int middle_nth = middle - start + 1;
        if (nth == middle_nth) return a[middle];
        if (nth < middle_nth)
            return select(a, start, middle-1, nth);
        else
            return select(a, middle+1, end, nth - middle_nth);
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);

    	System.out.println("hw5_1: 박새별");

    	System.out.println("정수 개수 입력: ");
    	int n=sc.nextInt();
    	int middle=n/2;
    	if(n%2!=0) {
    		middle++;
    	}
    	int[] number = new int[n];
    	System.out.println(n+"개의 정수 입력: ");
        for (int i = 0; i < number.length; ++i) {
            number[i] = sc.nextInt();
        }

        System.out.printf("중앙값 = " + select(number, 0, number.length-1, middle));

        sc.close();
    }

}
