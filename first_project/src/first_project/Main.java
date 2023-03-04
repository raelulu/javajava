package first_project;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Rectangle> rect = new ArrayList<>();

		while (true) {
			System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
			int width = scanner.nextInt();
			int height = scanner.nextInt();

			if (width == 0 && height == 0) break;

			Rectangle rectangle1 = new Rectangle(width);
			rectangle1.setHeight(height);
			rect.add(rectangle1);
			Rectangle.count +=1;
		}

		for (Rectangle rectangle : rect) {
			System.out.println("가로 길이는 : " + rectangle.getWidth());
			System.out.println("세로 길이는 : " + rectangle.getHeight());
			System.out.println("넓이는 : " + rectangle.area());
			System.out.println("----------------------------");
		}
		System.out.println("Rectangle 인스턴스의 개수는 : " + Rectangle.count);



	}

}
