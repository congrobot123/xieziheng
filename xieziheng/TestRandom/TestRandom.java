import java.util.Scanner;
import java.util.Random;
import java.util.TreeSet;

public class TestRandom 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int n = sc.nextInt();
		Random ran = new Random();
		TreeSet ts =new TreeSet((o1,o2)->
		{
			int b = (int)o1;
			int c = (int)o2;
			return b > c ? 1 : b < c ? -1 : 0;
		});
		
		int sum = 0;
		for(int i = 0;i < n;i++)
		{
			int a = ran.nextInt();
			ts.add(a);
		}
		for(Object temp : ts)
		{
			sum = sum + (int)temp;
		}
		System.out.println(ts);
		System.out.println("ƽ������" + sum/n);
	}
}