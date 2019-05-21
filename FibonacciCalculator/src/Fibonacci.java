
public class Fibonacci {

	
	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			long t = System.currentTimeMillis();
			long f = fib(i);
			System.out.println(i + " - " + f + " " + ((System.currentTimeMillis() - t) / 1000.0));
			System.out.flush();
		}

	}
	
	public static long fib(int i) {
		if (i < 2) {
			return 1;
		} else {
			return fib(i - 1) + fib(i - 2);
		}
	}

}
