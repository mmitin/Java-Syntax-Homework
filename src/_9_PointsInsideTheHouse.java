import java.util.Scanner;
public class _9_PointsInsideTheHouse {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter coordinates for your point ->");
		double aX = input.nextDouble();
		double aY= input.nextDouble();
		double k1=(aX-12.5)*(3.5-8.5)-(aY-8.5)*(17.5-12.5);
		double k2=(aX-17.5)*(8.5-3.5)-(aY-3.5)*(22.5-17.5);
		double k3=(aX-22.5)*(8.5-8.5)-(aY-8.5)*(12.5-22.5);
		
		if(aX>=12.5 && aX<=17.5 && aY>=8.5 && aY <=13.5){
			System.out.println("Inside");
		}
		
		else if  (aX>=20 && aX<=22.5 && aY>=8.5 && aY <=13.5){
			System.out.println("Inside");
		}	
		
		else if (aY>=3.5 && aY<8.5 && aX+aY==21){
			System.out.println("Inside");
		 }
		else if (aY>=3.5 && aY<8.5 && aX+aY==26){
			System.out.println("Inside");
		 }
		
		else if (aY==8.5 && aX>=17.5 && aX<=20){
			System.out.println("Inside");
		   }
		else if (k1>0 && k2>0 && k3>0){
			System.out.println("Inside");
		}
		
		else if (k1<0 && k2<0 && k3<0){
			System.out.println("Inside");
		}
		
		else {
			System.out.println("Outside");
		}
	}
}


