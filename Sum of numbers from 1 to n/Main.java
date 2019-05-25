import java.util.Scanner;
class Main 
{
	public static void main (String[] args)
    {
      Scanner s=new Scanner(System.in);    
	 int n,sum=0,i;
     n=s.nextInt();
        for(i=0;i<=n;i++)
        {
         sum=i+sum;
        }
      System.out.println(sum);
     }
	}
