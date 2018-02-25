public class FibbonachiNumber {
	int number;
	public int fibo(int number) {
		this.number = number;
		if(number == 1 || number == 2) {
			return 1;
		}
		return fibo(number - 1) + fibo(number -2);
	}
	
	public static void main(String args[]) {
		FibbonachiNumber fi = new FibbonachiNumber();
		System.out.println(fi.fibo(7));
	}
}
