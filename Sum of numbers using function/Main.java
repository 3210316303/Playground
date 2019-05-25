import java.util.Scanner;
class Main
{
    public static int number(int sum)
    {
     int i,x=0;
      for(i=1;i<=sum;i++)
      {
       x=x+i;
      }
      return x;
    }
	public static void main (String[] args)
    {
	 Scanner s=new Scanner(System.in);
      int n,sum;
      n=s.nextInt();
      sum=number(n);
      System.out.println(sum);
	}
}