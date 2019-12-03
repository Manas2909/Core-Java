/*
String:
String is a predefined class of java.lang package. In C and C++, string is a 1d char array which stores a work or sentence i.e. a string value.

But in java, a string is an object of String class. The string value of an string object is always inside double quotes.

There are 4 ways for creating String class object:
1. without using new keyword.
when we mention a string class object without using new keyword, then that string class object is not created on heap memory but is created in a special section of RAM memory called as string pool memory. The main speciality of the string pool memory is that on string pool memory,we cannot have multiple different objects of String class with same string value but different hashcodes or addresses in string pool memory.

e.g.
String str1="abc def";
String str2="abc def";
after execution of al the 2 statements above, there will be one and only 1 object of String class created on string pool memory with the string value "abc def". so str1==str2 returns true because str1 and str2 refer to same object of String class on string pool memory and so they contain the same reference or same hashcode.

NOTE:
When the == operator is used directly between 2 different reference variables, then the == operator checks whether the 2 reference variables refer to same object or not.


2.  using new keyword.
when we mention a string class object  using new keyword, then that string class object is created on heap memory which just like string pool memory is also part of RAM memory. The main speciality of the heap memory is that on heap memory,we can have more than different objects of String class with same string value but different hashcodes or addresses in heap memory.

e.g.
String str1=new String("abc def");
String str2=new String("abc def");
after execution of al the 2 statements above, there will be 2 different objects of String class created on heap memory with the same string value "abc def". so str1==str2 returns false because str1 and str2 refer to differents object of String class on heap memory with same string value "abc def" and so they contain the different references or different hashcode.


3. by converting the 1d char aray into String class object.

e.g.
char arr1[]={'a','b','c'};

String str1=new String(arr1);
here a new object of String class is created with string value obtained by extracting all characters of the 1d char array arr1 and so the string value of the string object str1 is "abc".

char arr1[]={'a','b','c'};

String str1=new String(arr1,1,2);

here the 2nd argument 1 passed to constructor String class tells the JVM to begin from character at index 1 in arr1 i.e. from 'b' and then the 3rd argument 2 passed to constructor of String class tells JVM to extract 2 characters from arr1 to get string value "bc"


here a new object of String class is created with string value "bc".

RULE:
String class object whether creates on heap memory or on string pool memory is always immutable. This means that the string value of a string class object can never be changed. But this doesnt mean that the string class reference variable is immutable. so a reference variable of String class can refer to different objects of String class during different times during same pgm execution.

e.g.
String str1="abc def";
here str1 now refers to a new string class object on string pool memory with value "abc def".

str1.toUpperCase();
where to toUpperCase() is a predefined non static member method of String class which converts the case of the characters of the string value to upper case.

but during execution of str1.toUpperCase(), the toUpperCase() method cannot change the case of the characters of the current String object referred to by str1.

so str1.toUpperCase() will create a new string class object with string value "ABC DEF" in upper case. But because we have not assigned the expression or statement str1.toUpperCase() to any reference variable of String class, so the new object created by str1.toUpperCase() and witht string value "ABC DEF" in upper case is lost in RAM memory. so str1 still refers to same old object of String class on string pool memory with string value "abc def" in lower case. 

so System.out.println(str1) still displays "abc def".



String str1="abc def";
here str1 now refers to a new string class object on string pool memory with value "abc def".

str1=str1.toUpperCase();

 during execution of str1=str1.toUpperCase(), the toUpperCase() method cannot change the case of the characters of the current String object referred to by str1.

so str1.toUpperCase() will create a new string class object with string value "ABC DEF" in upper case. But because we have assigned the expression or statement str1.toUpperCase() to same reference variable str1 of String class, so the new object created by str1.toUpperCase() and with string value "ABC DEF" in upper case is not lost in RAM memory and instead the reference to the new object of String class with string value "ABC DEF" is assigned to str1. so str1 now refers to newly created object of String class with string value "ABC DEF" in uppeer case and the old string class object with string value "abc def" which str1 originally referred to is now lost in RAM memeory.




so System.out.println(str1) still displays "ABC DEF" in upper case.

we would get same result for str1.toUpperCase() and str1=str1.toUpperCase() even if the string class object was created on heap memory instead of string pool memory because the string class object whether created on heap or on string pool memory is immutable.








*/


 class Pgm1
{
	 String str1,str2;
	 
	 void opns() 
	 {
		 str1="abc def";
		 str2="abc def";
		 
		 if(str1==str2)
			 System.out.println("\n str1 and str2 refer to same object of string class on string pool memory with string value abc def");
		 
		 else
			 System.out.println("\n str1 and str2 refer to different objects of string class on string pool memory");
		 
		 
		 str1=new String("abc def");
		 str2=new String("abc def");
		 
		 if(str1==str2)
			 System.out.println("\n str1 and str2 refer to same object of string class on heap memory with string value abc def");
		 
		 else
			 System.out.println("\n str1 and str2 refer to different objects of string class on heap memory with string value abc def");
		 
		 
		 char arr[]= {'a','b','c'};
		 
		 str1=new String(arr);
		 str2=new String(arr,1,2);
		 
		 System.out.println("\n 1st string is "+str1+"\n 2nd string is "+str2);
		 
		 
	 
		 
	 }
	
	 
	 void immutable()
	 {
		 str1="abc def";
		 str1.toUpperCase();
		 
		 System.out.println("\n"+str1);
		 
		 str1="abc def";
		 str1=str1.toUpperCase();
		 
		 System.out.println("\n"+str1);
		 
		 
		 
	 }
	 
	 public static void main(String[] args) {
		Pgm1 p1=new Pgm1();
		p1.opns();
		p1.immutable();
		
	}
	 
	
}
