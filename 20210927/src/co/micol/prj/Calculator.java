package co.micol.prj;

public class Calculator { // Class 정의
	private int firstNum;
	private int secondNum;
	
	public Calculator() { // 기본 생성자
		
	}
	
	public Calculator(int n, int m) { // 생성자를 통한 값 전달 방법
		this.firstNum = n;
		this.setSecondNum(m);
	}
	
	public void setFirstNum(int n) { // setter
		this.firstNum = n;
	}
	
	public int getFirstNum() { // getter
		return firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public int sum() {
		return firstNum + secondNum;
	}
	
	public int sub() { 
		return firstNum - secondNum;
	}
}
