
import java.util.Scanner;

public class _8_CountOfEqualBitPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int br=0;
		System.out.print("Enter integer number n->");
		int n=input.nextInt();
		String binary =Integer.toBinaryString(n);
		for (int i =0; i<binary.length()-1;i++){
			if ((binary.charAt(i))==binary.charAt(i+1)){
				br++;
			}
		} 
		System.out.println(br);
	}
}