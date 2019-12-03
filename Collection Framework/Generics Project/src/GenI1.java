//generic interface
//Student s;
interface MyI1<X>
{
	public void tellColor(X p);
}


class MyC1<X> implements MyI1<X>
{
	public void tellColor(X p)
	{
		String str=p.getClass().getName();
		System.out.println(str);
	}
}

class Blue
{
	
	
}


class Green
{
	
}

class GenI1 
{
	public static void main(String args[])
	{
		MyC1<Blue> mc1=new MyC1<Blue>();
		
		mc1.tellColor(new Blue());
		
MyC1<Green> mc2=new MyC1<Green>();
		
	Green g1=new Green();
		mc2.tellColor(g1);
		
		
	}
}
