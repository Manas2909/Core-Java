//FILE HANDLING

/*
Wriate and read data from the file using the FileOutputStream and FileInputStream class
*/

import java.io.*;

/*
all the predefined classes of file handling belong to the java.io package.

so we need to write this import statement

*/



class File1
{
	File f=new File("d:\\vihaan.txt");

	/*
		here File is a predefined class in java.io package. here we have  created the object of File class. here if the file with the name vihaan.txt is not existing on d drive, then no new file is created for you with that name and f just refers to the object of the File class with the path "d:\\vihaan.txt"stored in it.

	If the file named vihaan.txt is actually existing on d drive, then the f reference variable of File class will refer to that file though the object of the File class.

	*/

	void create1()throws IOException
	{
		if(!f.exists())
		f.createNewFile();

/*exists() is a  non  static method of File class and if the file represented by f actually exists here it returns true and because we have applied the boolean complement operator so true becomes false and hence no new file is created again and if the file represented by f is not existing, f.exists() returns false and the result of that if statement after applying ! qill be true and then only the body of the if block will enter and the new file is created.

so it saves the execution time

*/ 
/*here createNewFile() is a non static method of File class and here if the file represented by f i.e vihaan.txt is not existing on d drive then a newfile with the name vihaan.txt  is actually creatd on the d drive and createNewFile() returns true value.

But if the file was already exisisting at the location then createNewFile() wont create again a new file for you and will return false value.

The predefined methods of the predefined classes need for file handling may cause a compile time exception to occur called as IOException which must be compulsarily handled or declared in the method body of the pgm where these predefined file handling methods are called else we get a compiler error

*/

	}


	void write1()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		FileOutputStream fos=new FileOutputStream(f,true);

/*
here FileOutputStream class is a predefined class of java.io package. It is the lowest level class used for writing data to the file.

here the FileOutputStream is an byte output stream used to write the data into the file character by character and because it is a byte stream the internal data transfer is in form of bytes.
All the classes whose name ends with the word Stream are byte streams.

here we are going to use fos to write data character by character into the file represented by f because f is directly passed as the 1st argument into the constructor of FileOutputStream class.

If the file represented by f is not existing on hard disk, then the constructor of the FileOutputStream class called in the above code statement will create a new file on hard disk for you with the same name vihaan.txt on d drive.

and the new file will be opened in write mode and the new contents will be writen from the start of the file character by character in sequntial order.


But if the file represented by f is already existing on hard disk, then no new file is created but the constructor of the FileOutputStream called in the above step will open the already existing file in the append mode because we have passed true as the 2nd argument to the constructor of FileOutputStream class means the existing contents of the file wont be emptied when the file is opened and the new contents will be written at the end of the existing contents of the file because we have passe true as the 2nd argument to the constructor of the FileOutputStream.

if we dont pass anything as the 2nd argument then by default the 2nd argument passed is false and then if the file representd by f is already exisitng on hard disk, the existing contents of the file will be emptied and the new contents will be written from the start of the file.

*/


		char ch=' ';

		while((ch=(char)(br.read()))!='&')
		{
			fos.write(ch);

		}

/*
here read is a non static method of the BufferedReader class and it reads a single character from the keyboard and returns its unicode value in int format and before assigning it to the char variable ch we are converting it into the char data type through explicit conversion and then we are comparing the value of ch accepted from user with the & character and if the value of ch is not & then the value of the variable ch is written into the file represented by fos.


write() is a predefined non static member method of the FileOutputStream classto write the character into the file at the location pointed to by fos and then when the character is written into the file,fos is automatically moved forward to the next location in the file where the data is to be written

and if the character entered from the keyboard was &, then the while loop will terminate and the character wont be stored into the file
*/


		fos.close();

//closes the file in write mode

	}


	void read1()throws IOException
	{
		FileInputStream fis=new FileInputStream(f);

/*
here FileInputStream class is a lowest level input stream class and it is also a byte input stream and it reads the data character by character from the file sequentially from the start of the file.

here if the file represented by f is not existing on hard disk then the constructor of the FileInputStream class wont create a new file for you and we get an exception during the execution of the java pgm.


if the file represented by f is already existing on hard disk, then the file is opened in read mode and the data is read character by character using fis from the start of the file

*/

		int ch=0;


		while((ch=fis.read())!=-1)
		{
			System.out.print((char)ch);

		}

/*
here read is a non static member method of FileInputStream class whihc reads a single character from the file at the location pointed to by fis in the file and returns the unicode value of the character read from the file and compares it with -1 which is the unicode value for the end of file character.

if the unicode value of the character read from the file is not -1 then we are displaying the character on screen in character format only by converted the unicode value stored in ch into the char data type through explicit type casting.

*/

		fis.close();

//closes the file in read mode

	}


	public static void main(String args[ ])throws IOException
	{
		File1 f1=new File1();

		f1.create1();

		f1.write1();

		f1.read1();

	}

}		