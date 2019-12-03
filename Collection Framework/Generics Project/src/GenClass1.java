/*
 * class MyClass
 * {
 * 		Integer i;
 * 
 * }
 */
class GenClass1<X>
{
	X i;
	GenClass1(X i)
	{
		this.i=i;
	}
	
	X getObj()
	{
		return i;
	}

}



class Main1
{
	public static void main(String args[])
	{
		GenClass1<String> gc1=new GenClass1<String>("kaveesh nadkarni");
		//type erasure
		System.out.println(gc1.getObj());
		
		
		
		GenClass1<Integer> gc2=new GenClass1<Integer>(4);
		//type erasure
		System.out.println(gc2.getObj());
	}
}
