package t;
import java.util.Random;
public class txh {
		public static void main(String[] args) {
			int[] a=new int [50];
			int[] b=new int [50];
			int[] c=new int [50];//chars�����洢�������0���������1����ӷ�
			printFront();
			generateEquations(a,b,c);
			printExercise(a,b,c);
			printBack();
			printCalculations(a,b,c);

		}
		public static void  printFront() {
			System.out.println("�����ʮ��100���ڵļӼ�����ʽ��ϰ�⣺");
		}
		public static void generateEquations(int[] a,int[] b,int[] c) {
			
			Random random=new Random();
			for(int i=0;i<50;i++) {
				a[i]=random.nextInt(101);
				b[i]=random.nextInt(101);
				c[i]=random.nextInt(2);
				if(c[i]==0) {
					if(a[i]-b[i]<0){
						i--;
						continue;
					}		
				}
				else {
					if(a[i]+b[i]>100) {
						i--;
						continue;
					}
					
				}
				int flag=0;
				for(int j=i-1;j>=0;j--) {
					if(a[i]==a[j]&&b[i]==b[j]&&c[i]==c[j]) {
						flag=1;
						break;
					}
				}
				if(flag==1) {
					i--;
					continue;
				}
			}
		}
		public static void printExercise(int[] a,int[] b,int[] c) {
			for(int i=0;i<50;i++) {
				if(c[i]==0) {
					System.out.print(" "+a[i]+"-"+b[i]+"="+"  ");
				}
				else{
					System.out.print(" "+a[i]+"+"+b[i]+"="+"  ");
				}
				if((i+1)%5==0) {
					System.out.println("  ");
				}
				}
		}
		public static void  printBack() {
			System.out.println("  ");
			System.out.println("ÿ�����г���ɵõ�һ��50�����ϰ�⼯��");
		}
		public static void printCalculations(int[] a,int[] b,int[] c) {
			for(int i=0;i<50;i++) {
				if(c[i]==0) {
					System.out.print(a[i]-b[i]+"  ");
				}
				else{
					System.out.print(a[i]+b[i]+"  ");
				}
				if((i+1)%5==0) {
					System.out.println("  ");
				}
			}
		}
	}