import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	 Scanner s=new Scanner(System.in);
      int n,l,r=0;
      n=s.nextInt();
      //l=n%10;
      while(n>0)
      {
       l=n%10;
        r=r*10+l;
        n=n/10;
      }
      r=(r/10)%10;
      //a=f+l;
      System.out.println(r);
	}
}