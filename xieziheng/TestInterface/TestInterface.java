public class TestInterface 
{
	public static void main(String[] args) 
	{
		Son son = new Son(5);
		System.out.println(son.Count(4,6));
		son.Disp();
	}
}

interface Father
{
	public int Count(int a,int b);
}

interface Mother
{
	public void Disp();
}

class Son implements Father,Mother
{	
	public int a;
	public int Count(int a,int b)
	{
		int c = a + b;
		return c;
	}
	
	public void Disp()
	{
		System.out.println("This is Mother's funcation." + a);
	}
	
	Son(int a)
	{
		this.a = a;
	}
}