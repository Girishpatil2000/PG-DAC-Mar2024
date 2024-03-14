import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter Weight in kg");
		int Weight =input.nextInt();
		System.out.println("enter height in meter square");
		int Height=input.nextInt();
		
		int bmi=Weight/Height;
		if (bmi < 18.5) {
            System.out.println("underweight.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println(" normal weight.");
        } else {
            System.out.println(" overweight.");
        }
		

	}

}
