public class EX4 
{
	public static void main(String[] args) 
	{
		int[] a = {1,3,5,7,9};
		System.out.println("����˳��֮ǰ:");
		for(int t : a)
		{
			System.out.println(t);
		}
		int low = 0;
		int high = 4;
		int temp = 0;
		while(low < high)
		{
			temp = a[low];
			a[low] = a[high];
			a[high] = temp;
			low++;
			high--;
		}
		System.out.println("����˳��֮��:");
		for(int t : a)
		{
			System.out.println(t);
		}
	}
}