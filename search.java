package assignment1;
import java.util.*;
public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=1;
		char ch;
		String str;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string:");
		str=s.nextLine();
		System.out.println("Enter character to search:");
		ch=s.next().charAt(0);
		for(int i=0;i<str.length();i++)
		{
			if(ch==str.charAt(i))
			{
				flag=0;
				break;
			}
		}
		if(flag==0)
			System.out.println("Character "+ch+" is present in "+str);
		else
			System.out.println("Character "+ch+" is not present in "+str);
	}

}
