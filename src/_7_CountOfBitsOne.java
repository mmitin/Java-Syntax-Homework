
import java.util.Scanner;

public class _7_CountOfBitsOne {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int br=0;
		System.out.print("Enter integer number n->");
		int n=input.nextInt();
		String binary =Integer.toBinaryString(n);
		for (int i =0; i<binary.length();i++){
			if ((binary.charAt(i))==('1')){
				br++;
			}
		} 
		System.out.println("The count of bits 1 in the binary representation of n="+n+ " is "+br);
	}
}