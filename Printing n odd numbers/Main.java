import java.util.Scanner;
class Main {
	public static void main (String[] args) 
    {
	 Scanner s=new Scanner (System.in);
      int n,i,j;
      n=s.nextInt();
      for(i=1,j=1;j<=n;i+=2,j++)
      {     
        System.out.println(i);
      }
   }
}