package gg;

public class GenerateExercise {
	static final int MAX_NUMBER = 50;
	static final int COLUMN_NUMBER = 5;
	private GenerateEquation equationList[] = new GenerateEquation[MAX_NUMBER];
	
	public void GenerateExercises(){
		GenerateEquation ge3, ge4 = new GenerateEquation();
		for(int i = 0; i < MAX_NUMBER; i++){
			ge3 = ge4.generateEquation();
			while(contains(ge3, i-1)){
				ge3 = ge4.generateEquation();
			}
			equationList[i] = ge3;
		}
	}
	public boolean contains(GenerateEquation ge3, int length){
		boolean appear = false;
		for(int i = 0; i <= length; i++){
			if(ge3.equals(equationList[i])){
				appear = true;
				break;
			}
		}
		return appear;
	}
	public void formateDisplay(){
		for (int i = 0; i < equationList.length; i++) {
			GenerateEquation ge5 = equationList[i];
            System.out.print(ge5.getLeftOperator()+""+ge5.getOperator()+""+ge5.getRightOperator()+"=  ");
            	if((i+1) % COLUMN_NUMBER == 0)System.out.println();
         }	
	}
	public static void main(String[] args) {
		GenerateExercise ge = new GenerateExercise();
		ge.GenerateExercises();
		ge.formateDisplay();
	}
}