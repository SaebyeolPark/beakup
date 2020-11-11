//***************************
// 파일명: Circle
// 작성자: 박새별
// 작성일: 20200411
// 내용: 원과 반지름 구하기 원 클래스
//***************************
package algorithmHW;

public class Circle implements Figure {
	private double radius;

	public Circle() {
	}

	public double getradius() {
		return radius;
	}

	public void setradius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "원 반지름 =" + radius + " 면적 = " + getArea();
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
