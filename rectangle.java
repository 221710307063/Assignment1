package assignment1;
import java.util.*;
class Area {
	int l,b;
	public int setvalue()
	{
		b=10;
		return b;
	}
	public void calc(int l,int b) 
	{
		System.out.println("Area :"+l*b);
	}
}
public class rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a;
		int length,breath;
		Scanner s=new Scanner(System.in);
		a=new Area();
		System.out.println("Enter length:");
		length=s.nextInt();
		breath=a.setvalue();
		a.calc(length, breath);
	}

}
