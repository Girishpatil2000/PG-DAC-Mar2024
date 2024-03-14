package in.mumbai.DAC;

public class widening {

	public static void main(String[] args) {
		int num1=10;
		double num2=num1;
		System.out.println("convert int to double :"+num2);
		
		float num3=num1;
		System.out.println("convert int to float :"+num3);
		
		boolean num4=(num1==10);
		System.out.println("convert int to boolean :"+num4);
		
		String str=Integer.toString(num1);
		System.out.println("convert int to string :"+str);
		
		

	}

}
