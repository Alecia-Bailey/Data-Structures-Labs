package Math;

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
		while (x!=0) {
			if (x!=0 && y!=0) {
				return ack (x-1, ack(x, y-1));
			}
			return y+1;
			
		}
		return ack(x-1,1);
	}

	@Override
	public int fib(int x) {
		while(x!=0) {
			if(x>1) {
				return fib(x-1) + fib(x-2);
			}
			return 1;
		}
		return 0;
	}

	@Override
	public int hanoi(int n) {
		while(n!=1) {
			if(n>1) {
				return 2 * hanoi(n-1)+1;
			}
		}
		return 1;
	}

}
