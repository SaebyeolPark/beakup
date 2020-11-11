//***************************
// 파일명: Triangle
// 작성자: 박새별
// 작성일: 20200411
// 내용: 원과 반지름 구하기 삼각형 클래스
//***************************
package algorithmHW;

public class Triangle implements Figure {

	private double width, height;

	public Triangle() {
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "삼각형 밑변 = " + width + " 높이 = " + height + " 면적 = " + getArea();
	}

	@Override
	public double getArea() {
		return width * height / 2.0;
	}

}
