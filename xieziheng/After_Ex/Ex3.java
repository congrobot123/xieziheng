public class Ex3 
{	
	public static int Share(int x)
	{
		x = 5*x + 1;
		return x;
	}

	public static void main(String[] args) 
	{
		int x = 1;//��Ϊ������������ٷֵ�һ����������x����1
		for(int i =0;i < 5;i++)
		{
			x = Share(x);
			//System.out.println(x);
		}
		System.out.print("��̲ԭ�������У�");
		System.out.println(x + "�����ӡ�");
	}
}


