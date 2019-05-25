import java.util.Scanner;
class Main
{
  public static int prime(int n)
  {
    int i,j,fact;
    for(i=1; i<=n; i++)
    {
       fact=0;
        for(j=1; j<=n; j++)
        {
            if(i%j==0)
                fact++;
        }
        if(fact==2)
           System.out.println(i);
    }
    return 0;
    
  }
  
	public static void main (String[] args)
    {
	   Scanner s=new Scanner(System.in);
      int m;
      m=s.nextInt();
      int primee=prime(m);
      
	}
}