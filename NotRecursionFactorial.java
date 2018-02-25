public class NotRecursionFactorial {
	int number;
	public int factor(int number) {
		this.number = number;
		int value = 1;
		for(int i = 1; i <= number;i++) {
			value *= i;  
		}
		return value;
	}
	
	public static void main(String args[]) {
		NotRecursionFactorial fact = new NotRecursionFactorial();
		System.out.println(fact.factor(5));
	}
}
