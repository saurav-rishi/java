import java.util.*;
public class sortwithoutbubblesort {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i,j,c=0,a[],n,t;
		n=in.nextInt();
		a = new int[n];

		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
	     Arrays.sort(a);
		for(i=0;i<n;i++)
		System.out.print(a[i]+" ");


	}

}