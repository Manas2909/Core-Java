/*
 * Properties class is the subclass ofthe Hashtable class.
 * 
 * In a java pgm of there are constantly changing values like username,password
 * etc then we cannot hardcode these values in the java pgm because everytime
 * they change the pgm needs to be recompiled,redeployed and reloaded and then'executed.
 * 
 * so to avoid all this we use the Properties class which stores the attributes
 * with constantly changing values as a set of properties inside a file on hard disk
 * where each property has a name and a value in String format.,
 * 
 */

import java.util.*;

import java.io.*;

class Properties1
{
	void opns()throws IOException
	{
		Properties p=new Properties();
		
		File f=new File("d:\\jyoti11.txt");
		
		/*
		 * File class is a predefined class of java.io package.
		 * 
		 * here in the above statement where we are creating the object
		 * f of File class if there is no file with the name as jyoti11.txt on d drive
		 * then the above constructor of File class into which we have passed the
		 * filepath as the argument, will not create a new file with the name as
		 * jyoti11.txt on d drive.
		 * 
		 * and instead it just creates an object of File class f and maps it 
		 * tothe path with name as d:\jyoti11.txt
		 * 
		 * and if there is already a file named jyoti11.txt on d drive, then the 
		 * above constructor of File class will map the object f to the file on the
		 * hard disk.
		 */
		
		FileOutputStream fos=new FileOutputStream(f);
	/*
	 * here FileOutputStream class is a predefined class of java.io package
	 * and its object fos is used to write the data into the file and the FileOutputStream
	 * class is a byte stream because its name ends with the word Stream and 
	 * so the internal data transfer into the file represented by f which is d:\\jyoti11.txt
	 * is in form of bytes.
	 * 
	 * If the file represented by f is not existing on hard disk, then the
	 * above constructopr FileOutputStream classwill create a new file on hard disk
	 * with the name as jyoti11.txt on d drive. and then we can use fos
	 * to write data into the file.
	 * 
	 * and if there is already a file names as jyoti11.txt on d drive which is
	 * associated with the Fileclass object f then the above constructor of
	 * FileOutputStream class wont create a new file again with that name on d drive
	 * and instead it will open it in write mode and empty the contents of the
	 * already existing file and then whatever data we write into the file
	 * represented by f using fos is written from the start of the file.
	 *
	 *FileOutputStream fos=new FileOutputStream(f,true);
	 *
	 *here if the file represented by f is existing on hard disk, then because
	 *we have mentioned true as the 2nd argument to the FileOutputStream class
	 *constructor so the file is opened in append mode and the contents of the file
	 *represented by f are not emptied and fos writes data from the end of the file
	 *f.
	 */
		
		p.setProperty("name", "kaveesh nadkarni");
		p.setProperty("age", "29");
		p.setProperty("occupation", "IT teacher");
		
		/*
		 * setProperty is a non static member method of the Properties class
		 * and here using the 3 above setProperty() statement on p, we have
		 * added 3properties to p with names as name,age and occupation and their values
		 * as kaveesh nadkarni,29 and IT teacher resp where the name and the value of
		 * each property passed as the 1st and 2nd argument to the setProperty() method
		 * of Properties class must be always in String format else we get a compilererror
		 */
		p.store(fos, "PROPERTIES OF TEACHER");
		
		/*
		 * store() is a non static member method of the Properties class and
		 * here p.store(fos,"PROPERTIES OF TEACHER") will store all the 3 
		 * properties added to p in the p.setProperty() method called 3times
		 * with the names and values of the properties into the file represented
		 * by fos i.e d:\jyoti11.txt and along with that we have to specify
		 * ]a comment in String format as the 2nd argument to the store()methodf
		 * and this comment is also stored in the file represented by fos along with
		 * the properties of p
		 */
		
		fos.close();
		//closes the file in write mode
		
		
		Properties p1=new Properties();
		
		FileInputStream fis=new FileInputStream(f);
		
		/*
		 * FileInputStream class is a predefined class of java.io package
		 * 
		 * and it is a byte input stream class to read the data from the file.
		 * 
		 * and because it ends with word Stream so it is a byte stream and so
		 * the internal data transfer while reading using fois from the file is
		 * in form of bytes.
		 * 
		 * here if the file represented by f is not existing on hard disk, then
		 * 'the above constructor of the FileInputStream class wont create
		 * a new fileforyou and instead give a runtime exception.
		 * 
		 * 
		 */
		
		p1.load(fis);
		
		/*
		 * loads all the properties with their names and values into the object
		 * p1 of the Properties class from the file represented by fis i.ed:\jyoti1.txt
		 * 
		 * load() isa  predefined non static member method of Properties class
		 */
		
		Enumeration e=p1.propertyNames();
		
		/*
		 * here propertyNames() is a non static member method of Properties class
		 * and p1.propertyNames() returns the names of all the properties loaded
		 * into p1 using the p1.load(fis).
		 * 
		 * and these propery names are returne din form of a collection and 
		 * the p1.propertyNames() also returns an implicit object of Enumeration
		 * interface e to access these property names of the collection.
		 * 
		 * here we are not allowd to mention any generic type for eobject
		 * of Enumeration interface.
		 */
		
		System.out.println("\n The property names with values are ");
		
		while(e.hasMoreElements())
		{
			String name=(String)(e.nextElement());
			
			/*
			 * name variables stores the property name returned by e.nextElement()
			 * where e is associated with the object p1 opf the Properties class
			 */
			String value=p1.getProperty(name);
			
			/*
			 * getProperty() is a non static member method of Properties class
			 * and p1.getProperty(name) returns the value of the property in String format whose
			 * name is stored in the variable name
			 */
			
			System.out.println("\n\n\nName="+name+"\nValue="+value);
			
		}
	}
	
	public static void main(String args[])throws IOException
	{
		Properties1 t1=new Properties1();
		t1.opns();
	}
}
