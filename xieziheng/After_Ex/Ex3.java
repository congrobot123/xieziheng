public class Ex3 
{	
	public static int Share(int x)
	{
		x = 5*x + 1;
		return x;
	}

	public static void main(String[] args) 
	{
		int x = 1;//因为第五个猴子最少分到一个，所以设x等于1
		for(int i =0;i < 5;i++)
		{
			x = Share(x);
			//System.out.println(x);
		}
		System.out.print("海滩原来最少有：");
		System.out.println(x + "个桃子。");
	}
}


