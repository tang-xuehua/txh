package gg;

import java.util.Random;

public class Exercise {
	static final int MAX_NUMBER = 50;
	static final int COLUMN_NUMBER = 5;
	private BinaryOperator equationList[] = new BinaryOperator[MAX_NUMBER];

	public void generateExercise(){
		BinaryOperator bo;
		for(int i = 0; i <  MAX_NUMBER; i++){
			bo = generateOperation();
			while(contains(bo, i-1)){
				bo = generateOperation();
			}
			equationList[i] = bo;
		}
		}
	public void generateAdditionExercise(){
		BinaryOperator bo;
		for(int i = 0; i <  MAX_NUMBER; i++){
			bo = new AdditionOperation();
			while(contains(bo, i-1)){
			bo = new AdditionOperation();
			}
			equationList[i] = bo;
		}
	}
	public void generateSubstractExercise(){
		BinaryOperator bo;
		for(int i = 0; i <  MAX_NUMBER; i++){
			bo = new SubtractOperation();
			while(contains(bo, i-1)){
			bo = new SubtractOperation();
			}
			equationList[i] = bo;
		}
	}
	private BinaryOperator generateOperation() {
		int intOperator;
		Random random = new Random();
		intOperator = random.nextInt(2);
		if(intOperator == 1) return new AdditionOperation();
		else return new SubtractOperation();
	}
	
	public boolean contains(BinaryOperator bo, int length){
		boolean appear = false;
		for(int i = 0; i <= length; i++){
			if(bo.equals(equationList[i])){
				appear = true;
				break;
			}
		}
		return appear;
	}
	public void formateDisplay(){
		for (int i = 0; i < equationList.length; i++) {
			BinaryOperator bo1 = equationList[i];
            System.out.print(bo1.getLeftOperator()+""+bo1.getOperator()+""+bo1.getRightOperator()+"=  ");
            	if((i+1) % COLUMN_NUMBER == 0)System.out.println();
         }	
	}
	public static void main(String[] args) {
		Exercise exercise = new Exercise();
		//exercise.generateAdditionExercise();//生成50个加法算式
		//exercise.generateSubstractExercise();//生成50个减法算式
		exercise.generateExercise();////生成50个混合算式
		exercise.formateDisplay();
	}
}