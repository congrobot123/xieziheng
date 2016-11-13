import java.util.Scanner;

public class Ex1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();

	
		String str2 = str1.substring(2,4);
		String str3 = str1.substring(1,2);
		String str4 = str1.substring(4,5);

		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
	}
}
