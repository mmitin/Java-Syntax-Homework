import java.util.Scanner;

public class _6_FormattingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter integer number->");
		int num=input.nextInt();
		System.out.print("Enter float number->");
		float float1=input.nextFloat();
		System.out.print("Enter float number->");
		float float2=input.nextFloat();
		String hex =Integer.toHexString(num);
		String binary=Integer.toBinaryString(num);
		binary=("0000000000"+binary).substring(binary.length());
		System.out.printf("|%-10s|%s|%10.2f|%-10.3f|",hex,binary,float1,float2);
	}
}

