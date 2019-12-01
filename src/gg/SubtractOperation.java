package gg;

public class SubtractOperation extends BinaryOperator{
	public SubtractOperation() {
		generateBinaryOperator('-');
	}
	int calculate(int left, int right) {
		return left - right;
	}
	boolean check(int results) {
		return results >= LOWER;
	}
}