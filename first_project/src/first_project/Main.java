package first_project;
import java.util.Scanner;

public class Main {
	
	//메소드 실습
	public static double sum1(double num1, double num2) {
		return num1 + num2;
	}
	public static double sum2(double num1, double num2) {
		return num1 - num2;
	}

	public static double sum3(double num1, double num2) {
		return num1 / num2;
	}

	public static double sum4(double num1, double num2) {
		return num1 * num2;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 System.out.print("Hello World");
		
		Scanner scanner = new Scanner(System.in);
		
//첫 실습		
//		System.out.println("이름을 입력하세요");
//		String name =scanner.next();
//		System.out.println("나이를 입력하세요");
//		int age = scanner.nextInt();
//		System.out.println("안녕하세요! 안"+name+"님"+"("+age +"세"+")");
		
//조건문 실습1		
//		System.out.println("나이를 입력하세요");
//		
//		int age = scanner.nextInt();
//		
//		if (age<=7) {
//			System.out.println("유아");
//		}else if (age<=13 && age>7){
//			System.out.println("초등학생");
//		}else if (age<=16 && age>13){
//			System.out.println("중학생");
//		}else if (age<=19 && age>16){
//			System.out.println("고등학생");
//		}else{
//			System.out.println("성인");
//		}	
//		
//조건문 실습2
//		System.out.println("이름을 입력하세요");
//		String name =scanner.next();
//		if(name.equals("홍길동")) {
//			System.out.println("남자");
//		}else if (name.equals("성춘향")){
//			System.out.println("여자");
//		}else {
//			System.out.println("모르겠어요");
//		}
//반복문 실습
//		System.out.println("숫자를 입력하세요");
//		int num = scanner.nextInt();
//		int i = 1;
//		while(i <= num) {
//			System.out.print(i);
//			i++;
//		}
//메소드 실습
		System.out.println("숫자 두 개를 입력하세요");
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		
		System.out.println("덧셈 결과 : " + sum1(num1,num2));
		System.out.println("뺼셈 결과 : " + sum2(num1,num2) );
		System.out.println("나눗셈 결과 : " + sum3(num1,num2));
		System.out.println("곱셈 결과 : " + sum4(num1,num2));
	}
}
