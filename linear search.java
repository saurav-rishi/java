 
import java.util.*;
public class linearsearch {

	public static void main(String[] args) 
	{

		n=in.nextInt();
    a = new int[100];
    d=in.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			if(a[i]==d)
			{

				j=i;
			}
		}
		System.out.print(d+" " +"occured" +" " + "at"+" " + j);

	}

}