public class Ex2 
{
	public static void main(String[] args) 
	{
		String A = "A1B2C3D4E5F6G7H8";
		char[] a = A.toCharArray();

		int[] str1 = new int[8];
		char[] str2 = new char[8];

		int flag = 1;
		int j = 0;
		int k = 0;
		for(int i = 0;i < 16;i++,flag++)
		{
			if(flag%2 == 0)
			{
				str1[j] = a[i] - 48;
				j++;
			}
			else
			{
				str2[k] = a[i];
				k++;
			}
		}
		
		
		for(int temp : str1)
		{
			System.out.print(temp);
		}
		System.out.print("\n");
		System.out.println(str2);
	}
}
