import java.util.ArrayList;

public class EX1 
{
	public static void main(String[] args) 
	{
		String A = "a,b,c,d,e,f,g";//��̬��ʼ��String
		char[] B = A.toCharArray();//��String����ַ�����

		ArrayList<String>  strArray = new ArrayList<String> ();
		
		for(int i = 0;i < B.length;i++)
		{
			if(B[i] == 44)//������ڶ��ŵ�ASSICֵ������ѭ��
			{
				continue;
			}
			else
			{	String D = B[i] + "";//char����ת����string����
				strArray.add(D);//��Ԫ���������β
			}
		}

		for(Object temp : strArray)
		{
			System.out.print(temp);
			System.out.print(" ");
		}
	}
}
