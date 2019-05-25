import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	Scanner s=new Scanner(System.in);
      int n,i;
      n=s.nextInt();
      for(i=1;i<=n;i+=2)
      {
        System.out.println(i);
     }
    }
 }