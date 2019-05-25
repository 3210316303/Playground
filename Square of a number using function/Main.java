import java.util.Scanner;
class Main
{
    public static int square(int sqa)
    {
     int a=sqa*sqa;
      return a;
    }
	public static void main (String[] args)
    {
	 Scanner s=new Scanner(System.in);
      int a,n;
      n=s.nextInt();
      a=square(n);
        System.out.println(a);

	} 
}