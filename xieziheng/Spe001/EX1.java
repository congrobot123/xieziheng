import java.util.ArrayList;

public class EX1 
{
	public static void main(String[] args) 
	{
		String A = "a,b,c,d,e,f,g";//静态初始化String
		char[] B = A.toCharArray();//将String打成字符数组

		ArrayList<String>  strArray = new ArrayList<String> ();
		
		for(int i = 0;i < B.length;i++)
		{
			if(B[i] == 44)//如果等于逗号的ASSIC值就跳过循环
			{
				continue;
			}
			else
			{	String D = B[i] + "";//char类型转换成string类型
				strArray.add(D);//将元素填加至表尾
			}
		}

		for(Object temp : strArray)
		{
			System.out.print(temp);
			System.out.print(" ");
		}
	}
}
