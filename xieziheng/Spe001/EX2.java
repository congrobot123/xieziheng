import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EX2 
{
	public static void main(String[] args) 
		throws Exception
	{
		Scanner sc = new Scanner(new File("C:\\Users\\Administrator\\Desktop\\JavaCode\\src\\Spe001\\read.txt"));

		System.out.println("将文件中的内容存入一个char[] :");
		ArrayList<String>  strArray = new ArrayList<String> ();
		while(sc.hasNextLine())
		{
			char[] c = sc.nextLine().toCharArray();
			for(int temp : c)
			{	
				System.out.print(temp);
				System.out.print(" ");
			}
			String s1 = c[2] + "" + c[3] + "";
			strArray.add(s1);
			System.out.println();
		}
		
		Map map = new HashMap();
		for(String temp1 : strArray)
		{	
			int count = 0;
			String s2 = temp1;
			for(String temp2 : strArray)
			{
				if(s2.equals(temp2))
				{	
					count++;
					if(count > 1)
					{
						map.put(temp2,count);
					}
				}
			}
		}
		System.out.println(map);
	}
}
