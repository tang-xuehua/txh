package gg;

import java.util.Random;

public class GenerateEquation {
	static final int UPPER = 100;
	static final int LOWER = 0;
	private int leftOperator;
	private int rightOperator;
	private char operator;
	private int result;
	public int getLeftOperator() {
		return leftOperator;
	}
	public int getRightOperator() {
		return rightOperator;
	}
	public char getOperator() {
		return operator;
	}
	public int getResult() {
		return result;
	}
	public GenerateEquation(){}
	public GenerateEquation(int leftOperator, int rightOperator, char operator, int result) {
		this.leftOperator = leftOperator;
		this.rightOperator = rightOperator;
		this.operator = operator;
		this.result = result;
	}
	public GenerateEquation generateAddition(){
		int left, right, result;
		Random random = new Random();
		left = random.nextInt(UPPER + 1);
		do{
			right = random.nextInt(UPPER + 1);
			result = left + right;
		}while(result > UPPER);
		GenerateEquation ge1 = new GenerateEquation(left, right, '+', result);		
		return ge1;
	}
	public GenerateEquation generateSubtraction(){
		int left, right, result;
		Random random = new Random();
		left = random.nextInt(UPPER + 1);
		do{
			right = random.nextInt(UPPER + 1);
			result = left - right;
		}while(result < LOWER);
		GenerateEquation ge2 = new GenerateEquation(left, right, '-', result);		
		return ge2;
	}
	public GenerateEquation generateEquation(){
		int intOperator;
		Random random = new Random();
		intOperator = random.nextInt(2);
		if(intOperator == 1) return generateAddition();
		else return generateSubtraction();
	}		
	public boolean IsEquals(GenerateEquation ge){
		return (leftOperator == getLeftOperator() && rightOperator == getRightOperator() && operator == getOperator()) || (leftOperator == getRightOperator() && rightOperator == getRightOperator() && operator == getOperator());
	}
}