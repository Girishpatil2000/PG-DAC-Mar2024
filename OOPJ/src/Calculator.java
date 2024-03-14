import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char operator;
		System.out.println("enter Two numbers");
		int X=scanner.nextInt();
		int Y=scanner.nextInt();
		System.out.println("enter operator");
		operator = scanner.next().charAt(0);
		
//		char operator;
		switch(operator)
		{
		case '+':
		{
			int result=X+Y;
			System.out.println("Addition is :" +result);
			break;
		}
			
		
		case '-':
		{
			int result=X-Y;
			System.out.println("Subtraction is :" +result);
			break;
		}
		case '*':
		{
			int result=X*Y;
			System.out.println("Multiplication is :" +result);
			break;
		}
		case '/':
		{
			int result=X/Y;
			System.out.println("Division is :" +result);
			break;
		}
		default:
			System.out.println("Enter valid operator");
			
		
			 
			
		

	}

}
}
