package co.micol.prj.test;

public class ForTest {
	private int n;
	private int m;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}
	
	private void result() {
		int sum = 0;
		for(int i = n; i <= m; i ++) {
			sum += i;
		}
		System.out.println("�� �� ������ ������ �� : " + sum);
	}
	
	public void run() {
		result();
	}
}
