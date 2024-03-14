import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
//		System.out.println("Enter Your Marks :");
		while(true)
		{
			System.out.println("Enter Your Marks :");
		
		
		int marks=scanner.nextInt();
		
		char grade;
		if(marks >= 90 && marks<=100)
		{
			System.out.println("Grade A");
			
			
		}
		else if (marks >=60 && marks<=90)
		{
			System.out.println("Grade B");
		}
		else if (marks >=35 && marks<=60)
		{
			System.out.println("Grade c");
		}
		else if (marks<35 && marks>0)
		{
			System.out.println("FAIL");
			
		}
		else
		{
			System.out.println("Enter Valid Marks between 1 to 100");
			
		}
		}
		
//		scanner.close();
		
			
		

	}
	

}
