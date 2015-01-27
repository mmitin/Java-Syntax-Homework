import java.util.Scanner;
public class _3_PointsInsideAFigure {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter coordinates for your point ->");
		float aX = input.nextFloat();
		float aY= input.nextFloat();
		if(aX>=12.5 && aX<=17.5 && aY>=6 && aY <=13.5){
			System.out.println("Inside");
		}
		else if  (aX>=20 && aX<=22.5 && aY>=6 && aY <=13.5){
			System.out.println("Inside");
		}
		else if ( aX >17.5 &&  aX <20 && aY >= 6 && aY<=8.5){
			System.out.println("Inside");
		}
		else{
			System.out.println("Outside");
		}
	}
}