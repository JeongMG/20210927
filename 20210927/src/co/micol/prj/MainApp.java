package co.micol.prj;

import co.micol.prj.member.Member;

public class MainApp {
	public static void main(String[] args) {
//		Calculator calculator = new Calculator(); // 생성, Instance
//		calculator.setFistNum(200); // setter를 통해 값을 전달.
//		calculator.setSecondNum(20); 

//		Calculator calculator = new Calculator(20, 20); // 생성자에 의한 전달방법
//
//		int sum = calculator.sum();
//		int sub = calculator.sub();
//
//		System.out.println("덧셈의 결과 = " + sum);
//		System.out.println("뺄셈의 결과 = " + sub);

//		MyCalculator myCalculator = new MyCalculator();
//		
//		myCalculator.sum(10, 10); // void
//		float f = myCalculator.sum(5.0f, 5); // float
//		System.out.println(f);
//		
//		int n = myCalculator.sum(5); // int
//		System.out.println(n);
//		
//		double d = myCalculator.sum(10.2, 10.2);
//		System.out.println(d);
//		
//		double d2 = myCalculator.sum(10.1, 100);

//		CompareMax compareMax = new CompareMax(100, 50);
//		int max = compareMax.getMax();
//		System.out.println("두 수 중에 큰 값은  " + max);
//		
//		Calculator calculator = new Calculator();
//		calculator.setFirstNum(200);
//		calculator.setSecondNum(500);
//		System.out.println("전달된 두 수의 합 =  " + calculator.sum());

		Member member = new Member("hong", "1234", "홍길동", "대구광역시");
		member.run();
	}
}
