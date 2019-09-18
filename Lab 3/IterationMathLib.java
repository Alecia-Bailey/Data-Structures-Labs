
public class IterationMathLib extends MathLib {

	@Override
	public int gcd(int x, int y) {
		while (y!=0) {
			if (x>=y && x!=0) {
				int temp = x;
				x=y;
				y = temp % x;
			}
		}
		return x;
	}

	@Override
	public int ack(int x, int y) {
		while (x!=0 && y!=0) {
			
		}
		return 0;
	}

	@Override
	public int fib(int n) {
		System.out.println ("Iterative fib not implemented");
		return 0;
	}

	@Override
	public int hanoi(int n) {
		System.out.println ("Iterative hanoi not implemented");
		return 0;
	}

}
