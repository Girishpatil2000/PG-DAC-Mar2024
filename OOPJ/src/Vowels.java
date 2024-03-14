import java.util.Scanner;
public class Vowels {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char ch;
		ch=scanner.next().charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println("Vowels");
		}
		else
		{
			System.out.println("consonant");
		}
				
			
		
		

	}

}
