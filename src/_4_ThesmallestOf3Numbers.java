import java.text.DecimalFormat;
import java.util.Scanner;

public class _4_ThesmallestOf3Numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		DecimalFormat formatter =new DecimalFormat("#.####");
		System.out.print("Enter three numbers->");
		float a = input.nextFloat();
		float b = input.nextFloat();
		float c = input.nextFloat();
		float smallest=a;
		if (smallest>b){
			smallest=b;
		}
		if (smallest>c){
			smallest=c;
		}
		System.out.println("The smallest number is ->"+ formatter.format(smallest));			
	}
}
