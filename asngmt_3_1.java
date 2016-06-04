import java.util.Scanner;
public class asngmt_3_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number of your choice");
		number = obj.nextInt();
		System.out.print("The square root of " + number + " is ");
		System.out.printf("%.2f %s %.2f",Math.sqrt(number)," and it's cube root is ",Math.cbrt(number));
		
		
		

	}

}
