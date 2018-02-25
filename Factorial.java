public class Factorial {
	int number;
	public int factor(int number) {
		this.number = number;
		if(number == 0) {
			return 1;
		}
		return number * factor(number - 1);
	}
	public static void main(String args[]) {
		Factorial fact = new Factorial();
		System.out.println(fact.factor(5));
	}
}
