package test;

/** Main */
public class Main {

	/** Main */
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = fib(b);
		System.out.println(c + 1);
	}

	/** Fib */
	protected static int fib(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
}
