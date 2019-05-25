import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
     int fact=1,i,n;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      for(i=1;i<=n;i++)
      {
       fact=fact*i;
      }
     System.out.println(fact);
    }
}