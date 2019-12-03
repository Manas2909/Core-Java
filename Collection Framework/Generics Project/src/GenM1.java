
class GenM1
{
	<X>void display(X arr[])
	{
		for(X i:arr)
		{
			System.out.println(i);
			
		}
	}
	
	
	public static void main(String args[])
	{
		String str[]={"abc def","mno pqr"};
		GenM1 g1=new GenM1();
		g1.display(str);

	
		Integer arr1[]={10,9,7};
		g1.display(arr1);
		
	}
}
