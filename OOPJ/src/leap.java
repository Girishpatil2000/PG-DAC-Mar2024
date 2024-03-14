import java.util.Scanner;
public class leap {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Leap Year :");
		int Year=scanner.nextInt();
		if(Year%4==0 || Year % 100==0 && Year%400==0)
		{
			System.out.println("Leap Year");
			
		}
		else
		{
			System.out.println("Not Leap Year");
		}
		

	}

}
