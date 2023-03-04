package first_project;

public class Rectangle {
	
	private int width;
	private int height;
	public static int count;
	
	public Rectangle(int width) {
		this.width = width;
	}
	public int area() {
		return width + height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
//scanner 여기쓰는 경우가 있는데, 보통 main에서 입력받는다.

}
