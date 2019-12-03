/*
 * Variable length paremeter:
 * it is a new concept of java.
 * 
 * class MyClass1
 * {
 * 	void display1(String...str)
 * {
 * 
 * here the str parametr has been declared using String class type,and using 3 dots in title of display1() definition.
 * 
 * so str is called variable length parameter of String type.
 * 
 * this means that when we call the display1() method in the pgm, we can pass zero or one or any number of input
 * arguments of String type.
 * 
 * the variable length parameter is internally treated by java compiler as a 1d array variable of that type.
 * 
 * so we can also pass a 1d array object of that data type as argument to a method having variable length parameter.
 * 
 * 
 * 
 * 
 * 
 * }
 * 
 * }
 * 
 * 
 */

class MyClass1
 {
 	void display1(String...arr)
  {
 		System.out.println("\n the elements of variable length parameter using normal for loop are");
 		for(int i=0;i<arr.length;i++)
 		{
 			System.out.println(arr[i]);
 		}
 		
 		System.out.println("\n the elements of variable length parameter using for each loop are");
 		for(String str1:arr)
 		{
 			System.out.println(str1);
 		}
 		//because the variable length parameter is internally treated by java compiler as a 1d array variable
 		//of that type, so we can perform same operations on variable length parameter as we can do on a 1d array of that type
 		
 		
  }
 }

public class Pgm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass1 mc1=new MyClass1();
		mc1.display1();
		//here JVM automatically creates a 1d array object of String type and size 0 elements and passed it as argument to variable length parameter
		
		
		mc1.display1("abc def");
		//here JVM automatically creates a 1d array object of String type and size 1 element and value "abc def" and passed it as argument to variable length parameter
		
		mc1.display1("abc def",new String("mno pqr"));
		//here JVM automatically creates a 1d array object of String type and size 2 element and values "abc def" and "mno pqr" resp. of elements of indexes 0 and 1 resp. and passed it as argument to variable length parameter
		
		String arr1[]= {"abc def","mno pqr"};
		mc1.display1(arr1);
		
	}

}
