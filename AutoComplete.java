package javaAssignment;
import java.io.*;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.io.InputStreamReader;



 class AutoCmpltMrGitHub {


 
 
 	public static void main(String args [])throws IOException
 	{
 		InputStreamReader isr = new InputStreamReader(System.in);
 		BufferedReader br= new BufferedReader(isr);
 		System.out.print("Enter the string: ");
 		String s= br.readLine();
 		ArrayList<String> a=new ArrayList<>();
 		a.add("This");
 		a.add("is");
 		a.add("the");
 		a.add("program");
 		a.add("by");
 		a.add("Shailender");
 		a.add("Kumar");
 		
 		StringTokenizer st=new StringTokenizer(s);
 		int k=0;
 		while(st.hasMoreTokens())
 		{
 			String sr=st.nextToken().toLowerCase();
 			if(a.contains(sr))
 			{
 				if(k==0)
 				{
 					sr=sr.substring(0,1).toUpperCase()+sr.substring(1);
 					k++;
 				}
 				System.out.print(sr+" ");
 			}
 			else
 			{
 				int check=0;
 				for(int i=0; i<a.size(); i++)
 				{
 					int match =0;
 					String ss=a.get(i);
 					if(ss.length() == sr.length())
 					{
 						for(int j=0; j<ss.length(); j++)
 						{
 							if(ss.charAt(j)==sr.charAt(j))
 								match++;
 						}
 						if(match>=(sr.length()/2))
 						{
 							check++;
 							if(k==0)
 							{
 								sr=sr.substring(0,1).toUpperCase()+sr.substring(1);
 								k++;
 							}
 							System.out.print(sr+" ");
 						}
 					}
 				}
 				if(check==0)
 				{
 					a.add(sr);
 				}
 			}
 			
 		}
 		System.out.println("\n\n The Updated Dictionary is");
 		Iterator it=a.iterator();
 		while(it.hasNext())
 		{
 			System.out.print(it.next()+",");
 		}
 	}
 }
