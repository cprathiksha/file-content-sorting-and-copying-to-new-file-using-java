
import java.util.Scanner;
import java.io.*;
class sort_file
{
	public static void main(String args[]){
		try
		{
			String str="",dest;
			Scanner sc=new Scanner(System.in);
			FileReader file2=new FileReader("test.txt");
			BufferedReader br=new BufferedReader(file2);
			System.out.println("Enter Destination file name to copy the contents from test.txt file :");
			dest=sc.next();
			FileWriter file1=new FileWriter(dest+".txt");
		  
			while((str=br.readLine())!=null)
			{

				char str1[]=str.toCharArray(); //creating char array str1[] of same length as of str string
				for(int i=0;i<str.length();i++)
				{
					for(int j=i+1;j<str.length();j++)
					{
						if(str1[i]>str1[j]) 
						{
							char temp=str1[i];
							str1[i]=str1[j];
							str1[j]=temp;
						}
					}
				}
				String str2=String.valueOf(str1); //convert the str1 to string, and assiging to str2 
				str1=str2.toCharArray(); //convert the str2 in to sequence of character

				for(int i=0;i<str2.length();i++)
				{
					file1.write(str1[i]);
				}
				file1.write("\n");

			}
		System.out.println("\n Sorted and copied to "+(dest+".txt")+" file");
			file1.close();
			file2.close();
			br.close();
		}
		catch(IOException e)
		{
			System.out.println("Error occured, given file name dose not exist..");
		}

	}
}