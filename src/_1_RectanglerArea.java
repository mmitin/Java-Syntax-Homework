import java.util.Scanner;
public class _1_RectanglerArea {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the sides of a rectangle->");
		int a = input.nextInt();
		int b=input.nextInt();
		System.out.println("Rectangle's area is:" + a*b);		
	}
}
